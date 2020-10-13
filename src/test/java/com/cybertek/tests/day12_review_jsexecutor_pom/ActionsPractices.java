package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {

    /*
    TC #16: Double Click Test
    1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
    2. Switch to iframe.
    3. Double click on the text “Double-click me to change my text color.”
    4. Assert: Text’s “style” attribute value contains “red”.
     */
    @Test
    public void p2_double_click_test(){

        //1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        // 2. Switch to iframe.
        Driver.getDriver().switchTo().frame("iframeResult");

        //3. Double click on the text “Double-click me to change my text color.”
        WebElement textToDoubleClick = Driver.getDriver().findElement(By.id("demo"));

        //Creating actions instance to be able to use methods that come with it
        Actions actions = new Actions(Driver.getDriver());

        //Using actions instance, and doubleClick method to doubleCLick
        actions.doubleClick(textToDoubleClick).perform();

        //4. Assert: Text’s “style” attribute value contains “red”.
        String expected = "red";
        String actual = textToDoubleClick.getAttribute("style"); //color: red;

        Assert.assertTrue(actual.contains(expected));

    }

    @Test
    public void p3_drag_and_drop(){
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //2. Drag and drop the small circle to bigger circle.
        //3. Assert:
        //-Text in big circle changed to: “You did great
    }


}

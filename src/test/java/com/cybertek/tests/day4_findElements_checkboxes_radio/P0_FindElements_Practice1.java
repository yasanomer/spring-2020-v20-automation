package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class P0_FindElements_Practice1 {
    public static void main(String[] args) {

        //TC #0: FINDELEMENTS
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        
        //3. Print out the texts of all links
        //4. Print out how many total link

    }
}

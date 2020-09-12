package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class P2_MerriamWebster_Links {
    public static void main(String[] args) {
        //TC #2: FINDELEMENTS
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");
        // 3. Print out the texts of all links
        //4. Print out how many link is missing text
        //5. Print out how many link has text
        //6. Print out how many total link
    }
}

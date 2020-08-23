package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_EtsyTitleVerification {

    public static void main(String[] args) {

        //TC #5: Etsy Title Verification
        //1. Open Chrome browser
        //2. Go to https://www.etsy.com

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com");

        //3. Search for “wooden spoon”
        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”

    }

}

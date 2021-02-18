package com.w3Schools;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/alexeypaletsky/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_all");




        driver.quit();
    }


}

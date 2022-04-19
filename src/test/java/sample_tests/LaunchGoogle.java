package sample_tests;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchGoogle {
    public static void main(String[] args) {
        FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.javatpoint.com/");
        System.out.println("Page title is " + driver.getTitle());
    }
}

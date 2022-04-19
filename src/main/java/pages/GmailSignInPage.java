package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 */
public class GmailSignInPage {
    private static WebElement element = null;

    public static WebElement googleLogo(WebDriver driver) {
        try {
            Thread.sleep(1000);
            element = driver.findElement(By.id("logo"));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        return element;
    }

    public static WebElement headingText(WebDriver driver) {
        try {
            Thread.sleep(1000);
            element = driver.findElement(By.id("headingText"));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        return element;
    }

    public static WebElement headingSubtext(WebDriver driver) {
        try {
            Thread.sleep(1000);
            element = driver.findElement(By.id("headingSubtext"));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        return element;
    }

    public static WebElement identifierId(WebDriver driver) {
        try {
            Thread.sleep(1000);
            element = driver.findElement(By.id("identifierId"));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        return element;
    }

    public static WebElement forgotEmail(WebDriver driver) {
        try {
            Thread.sleep(1000);
            element = driver.findElement(By.xpath("//button[text()='Forgot email?']"));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        return element;
    }

    public static WebElement next(WebDriver driver) {
        try {
            Thread.sleep(1000);
            element = driver.findElement(By.xpath("//span[text()='Next']"));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        return element;
    }
}

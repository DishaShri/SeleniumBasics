package sample_tests;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.GmailSignInPage;

public class GmailSignInTest {

    public static void main(String[] args) {
        String gmailSignInPageUrl = "https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
        FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
        WebDriver driver = new FirefoxDriver();
        driver.get(gmailSignInPageUrl);

        try {
            assert GmailSignInPage.googleLogo(driver).isDisplayed();
            assert GmailSignInPage.headingText(driver).getText() == "Sign In";
            assert GmailSignInPage.headingSubtext(driver).getText() == "Use your Google Account";
            assert GmailSignInPage.identifierId(driver).isDisplayed();
            assert GmailSignInPage.forgotEmail(driver).isDisplayed();
            assert GmailSignInPage.forgotEmail(driver).getText() == "Forgot Email?";
            assert GmailSignInPage.next(driver).getText() == "Next";
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        driver.quit();
    }
}

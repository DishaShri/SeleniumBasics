package testngTests;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.GmailSignInPage;

public class TestGmailSignIn {
    public static WebDriver driver = null;

    @BeforeTest
    void setup() {
        String gmailSignInPageUrl = "https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
        FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
        driver = new FirefoxDriver();
        driver.get(gmailSignInPageUrl);
    }

    @Test
    void testGoogleLogo() {
        assert GmailSignInPage.googleLogo(driver).isDisplayed();
    }

    @Test
    void testHeadingText() {
        assert GmailSignInPage.headingText(driver).isDisplayed();
        assert GmailSignInPage.headingText(driver).getText().equals("Sign In");
    }

    @Test
    void testHeadingSubtext() {
        assert GmailSignInPage.headingSubtext(driver).isDisplayed();
        assert GmailSignInPage.headingSubtext(driver).getText().equals("Use your Google Account");
    }

    @Test
    void testIdentifier() {
        assert GmailSignInPage.identifierId(driver).isDisplayed();
    }

    @Test
    void testForgotEmail() {
        assert GmailSignInPage.forgotEmail(driver).isDisplayed();
        assert GmailSignInPage.forgotEmail(driver).getText().equals("Forgot Email?");
    }

    @Test
    void testNext() {
        assert GmailSignInPage.next(driver).isDisplayed();
        assert GmailSignInPage.next(driver).getText().equals("Next");
    }

    @AfterTest
    void cleanup() {
        driver.quit();
    }
}

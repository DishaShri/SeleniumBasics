import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyGmailSignInPage {

    public static void main(String[] args) {
        String gmailSignInPageUrl = "https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
        FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
        WebDriver driver = new FirefoxDriver();
        driver.get(gmailSignInPageUrl);

        try {
            WebElement googleLogo = driver.findElement(By.id("logo"));
            assert googleLogo.isDisplayed();

            WebElement headingText = driver.findElement(By.id("headingText"));
            assert headingText.getText() == "Sign In";
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        driver.quit();
    }
}

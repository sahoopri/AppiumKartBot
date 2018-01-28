package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage{

    By userId = By.id("mobileNo");
    By password = By.id("et_password");
    By login_Button = By.id("btn_mlogin");
    By existingUser_login = By.id("btn_mlogin");

    public LoginPage(WebDriver driver){
        super (driver);
    }

    public LoginPage invalidLogin(){
        waitForVisibilityOf(existingUser_login);
        driver.findElement(existingUser_login).click();
        driver.findElement(userId).clear();

        driver.findElement(By.xpath("//*[contains(@text,'NONE OF THE ABOVE')]")).click();

        driver.findElement(userId).sendKeys("abc");
        driver.findElement(password).sendKeys("123");
        driver.findElement(login_Button).click();
        Assert.assertTrue(driver.findElement(By.id("pageLevelError")).getText().equalsIgnoreCase("Please enter valid Email ID/Mobile Number"));
        return new LoginPage(driver);
    }

}

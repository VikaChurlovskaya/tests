package test.vika.churlovskaya.signin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.vika.churlovskaya.login.Login;

public class Sing{
    private WebDriver driver;
    /**
     * Вход
     */
     @FindBy(linkText = "Sign in")
     private WebElement sign;
    public Sing(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public Login clickToSign(){

        System.out.println(driver.getTitle());
        sign.click();
        return new Login(driver);


    }


}

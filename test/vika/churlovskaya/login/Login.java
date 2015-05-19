package test.vika.churlovskaya.login;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.vika.churlovskaya.home.HomeGit;

public class Login {
    private static final Logger log = Logger.getLogger(Login.class);
    private WebDriver driver;
    /**
     * Логин
     */
    @FindBy(id = "login_field")
    private WebElement login;

    /**
     * Пароль
     */
    @FindBy(id = "password")
    private WebElement password;

    /**
     * Кнопка подтвердить
     */
    @FindBy(name = "commit")
    private WebElement bCommit;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public HomeGit confirmLogin(String user, String pass){
        log.info("ddd");
        login.sendKeys(user);
        password.sendKeys(pass);
        bCommit.click();
        return new HomeGit(driver);
    }
}

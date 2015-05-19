package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import test.vika.churlovskaya.create.Inputs;
import test.vika.churlovskaya.signin.Sing;

public class NewTestClass {
    private WebDriver driver;
    @Test
    public void isCreateRepo() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://github.com");
        Sing FirstInit = new Sing(driver);
        FirstInit.clickToSign().confirmLogin("VikaChurlovskaya", "churlovskaya13").goToCreateRep().inputRepName().createRepForName();
        Assert.assertTrue(new Inputs(driver).isConfirmCreateRepo());
    }


}

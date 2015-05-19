package test.vika.churlovskaya.create;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.UUID;

public class Inputs {
    private WebDriver driver;
    /**
        Repname
     */
    @FindBy(id = "repository_name")
    private WebElement fRepName;
    /**
     submit create
     */
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement bRepSubmit;
    @FindBy(className = "copyable-terminal-content")
    private  WebElement readmeLink;
    public Inputs(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public Inputs inputRepName(){
        fRepName.sendKeys("NewRep"+randStr());
        return new Inputs(driver);
    }
    public void createRepForName(){
        bRepSubmit.click();

    }
    private String randStr(){
        return UUID.randomUUID().toString();
    }
    private String getRecommendTextAfterCreate(){
       return readmeLink.getText().toString();
    }
    public boolean isConfirmCreateRepo(){
        System.out.println(getRecommendTextAfterCreate());
        return getRecommendTextAfterCreate().contains("init");
    }


}

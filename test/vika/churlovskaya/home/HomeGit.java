package test.vika.churlovskaya.home;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.vika.churlovskaya.create.Inputs;


public class HomeGit {
    private static final Logger log = Logger.getLogger(HomeGit.class);
    private WebDriver driver;
    /**
     * Create New Repository
     */
    @FindBy(linkText = "New churlovskaya")
    private WebElement bNewRepository;

    public HomeGit(WebDriver driver) {
        log.info("Constructor init HomeGit");
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public Inputs goToCreateRep()
    {
        if (log.isDebugEnabled()){
            log.debug("click to create new repo");
        }
        bNewRepository.click();
        return new Inputs(driver);
    }
}

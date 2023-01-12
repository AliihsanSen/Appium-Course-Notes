package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import javax.xml.bind.Element;

public class n11Pages {

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public n11Pages(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver);
    }
}

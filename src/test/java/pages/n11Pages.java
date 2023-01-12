package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import javax.xml.bind.Element;
import java.time.Duration;

public class n11Pages {

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public n11Pages(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }
}

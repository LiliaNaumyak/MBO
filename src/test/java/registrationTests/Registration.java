package registrationTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Registration {

    WebDriver webDriver;

    @Before
    public void setUp() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
    }

    @Test
    public void validLogIn (){
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        webDriver.get("");
        webDriver.findElement(By.id("auth-tip-link")).click();

        //Assert.assertTrue("... is not present", isAvatarPresent());
    }

    @After
    public void tearDown (){
        webDriver.quit();
    }

    private boolean isAvatarPresent (){
        try {
            return webDriver.findElement(By.id("jbj")).isDisplayed();
        } catch (Exception e){
            return false;
        }
    }
}

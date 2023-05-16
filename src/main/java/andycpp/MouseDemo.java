package andycpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","D:\\driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.baidu.com/");

        driver.manage().window().maximize();

        WebElement search_setting = driver.findElement(By.id("s-usersetting-top"));
        Actions action = new Actions(driver);
        action.clickAndHold(search_setting).perform();

        //driver.quit();
    }

}

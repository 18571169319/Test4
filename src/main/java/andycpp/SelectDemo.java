package andycpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","D:\\driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.baidu.com");

        driver.findElement(By.xpath("//*[@id=\"s-usersetting-top\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"s-user-setting-menu\"]/div/a[1]/span")).click();
        Thread.sleep(2000);

     /*   //<select>标签的下拉框选择
        WebElement el = driver.findElement(By.xpath("//select"));
        Select sel = new Select(el);
        sel.selectByValue("20");
        Thread.sleep(2000);*/

        driver.quit();
    }
}

package andycpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class AlertDemo {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.edge.driver","D:\\driver\\msedgedriver.exe");
            WebDriver driver= new EdgeDriver();
            driver.get("https://www.baidu.com");
            //保存设置
            driver.findElement(By.xpath("//*[@id=\"s-usersetting-top\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"s-user-setting-menu\"]/div/a[1]/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.className("prefpanelgo")).click();
            //接收弹窗
            driver.switchTo().alert().accept();
            Thread.sleep(2000);
            driver.quit();
        }
    }

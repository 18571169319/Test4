package andycpp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class BrowserGo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","D:\\driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //get 到百度首页
        driver.get("https://www.baidu.com/");
        System.out.printf("now accesss %s \n", driver.getCurrentUrl());
        Thread.sleep(2000);

        //点击“新闻” 链接
        driver.findElement(By.linkText("新闻")).click();
        System.out.printf("now accesss %s \n", driver.getCurrentUrl());
        Thread.sleep(2000);

        //执行浏览器后退
        driver.navigate().back();
        System.out.printf("back to %s \n", driver.getCurrentUrl());
        Thread.sleep(2000);

        //执行浏览器前面
        driver.navigate().forward();
        System.out.printf("forward to %s \n", driver.getCurrentUrl());
        Thread.sleep(2000);

        driver.quit();
    }
}

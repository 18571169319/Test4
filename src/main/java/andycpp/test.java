package andycpp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class test {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","D:\\driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.baidu.com");
        String title = driver.getTitle();
        System.out.printf(title);

}}

package andycpp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class BaiduDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","D:\\driver\\msedgedriver.exe");

        WebDriver driver= new EdgeDriver();

        driver.get("https://www.baidu.com/");

/*        WebElement search_text = driver.findElement(By.id("kw"));
        WebElement search_button = driver.findElement(By.id("su"));

        search_text.sendKeys("Java");
        search_text.clear();

        search_text.sendKeys("Selenium");
        search_button.click();*/
        //获得百度输入框的尺寸
        WebElement size = driver.findElement(By.id("kw"));
        System.out.println(size.getSize());
        System.out.println("==================");

        //返回百度页面底部备案信息
        WebElement text = driver.findElement(By.className("s-bottom-layer-content"));
        System.out.println(text.getText());
        System.out.println("==================");

        //返回元素的属性值， 可以是 id、 name、 type 或元素拥有的其它任意属性
        WebElement ty = driver.findElement(By.id("kw"));
        System.out.println(ty.getAttribute("type"));
        System.out.println("==================");

        //返回元素的结果是否可见， 返回结果为 True 或 False
        WebElement display = driver.findElement(By.id("kw"));
        System.out.println(display.isDisplayed());

        driver.quit();
    }
}

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class App {
    public static void main(String[] args) throws Exception {
        String[] user = { "John", "Doe", "01/01/1991", "123 ABC Lane", "12345", "New York", "NY",
                "5551234567", "test@example.com", "ReallGoodPassword.123" };

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://practicesoftwaretesting.com/#/");

        driver.findElement(By.linkText("Sign in")).click();

        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // driver.findElement(By.linkText("Register your account")).click();

        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // List<WebElement> inputs = driver.findElements(By.tagName("input"));
        // for (int i = 0; i < inputs.size(); i++) {
        // inputs.get(i).sendKeys(user[i]);
        // }
        // Select select = new Select(driver.findElement(By.tagName("select")));
        // select.getOptions();
        // select.selectByValue("US");

        // driver.findElement(By.className("btnSubmit")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("email")).sendKeys(user[8]);
        driver.findElement(By.id("password")).sendKeys(user[9]);
        driver.findElement(By.className("btnSubmit")).click();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
        driver.findElement(By.linkText("Home")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("/html/body/app-root/div/app-overview/div[3]/div[1]/div[2]/ul/div[1]/label/input")).click();
        driver.findElement(By.tagName("input")).sendKeys("asdfasf");
        driver.findElement(By.className("btn")).click();
    }
}

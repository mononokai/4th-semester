import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class App {
    public static void main(String[] args) throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String[] usernames = driver.findElement(By.id("login_credentials")).getText().split("\n");

        String[] password = driver.findElement(By.className("login_password")).getText().split("\n");

        driver.findElement(By.id("user-name")).sendKeys(usernames[1]);
        driver.findElement(By.id("password")).sendKeys(password[1]);
        driver.findElement(By.id("login-button")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.linkText("About")).click();
        driver.navigate().back();

        WebElement sortSelect = driver.findElement(By.className("product_sort_container"));
        Select sortBy = new Select(sortSelect);
        sortBy.selectByValue("hilo");

        List<WebElement> adds = driver.findElements(By.className("btn_inventory"));
        adds.get(0).click();
        adds.get(1).click();

        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Joe");
        driver.findElement(By.id("last-name")).sendKeys("Dirt");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        driver.findElement(By.id("back-to-products")).click();
    }
}

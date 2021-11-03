import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Deneme {

@Test
public static void main(String[] args) throws InterruptedException {
    System.setProperty("webDriver.chrome.driver", "Drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("http://fb.com");
    driver.findElement(By.id("email")).sendKeys("syntax@adfas.com");
    driver.findElement(By.id("pass")).sendKeys("syntax123");
    driver.findElement(By.name("login")).submit();
    Thread.sleep(2000);
    //driver.findElement(By.linkText("Forgot Password?")).click();
    driver.findElement(By.partialLinkText("Forgot")).click();
    driver.quit();
}


}

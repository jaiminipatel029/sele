package Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser1
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\software\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        driver.close();
    }
}

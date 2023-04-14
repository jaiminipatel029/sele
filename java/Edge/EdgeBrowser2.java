package Edge;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser2
{
    public static void main(String[] args)
    {
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

    }
}

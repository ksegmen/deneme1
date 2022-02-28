import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01 {

     static WebDriver driver;
     @BeforeClass
     public static void setUp(){
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         driver.manage().window().maximize();





     }
    @AfterClass
    public static void teardown() {
        driver.close();
    }



     @Test
     public static void test01() {

driver.get("https://www.amazon.com.tr");
// // Ana sayfanın açıldıgı kontrol edin

      String expectedTitle = "Amazon";
          String actualTitle=driver.getTitle();
          Assert.assertTrue(actualTitle.contains(expectedTitle));
     }




}

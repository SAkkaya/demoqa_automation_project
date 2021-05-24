import com.sun.java.swing.plaf.windows.WindowsDesktopManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {

    protected WebDriver driver;  // instance variable
    PracticeFormPage practiceFormPage;   // instance variable

    @BeforeAll
    public void setUp(){
        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");  driver clasoru olsaydi boyle olurdu
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        System.out.println("Test initited");
        practiceFormPage = new PracticeFormPage(driver);


    }


    @AfterAll
    public void tearDown() throws InterruptedException {
       Thread.sleep(4000);
        driver.close();  // close ilgili sayfa   --> quit butun pageleri kapatir
        // driver.quit();
            System.out.println("Test finished");

    }


}

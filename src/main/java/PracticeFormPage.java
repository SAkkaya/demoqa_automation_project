import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage {

    private WebDriver driver;
    private final By name = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By email = By.id("userEmail");


    public PracticeFormPage(WebDriver driver){  //Constructor create
        this.driver = driver;
    }


//    public void setName(String nameAsString){
//        WebElement nameSpace = driver.findElement(name);
//        nameSpace.click();
//        nameSpace.sendKeys(nameAsString);
//        System.out.println(nameAsString);
//
//    }

    public void setName(String name){
        WebElement nameSpace = driver.findElement(this.name);
        nameSpace.click();
        nameSpace.sendKeys(name);
        System.out.println(name);

    }


    public void setLastName(String lastNameAsString){
        WebElement nameSpace = driver.findElement(lastName);
        nameSpace.click();
        nameSpace.sendKeys(lastNameAsString);
        System.out.println(lastNameAsString);
    }

    public void setEmail(String emailAddress){
        WebElement nameSpace = driver.findElement(email);
        nameSpace.click();
        nameSpace.sendKeys(emailAddress);
        System.out.println(emailAddress);
    }



}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Dan Capps
* 8.10.18
* appsbycappsdemo.java
* This program runs a Selenium WebDriver test which will demonstrate the functionality of my digital portfolio at appbycapps.com
*/

public class appsbycappsdemo {
    public static void main(String[] args) throws InterruptedException {

        //Open Google Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Navigate to website
        driver.get("http://appsbycapps.com");
        Thread.sleep(2000);

        //Run through the website
        driver.findElement(By.name("whoiam")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("whatido")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("whattheysay")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("howican")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("whoknowsme")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("contact")).click();
        Thread.sleep(3000);

        //Scrum Master certification and back to Main page
        driver.findElement(By.name("howican")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("csmcertbutton")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("title")).click();
        Thread.sleep(2000);

        //TFW display
        driver.findElement(By.name("whatido")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("tfwbutton")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(1500);

        //Payscale finder display
        driver.navigate().to("http://appsbycapps.com/portfolio/payscale.html");
        Thread.sleep(2000);
        //Payscale annual salary display
        driver.findElement(By.name("annualInput")).sendKeys("85000");
        Thread.sleep(1500);
        driver.findElement(By.name("annualSalarySubmitButton")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("resetAnnualButton")).click();
        Thread.sleep(1000);
        //Payscale hourly salary display
        driver.findElement(By.name("hourlyInput")).sendKeys("46.66");
        Thread.sleep(1500);
        driver.findElement(By.name("hourlySalarySubmitButton")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("refreshHourlyButton")).click();
        Thread.sleep(1000);

        //Proceed to next display
        driver.findElement(By.name("referencesTab")).click();

        //References display
        Thread.sleep(4000);

        //Proceed to next display
        driver.findElement(By.name("experienceTab")).click();

        //Experiences display
        Thread.sleep(4000);

        //Return home
        driver.findElement(By.className("title")).click();

        //Close program
        driver.close();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Dan Capps
* 8.10.18
* portfoliotest1.java
* This program runs a Selenium WebDriver test for my digital portfolio at appbycapps.com
*/

public class portfoliotest1 {

    public static void main(String[] args) throws InterruptedException {

        //Open Google Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Navigate to website
        driver.get("http://dcapps.greenrivertech.net");
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


        //Close program
        driver.close();
    }
}

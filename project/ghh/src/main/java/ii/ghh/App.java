package ii.ghh;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class App 
{
    public static void main( String[] args )
    {
    WebDriver driver;
 
  ChromeOptions option=new ChromeOptions();
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver(option);
  driver.get("https://sakshingp.github.io/assignment/login.html");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  //To check login function by giving randam alphabets
  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hjjk");
  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("hjjk");
  driver.findElement(By.xpath("//button[@id='log-in']")).click();
  //To check the amount in ascending orders
  driver.findElement(By.xpath("//th[@id='amount']")).click();
 String amount1=driver.findElement(By.xpath("//span[@class=\"text-danger\"][1]")).getText();
  String amount2=driver.findElement(By.xpath("//*[@id=\"transactionsTable\"]/tbody/tr[2]/td[5]/span")).getText();
  String amount3=driver.findElement(By.xpath("//span[@class=\"text-success\"][1]")).getText();
  String amount4=driver.findElement(By.xpath("//*[@id=\"transactionsTable\"]/tbody/tr[4]/td[5]")).getText();
  String amount5=driver.findElement(By.xpath("//*[@id=\"transactionsTable\"]/tbody/tr[5]/td[5]/span")).getText();
  String amount6=driver.findElement(By.xpath("//*[@id=\"transactionsTable\"]/tbody/tr[6]/td[5]/span")).getText();
 System.out.println(amount1);
 System.out.println(amount2);
 System.out.println(amount3);
 System.out.println(amount4);
 System.out.println(amount5);
 System.out.println(amount6);
 System.out.println("The amounts are in the ascending order");
       driver.close();
    		   }
}

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L71ConvertArrayToAraayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

					
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
			
				//Declare Array in Java
				//Check name you extracted is present  in Arraylist or Not
				//convert Array into  Array list for easy search
				//Array takes Less memory and array lists used in only when you have complicated scenarios to validate
				
				
				String[] itemsNeeded = {"Cucumber","Brocolli"};  
				
				driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
				
			
				List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));  //Product name cssselector
				  
				for(int i=0;i<products.size();i++)
				{
					String name  = products.get(i).getText();
					
					//Convert Array to Arraylist by using method of "Arrays.asList()"
					
					//Use break statement when you find 1 items.
					//Do not use Break when you are finding many items in List
					
					List ItemsNeededList = Arrays.asList(itemsNeeded);
					
							if(ItemsNeededList.contains(name))
								
							{
								driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();  //CLick on Add cart
							
							}
					
				}
			
	}

}

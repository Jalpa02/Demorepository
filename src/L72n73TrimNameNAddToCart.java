import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L72n73TrimNameNAddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		//Declare Array in Java
		//Check name you extracted is present  in Arraylist or Not
		//convert Array into  Array list for easy search
		//Array takes Less memory and array lists used in only when you have complicated scenarios to validate
		
		int j=0;   //for use Break statement
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};  
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));  //Product name cssselector
		  
		for(int i=0;i<products.size();i++)
		{
			//Split and Remove name by using split() and trim() method
			// Item name =  Brocolli - 1 Kg  
			// split by highfun - 
			//After split ,divided into 2 index
			//index [0] = Brocolli
			//Index [1] = 1 kg
			//Use trim() by removing whitespace of "Brocolli " >> name[0].trim();
			
			String[] name  = products.get(i).getText().split("-");
			String Formattedname = name[0].trim();
		
			List ItemsNeededList = Arrays.asList(itemsNeeded);
			
			//Break ststement solution
			//you can use break statement by any declared variable
			
			
					if(ItemsNeededList.contains(Formattedname))
						
					{
						//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();  //CLick on Add cart
						driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
						
						//if(j==3)  In string array we define 3 veggy name..so declared a variable as value 3
						if(j==itemsNeeded.length)  //when more items added and we don't know the count of how many items than use variable.lengh(Where you define Array list)
						{
							break;  
						}
					}
			
		}
		
		
		
		
	}

}

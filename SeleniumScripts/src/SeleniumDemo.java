
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumDemo {
	
	public static FirefoxDriver driver 	  		= new FirefoxDriver();
	
	private static String init(
			String p_uname
		,	String p_pwd
	)throws InterruptedException{
		  
		driver.get("http://localhost:9000/MyApp/");
			
		driver.findElement(By.name("uname")).sendKeys(p_uname);
			
		driver.findElement(By.name("password")).sendKeys(p_pwd);
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("commit")).submit();
			
		return driver.getTitle();
	  }
	
	public static void main(String args[]) throws InterruptedException{
		
		String 		l_title			= null;
		/* Successful Test Case Begin*/
		
		System.out.println("Testing Success Case");
		l_title = init("test1","pwd");
		response(l_title);
		/* Successful Test Case End */
		Thread.sleep(3000);
		/* Failure Test Case with wrong username Begin*/
		l_title = null;
		System.out.println("Testing Failure Test Case with wrong username");
		l_title = init("test","pwd");
		response(l_title);
		/* Failure Test Case with wrong username End */
		Thread.sleep(3000);
		/* Failure Test Case with blamk username Begin*/
		l_title = null;
		System.out.println("Testing Failure Test Case with wrong username");
		l_title = init(" ","pwd");
		response(l_title);
		/* Failure Test Case with wrong username End */
		
		//driver.close();
		//System.exit(0);
		
	}
	
	private static void response(String p_title){
		
		if("Login Success".equals(p_title)){
			String heading = driver.findElement(By.xpath("//section/div/h1")).getText() ;
			String subheading1 = driver.findElement(By.xpath("//section/div/table/tbody/tr/th[1]")).getText() ;
			String subheading2 = driver.findElement(By.xpath("//section/div/table/tbody/tr/th[2]")).getText() ;
			String subheading3 = driver.findElement(By.xpath("//section/div/table/tbody/tr/th[3]")).getText() ;
			if("Employees Database".equals(heading)
					&& "Firstname".equals(subheading1)
					&& "Lastname".equals(subheading2)
					&& "Points".equals(subheading3)){
				driver.findElement(By.name("commit")).click();
				if("Inventory Details".equals(driver.getTitle())){
					System.out.println("Login Successful");
				}else{
					System.out.println("Invalid Page");
				}
			}else{
				System.out.println("Invalid Page");
			}
		}else{
			System.out.println("Login Unsuccessful");
		}
	}
}

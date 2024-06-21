package homeassignmentday8;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class FrameandAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
						
						ChromeDriver driver = new ChromeDriver();
						
						driver.manage().window().maximize();
						
						

						driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
						
						driver.switchTo().frame("iframeResult");
						
						driver.findElement(By.xpath("//button[text()='Try it']")).click();
						
						
						Alert a = driver.switchTo().alert();
						a.accept();
						
						String text = driver.findElement(By.id("demo")).getText();
						System.out.println(text);

						driver.close();			
			}
				
	}



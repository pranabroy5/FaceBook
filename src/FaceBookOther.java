import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FaceBookOther {
	
	FirefoxDriver fD;
	
	FaceBookOther(FirefoxDriver y)
	{
		fD=y;
	}
	
	void type(By x,String s)
	{
		fD.findElement(x).sendKeys(s);
	}
	
	String varifyTextContent(By m)
	{
		String z=fD.findElement(m).getText();
		//System.out.println(z);
		return z;
	}

}

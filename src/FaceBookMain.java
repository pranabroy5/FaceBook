import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class FaceBookMain {
	static FirefoxDriver fD=new FirefoxDriver();

	public static void main(String[] args) {
		FaceBook
	    FaceBookOther p=new FaceBookOther(fD);
		p.OpenUrl("http://www.facebook.com");
		
		p.type(By.xpath(".//*[@id='u_0_1']"), "pranab");
		p.type(By.xpath(".//*[@id='u_0_3']"),"roy");
		String x=p.email();
		p.type(By.xpath(".//*[@id='u_0_5']"), x);
		p.type(By.xpath(".//*[@id='u_0_8']"), x);
		p.type(By.xpath(".//*[@id='u_0_a']"), "yahoogg11");
		p.dropDown(By.xpath(""), "Feb");
		p.dropDown1(By.xpath(".//*[@id='day']"), "14");
		p.dropDown1(By.xpath(".//*[@id='year']"), "1988");
		p.radioButton(By.xpath(".//*[@id='u_0_d']"));
		p.displayed(By.xpath(".//*[@id='u_0_g']/span[2]/label"));
		String f=p.verifyTextPresent(By.xpath(".//*[@id='u_0_g']/span[2]/label"));
		System.out.println(f);
		p.verifyTitle("Facebook");
		p.varifyInnerText(By.xpath(".//*[@id='u_0_3']"));
		System.out.println(p.varifyInnerText(By.xpath(".//*[@id='u_0_1']")));
		System.out.println(p.radioButttonCheck(By.xpath(".//*[@id='u_0_d']")));
		String j=w.varifyTextContent(By.xpath(".//*[@id='content']/div/div[1]/div/div/div[1]/h2"));
		System.out.println(j);
	}
}
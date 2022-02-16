package backgroundColorPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundColorPage {
	
WebDriver driver;
String BgColor;

	public BackgroundColorPage(WebDriver driver) {
		this.driver = driver;
	}	
	
	@FindBy(how = How.CSS, using = "button[onclick='myFunctionSky()']") WebElement Set_SkyBlue_Background_Button_Element;
	@FindBy(how = How.CSS, using = "button[onclick='myFunctionWhite()']") WebElement Set_White_Background_Button_Element;
	@FindBy(how = How.CSS, using = "body[style='background-color: skyblue;']") WebElement SkyBlue_Background_Color_Element;
	@FindBy(how = How.CSS, using = "body[style='background-color: white;']") WebElement White_Background_Color_Element;
	
	public void validateSkyBlueBackgroundButton() {
		assert Set_SkyBlue_Background_Button_Element.getText().equals("Set SkyBlue Background");
		System.out.println("Set SkyBlue Background button exists!!!");
	}
	
	public void clickSetSkyBlueBackgroundButton() {
		Set_SkyBlue_Background_Button_Element.click();
	}
	
	public void validateSkyBlueBackgroundColor() {
		
		
		BgColor = SkyBlue_Background_Color_Element.getCssValue("background-color");
		System.out.println("Background Color is:" + BgColor);
		
		String c = Color.fromString(BgColor).asHex();
		System.out.println("Background color is changed to hexa:" + c);
		
		assert c.equals("#87ceeb");
		System.out.println("Background Color is matched!!!");
		
	}
	
	public void validateWhiteBackgroundButton() {
		assert Set_White_Background_Button_Element.getText().equals("Set White Background");
		System.out.println("Set White Background button exists!!!");
	}
	
	public void clickSetWhiteBackgroundButton() {
		Set_White_Background_Button_Element.click();
	}
	
	public void validateWhiteBackgroundColor() {
		
		BgColor = White_Background_Color_Element.getCssValue("background-color");
		System.out.println("Background Color is:" + BgColor);
		
		String c = Color.fromString(BgColor).asHex();
		System.out.println("Background color is chenged to hexa:" + c);
		
		Set_SkyBlue_Background_Button_Element.click();
		assert c.equals("#ffffff");
		System.out.println("Background Color is matched!!!");
		
	}
	
}

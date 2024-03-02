package mobiletest.Appium;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
 class eComerce_Tc1 extends BaseTest {
	@Test
	public void fillForm() throws InterruptedException
	{
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Indonesia\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Indonesia']")).click();
//		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hendra");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		String toastMessage = driver.findElement(By.xpath("//android.widget.Toast")).getAttribute("name");
		Assert.assertEquals(toastMessage, "Please enter your name");
		
		}
	}

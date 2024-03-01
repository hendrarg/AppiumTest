package mobiletest.Appium;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
 class AppiumBasics extends BaseTest {
	@Test
	public void wifiSettingName()
	{
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("//android.widget.ListView//android.widget.LinearLayout[2]//android.widget.RelativeLayout")).click();
		String alertTitle = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/alertTitle\"]")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\'android:id/edit\']")).sendKeys("Hendra Wifi");
		driver.findElement(By.className("android.widget.Button")).click();
		
		}
	}

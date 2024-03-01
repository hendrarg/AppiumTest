package mobiletest.Appium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class ScrollDemo extends BaseTest {
	
	@Test
	public void LongPressGesture () throws MalformedURLException, InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		//where to scroll is prior
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		
		
		//no prior idea
		scrollToEnd();
		
	}

}

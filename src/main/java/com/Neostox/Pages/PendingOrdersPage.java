package com.Neostox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PendingOrdersPage {

	
    WebDriver driver;
	
	public PendingOrdersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}

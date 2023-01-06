package com.co.demoqa.pagesobject;



import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/")
public class DemoQAPage extends PageObject {

    By OPTION_ALERTS = By.xpath("//div[@class='category-cards']/div[3]");

    public By getOptionAlerts(){
        return OPTION_ALERTS;
    }
}

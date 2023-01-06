package com.co.demoqa.pagesobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class DemoQAAlertsWindows extends PageObject {

    By MENU_ACCORDION_ALERTS = By.xpath("//span[contains(text(),\"Alerts\")]");
    public By getMenuAccordionAlerts(){
        return MENU_ACCORDION_ALERTS;
    }

    By ALERT_BUTTON = By.xpath("//button[@id='alertButton']");
    public By getAlertButton(){
        return ALERT_BUTTON;
    }

    By ALERT_BUTTON_5_SECONDS =  By.xpath("//button[@id='timerAlertButton']");
    public By getALERT_BUTTON_5_SECONDS(){
        return ALERT_BUTTON_5_SECONDS;
    }

    By ALERT_BUTTON_CONFIRM =  By.xpath("//button[@id='confirmButton']");
    public By getALERT_BUTTON_CONFIRM(){
        return ALERT_BUTTON_CONFIRM;
    }

    By ALERT_BUTTON_PROMT = By.xpath("//button[@id='promtButton']");
    public By getALERT_BUTTON_PROMT(){
        return ALERT_BUTTON_PROMT;
    }
}

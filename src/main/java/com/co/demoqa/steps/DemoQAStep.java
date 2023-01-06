package com.co.demoqa.steps;


import com.co.demoqa.pagesobject.DemoQAAlertsWindows;
import com.co.demoqa.pagesobject.DemoQAPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Alert;

public class DemoQAStep {

    DemoQAPage demoQAPage = new DemoQAPage();
    DemoQAAlertsWindows demoQAAlertsWindows = new DemoQAAlertsWindows();


    // the user is on page demoqa
    @Step
    public void openBrowser(){
        demoQAPage.open();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // The user click on Alerts, Frame and Windows
    @Step
    public void clickOptionHomePage(){
        demoQAPage.getDriver().findElement(demoQAPage.getOptionAlerts()).click();

    }

    // Click alerts
    @Step
    public void clickButtonAlert(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        demoQAAlertsWindows.getDriver().findElement(demoQAAlertsWindows.getMenuAccordionAlerts()).click();
        demoQAAlertsWindows.getDriver().findElement(demoQAAlertsWindows.getAlertButton()).click();
    }
    // Validate fourth alerts
    @Step
    public void clickOthersAlerts(){
        demoQAAlertsWindows.getDriver().findElement(demoQAAlertsWindows.getALERT_BUTTON_5_SECONDS()).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        demoQAAlertsWindows.getDriver().findElement(demoQAAlertsWindows.getALERT_BUTTON_CONFIRM()).click();
        demoQAAlertsWindows.getDriver().findElement(demoQAAlertsWindows.getALERT_BUTTON_PROMT()).click();
    }
}

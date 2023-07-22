package homeWork.Page;

import homeWork.base.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketPageHW extends BasePageHW {
    private final String path = "https://www.saucedemo.com/inventory.html";

    private final By buttonCheckoutLocator = By.id("checkout");



    public BasketPageHW(WebDriver wd) {
        super(wd);
    }

    @Override
    protected By getPageIdentifier() {
        return buttonCheckoutLocator;
    }


    public WebElement getButtonCheckoutLocator() {
        return wd.findElement(buttonCheckoutLocator);
    }




}

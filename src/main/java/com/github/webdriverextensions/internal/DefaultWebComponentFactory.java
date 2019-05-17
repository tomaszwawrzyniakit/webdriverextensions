package com.github.webdriverextensions.internal;

import com.github.webdriverextensions.WebComponent;
import org.openqa.selenium.WebElement;

public class DefaultWebComponentFactory implements WebComponentFactory {

    @Override
    public <T extends WebComponent> T create(Class<T> webComponentClass, WebElement webElement) {
        return createInstanceOf(webComponentClass, webElement);
    }

    private <T extends WebComponent> T createInstanceOf(final Class<T> webComponentClass, final WebElement webElement) {
        try {
            T webComponent = webComponentClass.newInstance();
            webComponent.init(webElement);
            return webComponent;
        } catch (IllegalArgumentException|SecurityException|InstantiationException|IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

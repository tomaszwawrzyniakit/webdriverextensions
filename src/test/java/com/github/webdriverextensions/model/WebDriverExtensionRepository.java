package com.github.webdriverextensions.model;

import com.github.webdriverextensions.WebRepository;
import com.github.webdriverextensions.model.pages.ExamplesPage;
import com.github.webdriverextensions.model.components.Menu;
import com.github.webdriverextensions.model.components.Body;
import org.openqa.selenium.support.FindBy;

public class WebDriverExtensionRepository extends WebRepository {

    public final String url = "file://" + getClass().getResource("/html/model-test.html").getPath();

    Double delayTime = 0.0;
    @FindBy(css = "div.btn-group")
    Menu menu;
    @FindBy(css = "html")
    Body html;
    public ExamplesPage examplesPage;

}

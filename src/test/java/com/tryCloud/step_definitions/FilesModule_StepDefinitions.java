package com.tryCloud.step_definitions;

import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class FilesModule_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("that the user is on the dashboard page")
    public void that_the_user_is_on_the_dashboard_page() {
        loginPage.login();
    }
    @When("user clicks on the Files module")
    public void user_clicks_on_the_files_module() {
        loginPage.filesModule.click();
    }
    @Then("user sees six modules on the left of the screen")
    public void user_sees_six_modules_on_the_left_of_the_screen(List<String> filesModules) {
        List<String> elements = BrowserUtils.getElementsText(loginPage.elements);
        Assert.assertTrue(elements.containsAll(filesModules));
    }
}

package com.tryCloud.step_definitions;

import com.tryCloud.pages.PhotosModule;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PhotosStepDefs {

    PhotosModule photosModule = new PhotosModule();

    @When("user selects the Photos module from the dashboard")
    public void user_selects_the_photos_module_from_the_dashboard() {
        photosModule.photoModuleButton.click();
    }
    @Then("the user will see the Your photos module")
    public void the_user_will_see_the_your_photos_module() {
        photosModule.yourPhotos.isDisplayed();
    }
    @Then("the user will see the Your videos module")
    public void the_user_will_see_the_your_videos_module() {
        photosModule.yourVideos.isDisplayed();
    }
    @Then("the user will see the Favorites module")
    public void the_user_will_see_the_favorites_module() {
        photosModule.favorites.isDisplayed();
    }
    @Then("the user will see the Your folders module")
    public void the_user_will_see_the_your_folders_module() {
        photosModule.yourFolders.isDisplayed();
    }
    @Then("the user will see the Shared with you module")
    public void the_user_will_see_the_shared_with_you_module() {
        photosModule.sharedWithYou.isDisplayed();
    }
    @Then("the user will see the Tagged photos module")
    public void the_user_will_see_the_tagged_photos_module() {
        photosModule.taggedPhotos.isDisplayed();
    }


}

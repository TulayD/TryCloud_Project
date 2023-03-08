package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhotosModule {
    public PhotosModule(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Photos']//*[name()='svg']//*[name()='image']")
    public WebElement photoModuleButton;

    @FindBy (xpath = "//span[@title = 'Your photos']")
    public WebElement yourPhotos;

    @FindBy (xpath = "//span[@title = 'Your videos']")
    public WebElement yourVideos;

    @FindBy (xpath = "//span[@title = 'Favorites']")
    public WebElement favorites;

    @FindBy (xpath = "//span[@title = 'Your folders']")
    public WebElement yourFolders;

    @FindBy (xpath = "//span[@title = 'Shared with you']")
    public WebElement sharedWithYou;

    @FindBy (xpath = "//span[@title = 'Tagged photos']")
    public WebElement taggedPhotos;

}

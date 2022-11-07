package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PanaromaPage {
    @FindBy(xpath = "//*[@id='edtUserName']")
    public WebElement kullaniciadi;
    @FindBy(xpath = "//*[@id='edtPass']")
    public WebElement parola;
    @FindBy(xpath = "//*[@id='btnLogin']")
    public WebElement login;




    @FindBy(xpath = "//*[@id='btnClose']")
    public WebElement kapatbutonu;

}

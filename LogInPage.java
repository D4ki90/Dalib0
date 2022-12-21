package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage {

    public LogInPage (WebDriver driver){
        super(driver);
    }
    
    String baseURL = "https://www.saucedemo.com/";
    By usernameBy = By.id("user-name");
    By passwoerdBy = By.id("password");
By loginButtonBy = By.id("login-button");

    public LogInPage basePage(){
        driver.get(baseURL);
        return this;
        
    }

    public LogInPage login(String username, String password){

        writeText(usernameBy, username);
        writeText(passwoerdBy, password);
        click(loginButtonBy);
        return this;
        

}

    private void click(By loginButtonBy2) {
    }


}

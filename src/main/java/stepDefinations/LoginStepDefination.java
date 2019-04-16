//package stepDefinations;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.And;
//import cucumber.api.junit.Cucumber;
//
//import org.junit.Assert;
//import org.junit.runner.RunWith;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//@RunWith(Cucumber.class)
//public class LoginStepDefination {
//
//	WebDriver driver;
//	
//    @Given("^users is allready on FreeCRM login Page$")
//    public void users_is_allready_on_freecrm_login_page() {
//    	System.setProperty("webdriver.chrome.driver", "F:\\Tushar Data\\drivers\\chromedriver.exe");
//    	driver= new ChromeDriver();
//    	driver.get("https://classic.crmpro.com/index.html");
//    }
//
//    @When("^title of login page is FreeCRM$")
//    public void title_of_login_page_is_freecrm() {
//        String title = driver.getTitle();
//        String expTitle="CRMPRO - CRM software for customer relationship management, sales, and support.";
//        System.out.println(title);
//        Assert.assertEquals(expTitle, title);    	
//    }
//
//    @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
//    public void user_enters_username_and_password(String username, String password) {
//    driver.findElement(By.name("username")).sendKeys(username);
//    driver.findElement(By.name("password")).sendKeys(password);
//    }
//
//    @And("^user clicks on login button$")
//    public void user_clicks_on_login_button()  {
//        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
//    	JavascriptExecutor js = (JavascriptExecutor)driver;
//    	js.executeScript("arguments[0].click()",loginBtn);
//    }
//
//    @And("^user is on homepage$")
//    public void user_is_on_homepage() {
//    	String homepageTitle = driver.getTitle();
//        System.out.println(homepageTitle);
//        Assert.assertEquals("CRMPRO", homepageTitle); 
//        driver.close();
//    }
//
//
//}

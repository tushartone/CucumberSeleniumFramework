//package stepDefinations;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
//import cucumber.api.java.en.Then;
//import cucumber.api.DataTable;
//import cucumber.api.java.en.And;
//import cucumber.api.junit.Cucumber;
//
//import java.util.List;
//import java.util.Map;
//
//import org.junit.Assert;
//import org.junit.runner.RunWith;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//@RunWith(Cucumber.class)
//public class DealStepWithMapDefination {
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
//    @Then("^user enters username and password$")
//    public void user_enters_username_and_password(DataTable credentials) {
//   for(Map<String,String> data : credentials.asMaps(String.class, String.class))
//   {
//	   driver.findElement(By.name("username")).sendKeys(data.get("username"));
//	   driver.findElement(By.name("password")).sendKeys(data.get("password"));	       
//   }
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
//    }
//    
//
//    @And("^user moves to new deal page$")
//    public void user_moves_to_new_deal_page() {
//        driver.switchTo().frame("mainpanel");
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//    }
//
//    @And("^user click on new deal button$")
//    public void user_click_on_new_deal_button() {
//    	driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();	
//    }
//
//    @Then("^user enters deal details$")
//    public void user_enters_deal_details(DataTable details) throws InterruptedException {
//    	for(Map<String,String> dealData : details.asMaps(String.class, String.class))
//    	   {
//    	driver.findElement(By.id("title")).sendKeys(dealData.get("title"));
//    	driver.findElement(By.id("amount")).sendKeys(dealData.get("amount"));
//    	driver.findElement(By.id("probability")).sendKeys(dealData.get("probability"));
//    	driver.findElement(By.id("commission")).sendKeys(dealData.get("commision"));
//    	
//    	WebElement saveBtn = driver.findElement(By.xpath("//input[contains(@value,'Save')]"));
//    	JavascriptExecutor js = (JavascriptExecutor)driver;
//    	js.executeScript("arguments[0].click()",saveBtn);
//    	
//    	//Again move to new deal so it can repeat the same mouse over
//    	Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//        driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//    }
//    }
//    
//    @And("^Close the browser$")
//    public void close_the_browser() throws InterruptedException {
//    	driver.quit();
//    	System.out.println("Browser Closed");
//    }
//
//}

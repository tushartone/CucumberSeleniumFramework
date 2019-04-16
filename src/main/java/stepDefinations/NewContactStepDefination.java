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
//import org.openqa.selenium.interactions.Actions;
//
//@RunWith(Cucumber.class)
//public class NewContactStepDefination {
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
//        
//    }
//    
//
//    @And("^user moves to new contact page$")
//    public void user_moves_to_new_contact_page() {
//        driver.switchTo().frame("mainpanel");
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//                
//    }
//
//    @And("^user click on new contact button$")
//    public void user_click_on_new_contact_button() {
//    	driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//    	
//    }
//
//    @And("^user enters values as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//    public void user_enters_values_as_something_and_something_and_something(String firstname, String lastname, String position) throws InterruptedException {
//        
//    	driver.findElement(By.id("first_name")).sendKeys(firstname);
//    	driver.findElement(By.id("surname")).sendKeys(lastname);
//    	driver.findElement(By.id("company_position")).sendKeys(position);
//    	//driver.findElement(By.xpath("//input[@value='Load From Company']/following-sibling::input[contains(@value,'Save')][1]"));
//    	WebElement saveBtn = driver.findElement(By.xpath("//input[contains(@value,'Save')]"));
//    	JavascriptExecutor js = (JavascriptExecutor)driver;
//    	js.executeScript("arguments[0].click()",saveBtn);
//    }
//
//    @And("^Close the browser$")
//    public void close_the_browser() throws InterruptedException {
//    	driver.quit();
//    	System.out.println("Browser Closed");
//    }
//
//}

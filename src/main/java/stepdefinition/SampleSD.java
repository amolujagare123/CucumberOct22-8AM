package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SampleSD {
    WebDriver driver;

    /*@Given("I am on login page")
    public void i_am_on_login_page() {
        System.out.println("I am on login page");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://stock.amolujagare.com/");

    }*/

    @Given("^I am on login page$")
    public void i_am_on_login_page() throws Throwable {
        System.out.println("I am on login page");


        driver.get("https://stock.amolujagare.com/");
    }

    @When("I enter correct username and correct password")
    public void i_enter_correct_username_and_correct_password() {
        System.out.println("I enter correct username and correct password");

        driver.findElement(By.id("login-username")).sendKeys("admin");

        driver.findElement(By.id("login-password")).sendKeys("admin");

    }
    @And("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");

        driver.findElement(By.name("submit")).click();
    }
    @Then("I should reach to home page")
    public void i_should_reach_to_home_page() {
        System.out.println("I should reach to home page");

        String expected = "https://stock.amolujagare.com/dashboard.php";
        String actual = driver.getCurrentUrl();

        Assert.assertEquals("this is not a login page",expected,actual);


    }

    @When ("I enter incorrect username and incorrect password")
    public void I_enter_incorrect_username_and_incorrect_password()
    {
        driver.findElement(By.id("login-username")).sendKeys("xyz");
        driver.findElement(By.id("login-password")).sendKeys("abc");

    }


    @Then("I we should get error message")
    public void iWeShouldGetErrorMessage() {
        String expected = "https://stock.amolujagare.com/index.php?msg=Wrong%20Username%20or%20Password&type=error";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals("incorrect or no error message",expected,actual);
    }

    @When("I dont enter username and password")
    public void iDontEnterUsernameAndPassword() {
    }


    @Then("I we should get another error message")
    public void iWeShouldGetAnotherErrorMessage() {
        String expected = "https://stock.amolujagare.com/";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals("incorrect or no error message",expected,actual);
    }

    @When("I enter username as {string} and password as {string}")
    public void iEnterUsernameAsAndPasswordAs(String username, String password) {

        driver.findElement(By.id("login-username")).sendKeys(username);
        driver.findElement(By.id("login-password")).sendKeys(password);

    }

    @And("I click on submit button")
    public void iClickOnSubmitButton() {

    }

    @Then("data should be entered")
    public void dataShouldBeEntered() {
    }

    @Given("I am on user registration page")
    public void iAmOnUserRegistrationPage() {

        driver.get("https://openclinic.sourceforge.net/openclinic/admin/staff_new_form.php?type=D");
    }

   /* @When("I enter below data")
    public void iEnterBelowData() {


    }*/
   @When("I enter below data")
   public void i_enter_below_data(DataTable dataTable) {
       // Write code here that turns the phrase above into concrete actions
       // For automatic transformation, change DataTable to one of
       // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
       // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
       // Double, Byte, Short, Long, BigInteger or BigDecimal.
       //
       // For other transformations you can register a DataTableType.

       List<List<String>> data = dataTable.asLists();

       //System.out.println("TIN="+data.get(0).get(0));
       driver.findElement(By.xpath("//input[@id='nif']")).sendKeys(data.get(0).get(0));
       driver.findElement(By.xpath("//input[@id='collegiate_number']")).sendKeys(data.get(0).get(1));
       driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(data.get(0).get(2));
       driver.findElement(By.xpath("//input[@id='surname1']")).sendKeys(data.get(0).get(3));
       driver.findElement(By.xpath("//input[@id='surname2']")).sendKeys(data.get(0).get(4));
       driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(data.get(0).get(5));
       driver.findElement(By.xpath("//textarea[@id='phone_contact']")).sendKeys(data.get(0).get(6));
       driver.findElement(By.xpath("//input[@id='login']")).sendKeys(data.get(0).get(7));
   }

 /*   @When("I enter username as <username> and password as <password>")
    public void iEnterUsernameAsUsernameAndPasswordAsPassword() {
    }*/

    @When("^I enter username as (.+) and password as (.+) on login page$")
    public void i_enter_username_as_and_password_as(String username, String password) throws Throwable {
        driver.findElement(By.id("login-username")).sendKeys(username);
        driver.findElement(By.id("login-password")).sendKeys(password);
    }


    @Given("I open browser")
    public void iOpenBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @And("maximize it")
    public void maximizeIt() {
        driver.manage().window().maximize();
    }
}

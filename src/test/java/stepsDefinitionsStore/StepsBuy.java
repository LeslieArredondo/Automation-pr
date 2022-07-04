package stepsDefinitionsStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectsStore.ObjectsStore;

public class StepsBuy {


	WebDriver driver;
	ObjectsStore OB;
	
	
	@Given("The user is in the home page")
	public void the_user_is_in_the_home_page() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		OB = new ObjectsStore(driver);
		driver.get("http://automationpractice.com/index.php");
	}

	@When("User click on sign on button")
	public void user_click_on_sign_on_button() {
		OB.signInButton.click();
	}

	@When("User send an email as {string}")
	public void user_send_an_email_as(String email) {
		OB.emailInput.sendKeys(email);

	}

	@When("User send password as {string}")
	public void user_send_password_as(String password) {
		OB.passwordInput.sendKeys(password);
	}

	@When("User click on Sign in button")
	public void user_click_on_sign_in_button() {
		OB.submitLoginButton.click();
	}

	@When("User go to the home page")
	public void user_go_to_the_home_page() {
		OB.homeButton.click();
	}

	@When("User click on the Faded Short Sleeve T-shirts item")
	public void user_click_on_the_faded_short_sleeve_t_shirts_item() {
		OB.fadedShortSleeveTShirts.click();
	}

	@When("User add to the cart the Faded Short Sleeve T-shirts item")
	public void user_add_to_the_cart_the_faded_short_sleeve_t_shirts_item() {
		OB.addToCartButton.click();
	}

	@When("User click on Proceed to checkout button")
	public void user_click_on_proceed_to_checkout_button() {
		OB.proceedToCheckout.click();
	}

	@When("User click on the second Proceed to checkout button")
	public void user_click_on_the_second_proceed_to_checkout_button() {
		OB.proceedToCheckout2.click();
	}

	@When("User add a comment on the box")
	public void user_add_a_comment_on_the_box() {
		OB.writeAMessage.sendKeys("hi :)");
	}

	@When("User click on the third Procees to checkout button")
	public void user_click_on_the_third_procees_to_checkout_button() {
		OB.proceedToCheckout3.click();
	}

	@When("User accept the Terms of service")
	public void user_accept_the_terms_of_service() {
		OB.termsOfService.click();
	}

	@When("User click on the fourth Procees to checkout button")
	public void user_click_on_the_fourth_procees_to_checkout_button() {
		OB.proceedToCheckout4.click();
	}

	@When("User choose to pay by bank wire")
	public void user_choose_to_pay_by_bank_wire() {
		OB.payByBankWire.click();
	}

	@When("User confirm the order")
	public void user_confirm_the_order() {
		OB.confirmOrder.click();
	}

	@Then("User should see the order confirmation")
	public void user_should_see_the_order_confirmation() {
	
	}
	
}

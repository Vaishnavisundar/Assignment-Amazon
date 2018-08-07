package com.cg.amazon.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSteps {

	WebDriver driver = null;

	@Given("^Open the amazon homepage$")
	public void open_the_amazon_homepage() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\vaishnav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

	}

	@When("^The product one is selected$")
	public void the_product_one_is_selected() throws Throwable {

		WebElement type = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		type.sendKeys("one plus 6 phone");

		WebElement search = driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
		search.click();

		WebElement mobile = driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div/div/div[2]/div[1]/div[1]/a/h2"));
		mobile.click();

	}

	@Then("^Add the product to cart$")
	public void add_the_product_to_cart() throws Throwable {

		String withhandle = driver.getWindowHandle();
		for (String with : driver.getWindowHandles()) {

			driver.switchTo().window(with);
		}

		WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
	}

	@When("^The product two is selected$")
	public void the_product_two_is_selected() throws Throwable {

		WebElement amazon = driver.findElement(By.id("nav-logo"));
		amazon.click();

		WebElement item2 = driver.findElement(By.xpath("//*[@id=\"d2ce8549\"]/span/div/div[1]/a/img"));
		item2.click();

		/*
		 * WebElement item2se =
		 * driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[2]/div/div/a/img")
		 * ); item2se.click();
		 */
	}

	@When("^The product three is selected$")
	public void the_product_three_is_selected() throws Throwable {

		WebElement amazon3 = driver.findElement(By.id("nav-logo"));
		amazon3.click();

		WebElement item3 = driver.findElement(By.xpath("//*[@id=\"ddabb9d0\"]/span/div/div[1]/a/img"));
		item3.click();

		WebElement item3se = driver.findElement(By.xpath("/html/body"));
		item3se.click();

	}

	@When("^The product four is selected$")
	public void the_product_four_is_selected() throws Throwable {

		WebElement amazon4 = driver.findElement(By.id("nav-logo"));
		amazon4.click();

		WebElement item4 = driver.findElement(By.xpath("//*[@id=\"d2721ec6\"]/span/div/div[1]/a/img"));
		item4.click();

		WebElement item4se = driver.findElement(By.xpath("//*[@id=\"result_3\"]/div/div[2]/div/div/a/img"));
		item4se.click();

	}

	@When("^The product five is selected$")
	public void the_product_five_is_selected() throws Throwable {

		WebElement item5 = driver.findElement(By.xpath("//*[@id=\"upsell_0_0\"]/div/a/img"));
		item5.click();

		String withhandle = driver.getWindowHandle();
		for (String with : driver.getWindowHandles()) {

			driver.switchTo().window(with);
		}
	}

	@Then("^Add the product to cart and proceed to payment$")
	public void add_the_product_to_cart_and_proceed_to_payment() throws Throwable {
		WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();

		WebElement cart = driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[2]"));
		cart.click();

		WebElement proceedtopay = driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input"));
		proceedtopay.click();

		assertThat("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle"
				+ "=amazon_checkout_in&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fau"
				+ "th%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid"
				+ ".net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid."
				+ "ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F"
				+ "%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age="
				+ "0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fbuy%2Fsignin%2Fh"
				+ "andlers%2Fcontinue.html%3Fie%3DUTF8%26cartItemIds%3D%26eGCApp%3D%26hasW"
				+ "orkingJavascript%3D0%26isEGCOrder%3D0%26isFresh%3D0%26oldCustomerId%3D%"
				+ "26oldPurchaseId%3D%26preInitiateCustomerId%3D%26purchaseInProgress%3D%2"
				+ "6siteDesign%3D&pageId=amazon_checkout_in&showRmrMe=0&siteState=isRegula"
				+ "rCheckout.1%7CIMBMsgs.%7CisRedirect.0|isToBeGiftWrappedBefore.",
				is(driver.getCurrentUrl()));
	}

}

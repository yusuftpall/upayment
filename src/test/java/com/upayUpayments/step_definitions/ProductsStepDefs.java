package com.upayUpayments.step_definitions;

import com.upayUpayments.pages.ProductsPage;
import com.upayUpayments.utilities.BrowserUtils;
import com.upayUpayments.utilities.Driver;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import static org.openqa.selenium.Keys.ENTER;

import org.openqa.selenium.By;
public class ProductsStepDefs {

    ProductsPage productsPage = new ProductsPage();


    @Then("the user should be able to click the store button")
    public void the_user_should_be_able_to_click_the_store_button() {

     productsPage.storeButton.click();
     BrowserUtils.waitFor(2);

    }

    @Then("the user should be able to click the products button")
    public void the_user_should_be_able_to_click_the_products_button() {

        productsPage.productButton.click();
        BrowserUtils.waitFor(2);

    }

    @Then("the user should be able to upload product image")
    public void the_user_should_be_able_to_upload_product_image() {

        //BrowserUtils.waitFor(10);
        //BrowserUtils.fileUpload("src/test/resources/iphone.jpg",productsPage.uploadImages);
        //productsPage.uploadImages.sendKeys("src/test/resources/iphone.jpg");
        //BrowserUtils.waitFor(10);

    }

    @Then("the user should see {string} as webpage URL")
    public void the_user_should_see_as_webpage_URL(String expectedURL) {

        String actualGetUrl = Driver.get().getCurrentUrl();
        assertEquals(expectedURL, actualGetUrl);
        BrowserUtils.waitFor(2);
    }


    @Then("the user should be able to click the add product button")
    public void the_user_should_be_able_to_click_the_add_product_button() {

        productsPage.addProductButton.click();
        BrowserUtils.waitFor(2);
    }


    @Then("the user should be able to write {string} the product name")
    public void the_user_should_be_able_to_write_the_product_name(String productName) {

        productsPage.productNameEN.sendKeys(productName);
        BrowserUtils.waitFor(2);

        productsPage.productNameAR.sendKeys(productName);
        BrowserUtils.waitFor(2);

    }
    @Then("the user should be able to select the product category")
    public void the_user_should_be_able_to_select_the_product_category() {

        productsPage.productCategory.click();
        BrowserUtils.waitFor(2);
        productsPage.getElectronics.sendKeys("Electronics");
        BrowserUtils.waitFor(2);

        Driver.get().findElement(By.xpath("//*[@type='search']")).sendKeys(ENTER);
        BrowserUtils.waitFor(2);

    }

    @Then("the user should be able to enter product price {string}")
    public void the_user_should_be_able_to_enter_product_price(String price) {

        productsPage.productPrice.sendKeys(price);
        BrowserUtils.waitFor(2);

        productsPage.productSalePrice.sendKeys(price);
        BrowserUtils.waitFor(2);

    }

    @Then("the user should be able to add a new product")
    public void the_user_should_be_able_to_add_a_new_product() {

        productsPage.submitButton.click();
        BrowserUtils.waitFor(10);

    }

    @Then("the user should be able to search product")
    public void the_user_should_be_able_to_search_product() {

        productsPage.searchButton.click();
        BrowserUtils.waitFor(2);

        assertTrue(productsPage.searchButton.isDisplayed());
        BrowserUtils.waitFor(2);

    }

    @Then("the user should be able to find it by typing the product name {string} in the thumbnail bar")
    public void the_user_should_be_able_to_find_it_by_typing_the_product_name_in_the_thumbnail_bar(String productName) {

        BrowserUtils.waitFor(20);
        productsPage.thumbnail.sendKeys(productName);
        BrowserUtils.waitForPageToLoad(20);


    }

    @Then("the user should be able to edit the selected product")
    public void the_user_should_be_able_to_edit_the_selected_product() {

        productsPage.editButton.click();
        BrowserUtils.waitFor(2);

        productsPage.productNameEN.clear();
        productsPage.productNameEN.sendKeys("iPhone");
        BrowserUtils.waitFor(2);

        productsPage.productNameAR.clear();
        productsPage.productNameAR.sendKeys("iPhone");
        BrowserUtils.waitFor(2);

        productsPage.submitButton.click();
        BrowserUtils.waitFor(2);

    }

    @Then("user should be able to delete the added product")
    public void user_should_be_able_to_delete_the_added_product() {

        Driver.get().navigate().back();
        BrowserUtils.waitFor(2);
        productsPage.radioButton.click();
        BrowserUtils.waitFor(2);
        productsPage.deleteButton.click();
        BrowserUtils.waitFor(2);


    }



}

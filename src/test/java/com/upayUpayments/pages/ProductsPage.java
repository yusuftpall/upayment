package com.upayUpayments.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    @FindBy(xpath = "//*[@data-target='#store_menu']")
    public WebElement storeButton;

    @FindBy(xpath = "//*[@class='list-unstyled collapse in']//li[3]")
    public WebElement productButton;

    @FindBy(xpath = "//*[@class='btn btn-sm green btn-circle ']")
    public WebElement addProductButton;

    @FindBy(xpath = "//*[@focusable='false']")
    public WebElement uploadImages;

    @FindBy(xpath = "//*[@name='product_name_en']")
    public WebElement productNameEN;

    @FindBy(xpath = "//*[@name='product_name_ar']")
    public WebElement productNameAR;

    @FindBy(id= "select2-product_category-container")
    public WebElement productCategory;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement getElectronics;

    @FindBy(xpath = "//*[@name='product_price']")
    public WebElement productPrice;

    @FindBy(xpath = "//*[@name='product_sale_price']")
    public WebElement productSalePrice;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitButton;

    @FindBy(id= "filter")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@name='product_name_en']")
    public WebElement thumbnail;

    @FindBy(xpath = "//*[@name='products_delete[]']")
    public WebElement radioButton;

    @FindBy(xpath = "//*[@class='fa fa-edit']")
    public WebElement editButton;

    @FindBy(xpath = "//*[@class='fa fa-trash']")
    public WebElement deleteButton;





}

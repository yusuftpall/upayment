$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/Products.feature");
formatter.feature({
  "name": "Users should be able to login",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.upayUpayments.step_definitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters user information",
  "keyword": "When "
});
formatter.match({
  "location": "com.upayUpayments.step_definitions.LoginStepDefs.the_user_enters_user_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to click the store button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.upayUpayments.step_definitions.ProductsStepDefs.the_user_should_be_able_to_click_the_store_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to click the products button",
  "keyword": "And "
});
formatter.match({
  "location": "com.upayUpayments.step_definitions.ProductsStepDefs.the_user_should_be_able_to_click_the_products_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "the user should be able to add a new product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user should be able to click the add product button",
  "keyword": "And "
});
formatter.match({
  "location": "com.upayUpayments.step_definitions.ProductsStepDefs.the_user_should_be_able_to_click_the_add_product_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to upload product image",
  "keyword": "And "
});
formatter.match({
  "location": "com.upayUpayments.step_definitions.ProductsStepDefs.the_user_should_be_able_to_upload_product_image()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to write \"iphone\" the product name",
  "keyword": "And "
});
formatter.match({
  "location": "com.upayUpayments.step_definitions.ProductsStepDefs.the_user_should_be_able_to_write_the_product_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to select the product category",
  "keyword": "And "
});
formatter.match({
  "location": "com.upayUpayments.step_definitions.ProductsStepDefs.the_user_should_be_able_to_select_the_product_category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to enter product price \"100\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.upayUpayments.step_definitions.ProductsStepDefs.the_user_should_be_able_to_enter_product_price(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to add a new product",
  "keyword": "And "
});
formatter.match({
  "location": "com.upayUpayments.step_definitions.ProductsStepDefs.the_user_should_be_able_to_add_a_new_product()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
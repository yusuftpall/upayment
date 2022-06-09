Feature: Users should be able to login

  Background:
    Given the user is on the login page
    When the user enters user information
    Then the user should be able to click the store button
    And the user should be able to click the products button

  Scenario: the user should be able to login to the product page
    And the user should see "https://upay.upayments.com/merchant/store" as webpage URL


  Scenario: the user should be able to add a new product
    And the user should be able to click the add product button
    And the user should be able to upload product image
    And the user should be able to write "iphone" the product name
    And the user should be able to select the product category
    And the user should be able to enter product price "100"
    Then the user should be able to add a new product

  @wip
  Scenario: the user should be able to edit, search and delete product
    And the user should be able to search product
    And the user should be able to find it by typing the product name "iphone" in the thumbnail bar
    And the user should be able to edit the selected product
    And user should be able to delete the added product



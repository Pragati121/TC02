Feature:Add items to cart
  Scenario:Adding items to cart
    Given User is in the Home Page
    When  User searched for Oppo mobile and printed its name on the UI
    And   Check the size and color of mobile and print the same on  UI
    And   Go to customer question & answer section and print top three question and answers
    And   Add item to cart and also verify it in the cart
    And   Go to shopping cart and increase the quantity
    Then  Verify the item in the cart and console the total amount of product
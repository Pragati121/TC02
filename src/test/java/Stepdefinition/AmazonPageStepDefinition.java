package Stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class AmazonPageStepDefinition extends BaseClass {

    @Given("User is in the Home Page")
    public void user_is_in_the_home_page() throws IOException {
        Setup();
    }

    @When("User searched for Oppo mobile and printed its name on the UI")
    public void user_searched_for_oppo_mobile_and_printed_its_name_on_the_ui() {
        pageFactory.getCartPage().clickOnSearchBar();
    }

        @And("Check the size and color of mobile and print the same on  UI")
        public void check_the_size_and_color_of_mobile_and_print_the_same_on_ui () {
 pageFactory.getCartPage().clickOnMobile();
        }
        @And("Go to customer question & answer section and print top three question and answers")
        public void go_to_customer_question_answer_section_and_print_top_three_question_and_answers () {

        }
        @And("Add item to cart and also verify it in the cart")
        public void add_item_to_cart_and_also_verify_it_in_the_cart () {

        }
        @And("Go to shopping cart and increase the quantity")
        public void go_to_shopping_cart_and_increase_the_quantity () {
        }
        @Then("Verify the item in the cart and console the total amount of product")
        public void verify_the_item_in_the_cart_and_console_the_total_amount_of_product () {

        }
    }


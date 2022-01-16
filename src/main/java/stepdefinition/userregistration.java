package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class userregistration {
    @Given("I am on user registration page")
    public void i_am_on_user_registration_page() {
        System.out.println("i am on user registration page");
    }
    @When("I enter below data")
    public void i_enter_below_data(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<List<String>> userDetails = dataTable.asLists();

        System.out.println("name ="+userDetails.get(0).get(0));
        System.out.println("email ="+userDetails.get(0).get(1));
        System.out.println("number = "+userDetails.get(0).get(2));
        System.out.println("city = "+userDetails.get(0).get(3));

    }
    @When("I click on Submit button")
    public void i_click_on_submit_button() {
        System.out.println("I click on submit button");
    }
    @Then("user should be added")
    public void user_should_be_added() {
        System.out.println("user should be added");
    }


    @When("^I enter (.+),(.+),(.+)$")
    public void i_enter_(String name, String email, String phone) throws Throwable {
        System.out.println("name="+name);
        System.out.println("email="+email) ;
        System.out.println("phone="+phone);
    }
}

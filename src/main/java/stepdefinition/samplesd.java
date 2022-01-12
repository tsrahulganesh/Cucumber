package stepdefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
public class samplesd {

    @Given("I am on Login page of billing")
    public void iAmOnLoginPageOfBilling() {
        
    }

    @When("I Enter correct Username and Password on billing")
    public void iEnterCorrectUsernameAndPasswordOnBilling() {
        
    }

    @And("I Click the Login button of billing page")
    public void iClickTheLoginButtonOfBillingPage() {
        
    }

    @Then("I should land on dashboard")
    public void iShouldLandOnDashboard() {
    }

    @When("I Enter INcorrect Username and Password on billing")
    public void iEnterINcorrectUsernameAndPasswordOnBilling() {
        
    }

    @When("I Enter Blank Username and Password on billing")
    public void iEnterBlankUsernameAndPasswordOnBilling() {
        
    }

    @When("I Enter Blank {string} and {string} on billing")
    public void iEnterBlankAndOnBilling(String username, String password) {
        System.out.println("username:+username");
        System.out.println("password:+password");
    }

    @When("I Enter INcorrect {string} and {string} on billing")
    public void iEnterINcorrectAndOnBilling(String username, String password) {
        System.out.println("username:+username");
        System.out.println("password:+password");
    }

    @When("I Enter correct {string} and {string} on billing")
    public void iEnterCorrectAndOnBilling(String username, String password) {
        System.out.println("username:+username");
        System.out.println("password:+password");
    }

    @RunWith(Cucumber.class)
    public static class MyStepDefinitions {


        @Given("^ Jump into the login page$")
        public void jump_into_the_login_page() throws Throwable {
            throw new PendingException();
        }

        @When("^ Enter correct Username and Password$")
        public void enter_correct_username_and_password() throws Throwable {
            throw new PendingException();
        }

        @And("^ Click the Login button$")
        public void click_the_login_button() throws Throwable {
            throw new PendingException();
        }

        @Then("^ I should able to jump into the Main page$")
        public void i_should_able_to_jump_into_the_main_page() throws Throwable {
            throw new PendingException();
        }



        @Given("^ I am on Login page of billing$")
        public void i_am_on_login_page_billing() throws Throwable {
            System.out.println("login page");
        }

        @When("^ I Enter INcorrect Username and Password on billing$")
        public void i_enter_Blank_username_and_password_on_billing() throws Throwable {
            System.out.println("username and pword");
        }

        @Then("^ I should land on dashboard$")
        public void i_should_land_dashboard() throws Throwable {
            System.out.println("login button");
        }

        @And("^ I Click the Login button of billing page$")
        public void i_click_the_login_button_billing_page() throws Throwable {
            System.out.println("login page");
        }


        @Given("^ I am on Login page of billing$")
        public void i_am_on_login_page_of_billing() throws Throwable {
            System.out.println("login page");
        }

        @When("^ I Enter Blank Username and Password on billing$")
        public void i_enter_incorrect_username_and_password_on_billing() throws Throwable {
            System.out.println("username and pword");
        }

        @Then("^ I should land on dashboard$")
        public void i_should_land_on_dashboard() throws Throwable {
            System.out.println("login button");
        }

        @And("^ I Click the Login button of billing page$")
        public void i_click_the_login_button_of_billing_page() throws Throwable {
            System.out.println("login page");
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package steps;

/**
 *
 * @author JOSE DARIO CARTAGENA
 */

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // Lógica para navegar a la página de login
        System.out.println("Navegar a la página de login.");
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        // Lógica para ingresar credenciales válidas
        System.out.println("Ingresando credenciales válidas.");
    }

    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
        // Lógica para verificar que el usuario es redirigido al dashboard
        System.out.println("Verificando que el usuario es redirigido al dashboard.");
    }
}


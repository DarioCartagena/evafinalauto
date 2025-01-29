/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package steps;

/**
 *
 * @author JOSE DARIO CARTAGENA
 */


import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("El usuario está en la página de inicio de sesión")
    public void usuarioEnPaginaInicioSesion() {
        System.out.println("Usuario en la página de inicio de sesión");
    }

    @When("Ingresa un nombre de usuario válido {string}")
    public void ingresaNombreUsuarioValido(String username) {
        System.out.println("Nombre de usuario ingresado: " + username);
    }

    @When("Ingresa una contraseña válida {string}")
    public void ingresaContrasenaValida(String password) {
        System.out.println("Contraseña ingresada: " + password);
    }

    @Then("El usuario debería ser redirigido al panel principal")
    public void usuarioRedirigidoPanelPrincipal() {
        System.out.println("Usuario redirigido al panel principal");
    }
}


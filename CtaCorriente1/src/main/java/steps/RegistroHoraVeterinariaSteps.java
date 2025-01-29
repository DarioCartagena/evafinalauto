package steps;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JOSE DARIO CARTAGENA
 */

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class RegistroHoraVeterinariaSteps {
    WebDriver driver;

    @Given("el usuario está en la página de agendamiento")
    public void abrirPaginaAgendamiento() {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/CtaCorriente/agendar.jsp");
    }

    @When("selecciona la fecha {string} y la hora {string}")
    public void seleccionarFechaHora(String fecha, String hora) {
        driver.findElement(By.name("fecha")).sendKeys(fecha);
        driver.findElement(By.name("hora")).sendKeys(hora);
    }

    @When("elige el veterinario {string}")
    public void seleccionarVeterinario(String veterinario) {
        driver.findElement(By.name("veterinario")).sendKeys(veterinario);
        driver.findElement(By.tagName("button")).click();
    }

    @Then("debe recibir la confirmación {string}")
    public void verificarConfirmacion(String mensajeEsperado) {
        String mensaje = driver.findElement(By.id("confirmacion")).getText();
        assertEquals(mensajeEsperado, mensaje);
        driver.quit();
    }
}

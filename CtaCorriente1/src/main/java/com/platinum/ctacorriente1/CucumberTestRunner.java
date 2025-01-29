/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platinum.ctacorriente1;

/**
 *
 * @author JOSE DARIO CARTAGENA
 */

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Ruta donde están los .feature
    glue = "com.platinum.ctacorriente1.steps", // Paquete donde están las definiciones de pasos
    plugin = { "pretty", "html:target/cucumber-reports.html" }, // Reportes
    monochrome = true // Salida más legible
)
public class CucumberTestRunner {
  
}

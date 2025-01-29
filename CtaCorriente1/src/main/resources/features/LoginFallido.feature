Feature: Inicio de Sesión Fallido

  Scenario: Usuario ingresa credenciales incorrectas
    Given el usuario está en la página de inicio de sesión
    When ingresa su usuario "usuario_invalido" y contraseña "incorrecta"
    Then debe ver un mensaje de error "Usuario o contraseña incorrectos"


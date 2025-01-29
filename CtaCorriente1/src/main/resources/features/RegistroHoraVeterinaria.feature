Feature: Registro de Hora Médica Veterinaria

  Scenario: Agendar una cita con el veterinario
    Given el usuario está en la página de agendamiento
    When selecciona la fecha "2024-02-01" y la hora "10:00 AM"
    And elige el veterinario "Dr. Juan Pérez"
    Then debe recibir la confirmación "Su hora ha sido agendada"


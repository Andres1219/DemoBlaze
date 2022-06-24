Feature: iniciar sesion en la aplicacion  DemoBlaze
  Yo como usuario de la aplicacion  DemoBlaze
  necesito iniciar sesion
  para acceder a las funcionalidades de la aplicacion

  @Login
  Scenario: Login exitoso
    Given soy un usuario de DemoBlaze con credenciales
    When ingreso informacion necesaria para iniciar sesion
    Then se realiza el login exitoso

  @Carrito
  Scenario: Agregar al carrito
    Given que soy un usuario de DemoBlaze
    When agrego un computador al carrito

    When ingreso para verificar carrito
    Then verifico que se encuentre agregado
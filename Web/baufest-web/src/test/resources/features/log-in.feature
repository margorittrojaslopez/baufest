#language: es
@LOGIN_REG
Característica: Product store


  @SIGNUP
  Escenario: sign up
    Dado que estoy en la plataforma de product store
    Cuando ingreso a sign up
    Y ingreso las credenciales del usuario
      | user      | pass  |
      | margoritt | 123   |
    Entonces doy clic en sign up

  @LOGINLOGOUT
  Escenario: Login y logout con el usuario dado de alta
    Dado que estoy en la plataforma de product store
    Cuando ingreso a login
    Y ingreso las credenciales del usuario creado
      | user      | pass  |
      | margoritt | 123   |
    Y doy click en login
    Entonces doy click en logout


#  @ADDLAP
#  Escenario: Agregar laptop al carrito y verificar
#    Dado que estoy en la plataforma de product store
#    Cuando doy click en laptops
#    Y selecciono una laptop
#    Entonces doy click en add to cart


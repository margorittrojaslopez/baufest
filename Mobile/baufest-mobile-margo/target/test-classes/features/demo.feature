#language:es

Característica: Ingreso a webdriver demo

   @SIGNGUP
   Esquema del escenario: Sing up en la aplicacion
     Dado que me encuentro en la aplicación webdriver
     Cuando le doy click a loguin
     Y le doy click a sign up
     Y ingreso el correo electronico "<correo>"
     Y ingreso la contrasena "<pass>"
     Y confirmo la contrasena "<pass>"
     Y click en sign up
     Entonces valido que se confirma sign up

     Ejemplos:
       | correo                        | pass     |
       | margorittrojaslopez@gmail.com | 73621340 |

  @LOGIN
  Esquema del escenario: Login en la aplicacion
    Dado que me encuentro en la aplicación webdriver
    Cuando le doy click a loguin
    Y ingreso el correo electronico "<correo>"
    Y ingreso la contrasena "<pass>"
    Y click en login
    Entonces valido que se confirma login

    Ejemplos:
      | correo                        | pass     |
      | margorittrojaslopez@gmail.com | 73621340 |

  @FORM
  Esquema del escenario: Form components
    Dado que me encuentro en la aplicación webdriver
    Cuando le doy click a form
    Y ingreso input field "<input>"
    Y clic en dropdown
    Y click en appium awesome
    Y click en active
    Entonces valido que se confirma el active

    Ejemplos:
      | input    |
      | computer |

  @WEBVIEW
  Esquema del escenario: Navegar en webview
    Dado que me encuentro en la aplicación webdriver
    Cuando le doy click a webview
    Y click en el buscador
    Y ingreso la palabra a buscar "<docs>"
    Y clic en browser
    Entonces valido que se confirma la busqueda

    Ejemplos:
      | docs    |
      | browser |
# WebService

__Nota: Los siguientes pasos para WebService se realizaron desde Postman importando el CURL para crear el REQUEST (Para los 3 casos, el Status code es 200 tal cual se muestran en las imágenes). El collection del POSTMAN se encuentra en la carpeta /baufest/WebService/__

## 1. Agregar una mascota realizando un POST al path /v2/pet:



![image](https://user-images.githubusercontent.com/123605259/214721710-5ae1ed4c-2229-47ea-b188-46783f1f760c.png)




## 2. Realizar un GET /v2/pet/{petId} para obtener una mascota existente:



![image](https://user-images.githubusercontent.com/123605259/214722025-9864558d-a2c9-48aa-91de-b5cd969801f9.png)




## 3. Modificar una mascota existente mediante PUT al path /v2/pet: 



![image](https://user-images.githubusercontent.com/123605259/214723762-524b037a-b863-4443-a518-5844a20f4886.png)

# Mobile

__Nota: Los siguientes pasos para Mobile se realizaron desde Intellij utilizando el lenguaje java, para el escenario de pruebas se uso Cucumber, se implementa un gestor de dependencias Maven.__

## 1. Sección Login:
__Se realiza el Login, este se ejecuta ingresando a la carpeta src/java/runner/DemoTest. En Tags se coloca el nombre del caso que se quiere probar, en este caso LOGIN, de acuerdo al feature__


![login](https://user-images.githubusercontent.com/123605259/215004909-a074dca0-a672-4671-a478-45b813590467.png)


__Se realiza el Signup, este se ejecuta ingresando a la carpeta src/java/runner/DemoTest. En Tags se coloca el nombre del caso que se quiere probar, en este caso SIGNGUP, de acuerdo al feature__


![singup1](https://user-images.githubusercontent.com/123605259/215009422-e1101674-7716-4131-b0e5-e806dea39489.png)


## 2. Sección Forms:
__Se realiza el Forms, este se ejecuta ingresando a la carpeta src/java/runner/DemoTest. En Tags se coloca el nombre del caso que se quiere probar, en este caso FORM, de acuerdo al feature__


![FORM](https://user-images.githubusercontent.com/123605259/215009531-28b9ca10-741c-4e0c-b3aa-a47febacf5c1.png)


## 3. Sección Webview:
__Se realiza el Webview, este se ejecuta ingresando a la carpeta src/java/runner/DemoTest. En Tags se coloca el nombre del caso que se quiere probar, en este caso WEBVIEW, de acuerdo al feature__


![webviewer](https://user-images.githubusercontent.com/123605259/215009742-56a538b2-6c5d-4dd9-a145-e1e06d7b6632.png)







# Practicando con Java: Challenge conversor de monedas. 

Desarrollo de una pequeña aplicación para conversión de divisas en Java. 

## Description

En este primer challenge se desarrolló un aplicacción que permite al usuario seleccionar elementos de una lista de opciones que contiene diferentes monedas. 
En este caso se optó por utilizar las 5 monedas más comercilizadas en el mundo las cuales son: 
- Dólar estadounidense (USD),
- Euro (EUR),
- Yen japonés (JPY),
- Libra esterlina (GBP),
- Dólar australiano (AUD).
Dichos datos fueron obtenidos de la siguiente página: ``https://fxssi.es/el-top-5-de-las-divisas-mas-negociadas``

 Así mismo se inluyó una moneda local adicional la cual es este caso el Peso mexicano (MXN). 

 Para el desarrollo de la aplicación se utilizó una API de libre acceso denominada Exchange Rate.
 Mediante la creación de una cuenta mediante un correo, se obtiene una API Key para poder acceder a los datos de la API. 
 Al analizar esta API observamos que se genera de manera predeterminada el siguiente enlace: /n 
  ``https://v6.exchangerate-api.com/v6/API KEY/latest/MONEDASOLICITADA`` /n
Al final se debe colocar la moneda de la cual se quieren obtener los datos, siendo que se da el valor de 1 a esa moneda junto con las equivalencias en cada moneda. 
A continuación se muestra un ejemplo: 
![Ejemplo con parámetros de una moneda](https://github.com/JuanEMacias/Conversor_Divisas_One_G6/assets/165862467/67372b66-dcc2-419e-9c54-48d9bcb28b9f)
En este caso para poder realizar la conversión se debería pasar el parámetro de moneda a convertir, dandolo como default en la API, siendo que se daba a esta el valor de 1, 
por lo cual para realzir la conversión de debe de generar una bsuqueda de la moneda que deseamos obtener a través de GSON, para posteriormente multiplicar el monto deseado por el valor dado en la API. 
Sin embargo, tras analizar la documentación de la API más a fondo se observó que si se cambiaba el parámetro ``/latest`` por el parámetro ``/pair`` , nos permite realizar la conversión de divisas directamente sin necesidad de operaciones dentro del código. 
En este caso la dirección de la API quedaría de la sigiente forma:/n
``https://v6.exchangerate-api.com/v6/API KEY/pair/MONEDA SOLICITADA/MONEDA A OBTENER/CANTIDAD A CONVERTIR ``
Una vez establecida esta dirección, se obtiene la siguiente respuesta: /n
![Ejemplo con parámetros de dos monedas y monto](https://github.com/JuanEMacias/Conversor_Divisas_One_G6/assets/165862467/882fcdc3-c45f-40ee-a7b3-5e6accaacc5f)



Una vez obtenido esta API, se consumen los datos requridos lso cuales ya están dados en la dirección y se obtiene el reaultado extrayendo el parámtero ``conversion_result`` /n 

Para temas de intereacción con el usuario se desarrolló un menú que permite acceder a las diferentes opciones de conversión entre monedas permitiendo acceder a la opción deseada mediante un número. 
Mediante un ciclo while se generó un loop para que el usuario pueda realizar las conversiones que desee, dando una opción para salir de la aplicación. 
El menú interactivo queda de la siguiente manera:
 ```
 *****************************************************************************************************************
                 Menú de combinaciones para conversión de Dólar estadounidense                    
                  1- Dólar estadounidense (USD) a Euro (EUR)
                  2- Dólar estadounidense (USD) a Yen japonés (JPY)
                  3- Dólar estadounidense (USD) a Libra esterlina (GBP)
                  4- Dólar estadounidense (USD) a Dólar australiano (AUD)
                  5- Dólar estadounidense (USD) a Peso mexicano (MXN)
                *****************************************************************************************************************
                 Menú de combinaciones para conversión de Euro
                  11- Euro (EUR)	a Dólar estadounidense (USD)
                  12- Euro (EUR)	a Yen japonés (JPY)
                  13- Euro (EUR)	a Libra esterlina (GBP)
                  14- Euro (EUR)	a Dólar australiano (AUD)
                  15- Euro (EUR) a Peso mexicano (MXN)
                *****************************************************************************************************************
                 Menú de combinaciones para conversión de Yen japonés
                 21- Yen japonés (JPY)	a Euro (EUR)
                 22- Yen japonés (JPY)	a Dólar estadounidense (USD)
                 23- Yen japonés (JPY)	a Libra esterlina (GBP)
                 24- Yen japonés (JPY)	a Dólar australiano (AUD)
                 25- Yen japonés (JPY) a Peso mexicano (MXN)
                *****************************************************************************************************************
                 Menú de combinaciones para conversión de Libra esterlina
                  31- Libra esterlina (GBP) a Euro (EUR)
                  32- Libra esterlina (GBP) a Yen japonés (JPY)
                  33- Libra esterlina (GBP) a Dólar estadounidense (USD)
                  34- Libra esterlina (GBP) a Dólar australiano (AUD)
                  35- Libra esterlina (GBP) a Peso mexicano (MXN)
                *****************************************************************************************************************
                 Menú de combinaciones para conversión de Libra Dólar australiano
                  41- Dólar australiano (AUD) a	Euro (EUR)
                  42- Dólar australiano (AUD) a	Yen japonés (JPY)
                  43- Dólar australiano (AUD) a	Libra esterlina (GBP)
                  44- Dólar australiano (AUD) a	Dólar estadounidense (USD)
                  45- Dólar australiano (AUD) a Peso mexicano (MXN)
                *****************************************************************************************************************
                 Menú de combinaciones para conversión de Peso Mexicano                
                  51- Peso mexicano (MXN) a	Euro (EUR)
                  52- Peso mexicano (MXN) a	Yen japonés (JPY)
                  53- Peso mexicano (MXN) a	Libra esterlina (GBP)
                  54- Peso mexicano (MXN) a	Dólar estadounidense (USD)
                  55- Peso mexicano (MXN) a Dólar australiano (AUD)
                *****************************************************************************************************************
                  Presione 10 para salir de la aplicación                                                                                   
                -----------------------------------------------------------------------------------------------------------------
 ```
## Requerimientos

### Dependencies

* Para la elaboración de este reto se utilizó el IDE Intellij
* Se utilizó la version Java 17
* Se utilizó la librería json y gson para extraer datos de la API utilizada 

### Uso del programa
Para poder ejecutar el programa se debe acceder a la clase main llamada AppEjecutable, une vez se corre esta clase se debe colocar el número de la opción deseada y una vez selecionada la aplicació nos pedirá el monto a convertir. 
En este caso, el parámetro se da por default en formato String ya que la API reconoce el número con este formato, teniendo como ventaja que se puede dar el número como si fuera int o double, 
es decir que si quisieramos convertir $500 dólares a euros puede ser escrito de ambas formas (500.00 & 500). 
Una vez terminada la conversión se deberá teclear el número 10 dos veces para poder salir de la aplicación correctamente. 

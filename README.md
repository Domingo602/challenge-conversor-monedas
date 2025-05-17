<h1 align="center"> DESAFÍO CONVERSOR DE MONEDAS </h1>
<h2>FUNCIONALIDADES. </h2>


- 1) El Menú permite realizar 6 tipos de conversión de Monedas.

     1.1) De Dólar (USD) a Peso Chileno (CLP).
     1.2) De Peso Chileno (CLP) a Dólar (USD).
     1.3) De Dólar (USD) a Real Brasileño (BRL).
     1.4) De Real Brasileño (BRL) a Dólar (USD).
     1.5) De Dólar (USD) a Peso Colombiano (COP).
     1.6) De Peso Colombiano (CLP) a Dólar (USD).

     La aplicación permite elegir una de las 6 opciones e ingresar el valor a convertir.

- 2) Validar entrada.

Se valida que la opción ingresada corresponda a una de las 6 posibles.

- 3) Uso de la API Exchange Rate.

Se utiliza esta API que permite a partir de 3 párametros, obtener la conversión requerida.
     3.1) Moneda Base.                  Moneda origen que se desea convertir.
     3.2) Moneda Objetivo.              Moneda resultante de la conversión.
     3.3) Amount.                       Monto que se desea convertir, en moneda base.
     3.4) Conversion Resultado.         Monto resultante de la conversión, en moneda objetivo.

     La API a partir de los 3 primeros parámetros retorna la conversión.

- 4) Arquitectura de Objetos.

     Clase Principal.                   Clase que centraliza la ejecución de la APP.
     Clase Cambio.                      Clase que tiene los 3 campos del Request de la API y 2 que devuelve, tasa y conversión.
     Clase Exchange Rate.               Record que tiene los 4 campos Response de la API. Las 2 monedas, la tasa y la conversión.
     Clase Consulta Cambios.            Clase que realiza la llamada a la API, convierte el JSON de la API en el Record ExchangeRate.
     Clase Menu Conversor.              Clase con el menú a ser desplegado, y arreglos con la relación opciones y monedas.

<h3>ESTADO DEL PROYECTO: TERMINADO. </h3>

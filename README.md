# Lacteos-la-Pe-ita-en-Java

Servicio de apoyo Lácteos La Peñita

Hola Bienvenido a lácteos la Peñita

El primer paso para realizar este programa fue crear una clase por cada operaciòn a realizar:
public class Suma,
Public class Multiplicaciòn,
Public class Promedio,
Dentro de cada clase se utilizó "Float.parseFloat" para realizar una conversión de los datos,
Posteriormente, se creó una clase y método para dar orden al funcionamiento del programa con lo siguiente:
package AdrianaMoreno; Nombre del paquete,
import java.util.Scanner; Traemos la entrada del usuario por teclado,
public class Main; Método principal,
Variables de las clases ya nombradas y además la del scanner:
static public Suma objetosuma; 
static public Multiplicación objetomult; 
static public Promedio objetoprom; 
static public Scanner lector;
Creamos un ciclo para la continuación del menú si el usuario desea seguir escogiendo alguna de las opciones.
cicloprincipal:while (true) 
Proseguimos con las secciones por cada caso dentro del menú, utilizando por cada operación:
switch-case
Rompemos el ciclo principal del menú y el programa
break cicloprincipal;
default: throw new AssertionError();
​

package AdrianaMoreno;

import java.util.Scanner;

public class Main {

    static public Suma objetosuma;
    static public Multiplicacion objetomult;
    static public Promedio objetoprom;
    static public Scanner lector;

    public static void main(String[] args) {
        lector = new Scanner(System.in);
        cicloprincipal:while (true) {
            System.out.println("BIENVENIDO A LACTEOS LA PENITA");
            System.out.println("Menu principal");
            System.out.println("1) Realizar suma");
            System.out.println("2) Realizar multiplicación");
            System.out.println("3) Realizar promedio");
            System.out.println("4) Salir");
            int seleccion = lector.nextInt();
            switch (seleccion) {
                case 1:
                    System.out.println("ingrese los 5 numeros para realizar la suma");
                    objetosuma= new Suma();
                    float res= objetosuma.realizarSuma(lector.nextInt(), lector.nextInt(), 
                            lector.nextDouble(), lector.nextDouble(), lector.nextDouble());
                    System.out.println("el resultado de la suma es "+res);
                    break;
                case 2:
                    System.out.println("ingrese los 5 numeros para realizar la multiplicacion");
                    objetomult= new Multiplicacion();
                    float res2= objetomult.realizarMultiplicacion(lector.nextInt(), lector.nextInt(), 
                            lector.nextDouble(), lector.nextDouble(), lector.nextDouble());
                    System.out.println("el resultado de la multiplicacíon es "+res2);
                    break;
                case 3:
                    System.out.println("ingrese los 5 numeros para realizar el promedio");
                    objetoprom= new Promedio();
                    float res3= objetoprom.realizarPromedio(lector.nextInt(), lector.nextInt(), 
                            lector.nextDouble(), lector.nextDouble(), lector.nextDouble());
                    System.out.println("el resultado del promedio es "+res3);
                    break;
                case 4:
                    System.out.println("que tenga buen dia ");
                    break cicloprincipal;
                default:
                    throw new AssertionError();
            }

        }
    }

}

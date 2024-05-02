package com.challenge.conversor.principal;

import java.util.Scanner;
import java.io.IOException;


public class AppEjecutable {
    public static void main(String[] args) throws IOException {
        Scanner lectura = new Scanner(System.in);

        RequestAPI consultaMoneda = new RequestAPI();

        System.out.println("""
                +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n
                App para conversión de  Divisas. \n
                +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n
                Analiza las opciones de conversión y teclea el número correspondiente a la opción deseada, por ejemplo si deseas convertir
                dólares amnericanos a euros teclea el número 1
                """);

        String menu = """
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
                
                """;
        int opcion = 0;

        while (opcion != 10) {
            System.out.println(menu);
            System.out.println(" A continuación, teclea el número correspondiente a la opción deseada:");
            opcion = lectura.nextInt();
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce el monto a convertir o presiona 10 para salir: ");
            String monto = teclado.nextLine();

            switch (opcion) {
                case 1:
                    Divisa conversor = consultaMoneda.solicitud("USD","EUR", monto);
                    System.out.println(monto+"  USD son: " + conversor.conversion_result() + " EUR.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 2:
                    conversor = consultaMoneda.solicitud("USD","JPY", monto);
                    System.out.println(monto+"  USD son: " + conversor.conversion_result() + " JPY.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 3:
                    conversor = consultaMoneda.solicitud("USD","GBP", monto);
                    System.out.println(monto+"  USD son: " + conversor.conversion_result() + " GBP.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 4:
                    conversor = consultaMoneda.solicitud("USD","AUD", monto);
                    System.out.println(monto+"  USD son: " + conversor.conversion_result() + " AUD.");
                    System.out.println("---------------------------------------------------------");;
                    break;
                case 5:
                    conversor = consultaMoneda.solicitud("USD","MXN", monto);
                    System.out.println(monto+"  USD son: " + conversor.conversion_result() + " MXN.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 11:
                    conversor = consultaMoneda.solicitud("EUR","USD", monto);
                    System.out.println(monto+"  EUR son: " + conversor.conversion_result() + " USD.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 12:
                    conversor = consultaMoneda.solicitud("EUR","JPY", monto);
                    System.out.println(monto+"  EUR son: " + conversor.conversion_result() + " JPY.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 13:
                    conversor = consultaMoneda.solicitud("EUR","GBP", monto);
                    System.out.println(monto+"  EUR son: " + conversor.conversion_result() + " GBP.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 14:
                    conversor = consultaMoneda.solicitud("EUR","AUD", monto);
                    System.out.println(monto+"  EUR son: " + conversor.conversion_result() + " AUD.");
                    System.out.println("---------------------------------------------------------");
                    break;

                case 15:
                    conversor = consultaMoneda.solicitud("EUR","MXN", monto);
                    System.out.println(monto+"  EUR son: " + conversor.conversion_result() + " MXN.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 21:
                    conversor = consultaMoneda.solicitud("JPY","EUR", monto);
                    System.out.println(monto+"  JPY son: " + conversor.conversion_result() + " EUR.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 22:
                    conversor = consultaMoneda.solicitud("JPY","USD", monto);
                    System.out.println(monto+"  JPY son: " + conversor.conversion_result() + " USD.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 23:
                    conversor = consultaMoneda.solicitud("JPY","GBP", monto);
                    System.out.println(monto+"  JPY son: " + conversor.conversion_result() + " GBP.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 24:
                    conversor = consultaMoneda.solicitud("JPY","AUD", monto);
                    System.out.println(monto+"  JPY son: " + conversor.conversion_result() + " AUD.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 25:
                    conversor = consultaMoneda.solicitud("JPY","MXN", monto);
                    System.out.println(monto+"  JPY son: " + conversor.conversion_result() + " MXN.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 31:
                    conversor = consultaMoneda.solicitud("GBP","EUR", monto);
                    System.out.println(monto+"  GBP son: " + conversor.conversion_result() + " EUR.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 32:
                    conversor = consultaMoneda.solicitud("GBP","JPY", monto);
                    System.out.println(monto+"  GBP son: " + conversor.conversion_result() + " JPY.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 33:
                    conversor = consultaMoneda.solicitud("GBP","USD", monto);
                    System.out.println(monto+"  GBP son: " + conversor.conversion_result() + " USD.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 34:
                    conversor = consultaMoneda.solicitud("GBP","AUD", monto);
                    System.out.println(monto+"  GBP son: " + conversor.conversion_result() + " AUD.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 35:
                    conversor = consultaMoneda.solicitud("GBP","MXN", monto);
                    System.out.println(monto+"  GBP son: " + conversor.conversion_result() + " MXN.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 41:
                    conversor = consultaMoneda.solicitud("AUD","EUR", monto);
                    System.out.println(monto+"  AUD son: " + conversor.conversion_result() + " EUR.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 42:
                    conversor = consultaMoneda.solicitud("AUD","JPY", monto);
                    System.out.println(monto+"  AUD son: " + conversor.conversion_result() + " JPY.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 43:
                    conversor = consultaMoneda.solicitud("AUD","GBP", monto);
                    System.out.println(monto+"  AUD son: " + conversor.conversion_result() + " GBP.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 44:
                    conversor = consultaMoneda.solicitud("AUD","USD", monto);
                    System.out.println(monto+"  AUD son: " + conversor.conversion_result() + " USD.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 45:
                    conversor = consultaMoneda.solicitud("AUD","MXN", monto);
                    System.out.println(monto+"  AUD son: " + conversor.conversion_result() + " MXN.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 51:
                    conversor = consultaMoneda.solicitud("MXN","EUR", monto);
                    System.out.println(monto+"  MXN son: " + conversor.conversion_result() + " EUR.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 52:
                    conversor = consultaMoneda.solicitud("MXN","JPY", monto);
                    System.out.println(monto+"  MXN son: " + conversor.conversion_result() + " JPY.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 53:
                    conversor = consultaMoneda.solicitud("MXN","MXN", monto);
                    System.out.println(monto+"  MXN son: " + conversor.conversion_result() + " MXN.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 54:
                    conversor = consultaMoneda.solicitud("MXN","GBP", monto);
                    System.out.println(monto+"  MXN son: " + conversor.conversion_result() + " GBP.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 55:
                    conversor = consultaMoneda.solicitud("MXN","USD", monto);
                    System.out.println(monto+"  MXN son: " + conversor.conversion_result() + " USD.");
                    System.out.println("---------------------------------------------------------");
                    break;
                case 10:
                    System.out.println("App cerrada");
                    System.out.println("---------------------------------------------------------");
                    break;
                default:
                    System.out.println("Lo sentimos, esa opción no es válida.");
                    System.out.println("---------------------------------------------------------");
                    break;
            }
        }




    }
}





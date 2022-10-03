/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part2;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Pablo Rodriguez
 */
public class PART2 {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("LISTADO DE PROGRAMAS");
        System.out.println("1. Area de Figura");
        System.out.println("2. Numero primo true/false");
        System.out.println("3. Factorial de un numero");
        System.out.println("4. Decimal -> Binario");
        System.out.println("5. Elevador");
        System.out.println("6. Supermercado");
        System.out.println("7. Ordenar vector");
        System.out.println("8. Par=2*n / Impar=3*n");
        System.out.println("9. Divisores de un numero entre 1 y 1,000");
        System.out.println("10. Exponente");
        System.out.println("11. SALIR");
        Scanner sc= new Scanner(System.in);
        CLASEPARTE2 hola = new CLASEPARTE2();
        double base, resultado, rt, b, h, rad, rc, pre, can, sub, des, tot;
        int pr, primo, prim, fac, i, rf, asce, rasce, painp, rpainp, numero, div, ero, contador, ase, exp, ope;
        String no, pro;
        int a = sc.nextInt();
        do{
        switch (a){
            
            case 1:
                System.out.println("SABER EL AREA DE UNA FIGURA CIRCULO CUADRADO TRIANGULO");
                 System.out.println("a que figura decea sacarle el area 1.cuadrado, 2.triangulo, 3.circulo");
                 Scanner of= new Scanner(System.in);
                 int f = of.nextInt();
                 if (f==1){
                     System.out.println("INGRESE LA BASE DEL CUADRADO");
                     System.out.println("INGRESE EL VALOR DE LA BASE");
                     base = sc.nextDouble();
                     resultado= hola.cuadrado(base);
                     System.out.println("RESULTADO: "+ resultado);
                 }
                 else if (f==2){
                     System.out.println("INGRESE LA BASE DEL TRIANGULO");
                     System.out.println("INGRESE EL VALOR DE LA BASE");
                     b = sc.nextDouble();
                     System.out.println("INGRESE EL VALOR DE LA ALTURA");
                     h = sc.nextDouble();
                     rt = hola.triangulo(b, h);
                     System.out.println("RESULTADO: "+ rt);
                 }
                 else if (f==3){
                     System.out.println("INGRESE LA BASE DEL CIRCULO");
                     System.out.println("INGRESE EL VALOR DEL RADIO");
                     rad = sc.nextDouble();
                     rc= hola.circulo(rad);
                     System.out.println("RESULTADO: "+ rc);
                 }
                 else{
                     System.out.println("NO SELECCIONO UNO CORRECTO");
                 }

                System.out.println("DESEA SALIR? 11=si, no= numerodelmenu");
            a = sc.nextInt();
                break;  
            case 2:
                System.out.println("INGRESE UN NUMERO PARA SABER SI ES PRIMO");
                prim = sc.nextInt();
                primo = hola.primo(prim);
                
                if (primo==1){
                    System.out.println("ES PRIMO");
                }
                else if (primo==0){
                    System.out.println("NO ES PRIMO");
                }
                
                System.out.println("DESEA SALIR? 11=si, no= numerodelmenu");
            a = sc.nextInt();
                break;
                
                
            case 3:   
                System.out.println("PROGRAMA PARA SABER EL FACTORIAL DE UN NUMERO");
                fac = sc.nextInt();
                rf = hola.factorial(fac);
                System.out.println("RESPUESTA ES: " +rf);
                System.out.println("DESEA SALIR? 11=si, no= numerodelmenu");
            a = sc.nextInt();
            
                break;
            case 4:
                System.out.println("CONVERTIR DECIMAL A BINARIO");
                
                System.out.println("DESEA SALIR? 11=si, no= numerodelmenu");
            a = sc.nextInt();
                break;
            case 5:
                System.out.println("ASCENSOR 1 - 10");
                asce = sc.nextInt();
                
                rasce= hola.ascensor(asce);
                System.out.println("NIVEL FINAL 10");
                System.out.println("DESEA SALIR? 11=si, no= numerodelmenu");
            a = sc.nextInt();
                break;
            case 6:
                System.out.println("DESCUENTO DE ABARROTES");
                System.out.println("NOMBRE DEL CLIENTE");
                no = sc.nextLine();
                System.out.println("PRODUCTO");
                pro = sc.nextLine();
                System.out.println("PRECIO");
                pre =sc.nextDouble();
                System.out.println("CANTIDAD");
                can = sc.nextDouble();
                System.out.println("DESCUENTO del 20% si la compra es igual o mayor a 1000");
                System.out.println("TOTAL A PAGAR");
                tot = hola.descuento(can, pre);
                System.out.println("TOTAL: "+ tot);
                System.out.println("DESEA SALIR? 11=si, no= numerodelmenu");
            a = sc.nextInt();
                break;
            case 7:
                System.out.println("ORDENAR VECTOR V={6, 10, 5, 4, 2, 0, 11, 7, 39, 3, 1, 8, 94, 022, 95}.");
                 List<Integer> slist = Arrays.asList(6, 10, 5, 4, 2, 0, 11, 7, 39, 3, 1, 8, 94, 022, 95);
                 Collections.sort(slist, Collections.reverseOrder());
                 System.out.println("V: "+ slist);
                 System.out.println("DESEA SALIR? 11=si, no= numerodelmenu");
                a = sc.nextInt();
                break;
            case 8:
                System.out.println("2 par 3 impar");
                numero = sc.nextInt();
                rpainp= hola.painp(numero);
                System.out.println("NUMERO: "+ numero + " RESULTADO:" + rpainp);
                System.out.println("DESEA SALIR? 11=si, no= numerodelmenu");
            a = sc.nextInt();
                break;
            case 9:
                System.out.println("DIVISORES DE NUMEROS 1 HASTA 1000");
                do{
                System.out.println("Introduzca el numero a dividir:");
                ero=sc.nextInt();
                }while(ero<=0);

                for (int t=1; t<=ero; t++){
                if(ero%t==0){
                System.out.println(t);
                }
                }              
                System.out.println("DESEA SALIR? 11=si, no= numerodelmenu");
            a = sc.nextInt();
                break;
            case 10:
                System.out.println("BASE Y EXPONENTE");
                System.out.println("INGRESE UNSA BASE DEBE ESTAR ENTRE 1 Y 10");
                ase= sc.nextInt();
                System.out.println("INGRESE UN EXPONENTE");
                exp = sc.nextInt();
                tot = hola.potencia(ase, exp);
                System.out.println("RESPUESTA: "+ tot);
                
                System.out.println("DESEA SALIR? 11=si, no= numerodelmenu");
            a = sc.nextInt();
                break;
            case 11: 
                System.out.println("DESEA SALIR? 11=si, no= numerodelmenu");
            a = sc.nextInt();
                break;
        }
        }while(a!=11);


    }
}
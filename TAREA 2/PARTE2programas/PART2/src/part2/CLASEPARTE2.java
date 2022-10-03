/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2;


/**
 *
 * @author Pablo Rodriguez
 */
public class CLASEPARTE2 {

    public double cuadrado (double base){
        double resultado;
        resultado = base *base;
        return resultado;
    }
     public double triangulo(double b, double h){
         double rt;
         rt= b*h/2;
         return rt;
     }
    public double circulo(double rad){
         double rc;
         rc= rad*rad*3.1416;
         return rc;
     }
    public int primo(int prim){
        int primo;
        prim=prim/2;
        
        if (prim!=1) {
            primo=1;
        return primo=1;
        }
        else{
                 primo=0;
        return primo=0;
        }

    }
    public int factorial(int fac){
        int rf=1;
        for (int i=2;i<=fac;i++){
            rf=rf*i;
        }
    return rf;
    
}
    public int binarios(int bin){
        int rb=0;
        
        
        return rb;
    }
    public int ascensor(int asce){
        int rasce=0;
        do{
            asce=asce+1;
            rasce++;
            System.out.println("NIVEL: "+ asce + "SUBIÓ: "+rasce+"NIVELES");  
        }while(asce<=9);
        return rasce;
    }
    public double descuento(double can, double pre){
        double tot=0;
        double sub=0;
        sub=can*pre;
        
        if (sub>=1000){
            tot = sub *0.8;
        }
        else{
            tot=sub;
        } 
            
        return tot;      
    }
    public int vector(int numeros){
        int brrr=0;
        
        return brrr;
    }
    public int painp(int numero){
        int rpainp=0;
        if (numero %2==0){
            rpainp = numero*2;
        }
        else {
           rpainp = numero *3;
            
        }
        
        return rpainp;
    }
    public int potencia(int ase, int exp){
        int ope=0;
        if (ase<=10){
            if (exp<=4){
                if(exp==1){
                    ope=ase;
                    return ope;
                }
                if(exp==2){
                    ope=ase*ase;
                    return ope;
                }
                if(exp==3){
                    ope=ase*ase*ase;
                    return ope;
                }
                if(exp==4){
                    ope=ase*ase*ase*ase;
                    return ope;
                }
            }
        
            else
            {
                System.out.println("NUMERO MUY GRANDE debe estar en tre 1 y 4");
            }
        }
        else{
            System.out.println("NUMERO UY GRANDE debe estar entre 1 y 10");
        }
        
        return ope;
    }
}

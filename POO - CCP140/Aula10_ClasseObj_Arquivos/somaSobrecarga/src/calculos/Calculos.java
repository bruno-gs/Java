/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

/**
 *
 * @author fei
 */
public class Calculos {

    public  double  soma()  {
        return 0;
    }  

    public  double  soma(double num1,  double num2)  {
        return num1 + num2;
    }

    public  int  soma(double num1, double num2, double num3)  {
        return (int) (num1 + num2 + num3);
    }  

    public  double  soma(double[] numeros)  {
        double resultado = 0;
        for( double i : numeros) {
            resultado += i;
        }
        return resultado;
    }  
}


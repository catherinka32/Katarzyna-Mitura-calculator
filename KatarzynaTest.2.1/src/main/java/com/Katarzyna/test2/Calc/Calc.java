package com.Katarzyna.test2.Calc;

/**
 * Created by Mitura on 2017-06-30.
 */
class Calc{
    double a;
    double b;
    public Calc(double a, double b){
        this.a = a;
        this.b = b;
    }
    public void sumAandB(){
        double total = a + b;
        System.out.println("Total a and b amounts: " + total);
    }
    public void substractAfromB(){
        double difference = b - a ;
        System.out.println("Difference b and a amounts: "+ difference);
    }
    public void productAandB(){
        double product = a * b;
        System.out.println("Product a and b amounts: " + product);
    }
    public void quotientAandB(){
        if(b == 0){
            System.out.println("Zero as denominator is not good idea");
        }else{
            double quotient = a / b;
            System.out.println(String.format("Quotient a and b amounts:  %1.2f", quotient));
        }
    }
}
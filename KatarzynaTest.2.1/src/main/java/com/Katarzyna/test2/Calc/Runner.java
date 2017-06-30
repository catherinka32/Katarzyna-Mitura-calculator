package com.Katarzyna.test2.Calc;

/**
 * Created by Mitura on 2017-06-30.
 */
public class Runner{
    public static void main(String[] args){

        Calc calculator = new Calc(5.0, 3.0);
        calculator.sumAandB();
        calculator.substractAfromB();
        calculator.productAandB();
        calculator.quotientAandB();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit5042.tutex.calculator;
import javax.ejb.Remote;

/**
 *
 * @author apple
 */
@Remote
public interface MonthlyPaymentCalculator {
    double calculate(double principle, int year, double interestRate);
}

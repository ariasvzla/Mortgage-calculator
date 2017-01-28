/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mortgagecalculator;

/**
 *
 * @author Arias.E
 */
public class MortgageCalculator {
    private double loan;
    private double interest;
    private int terms;
    private double mp;
    private double mi;
    private double lm;
    
    public MortgageCalculator(){
        loan=0.0;
        interest=0.0;
        terms=0;
        mp=0.0;
        mi=0.0;
        lm=0.0;
        
    }
    
    public void setLoan(double loan){
        
        this.loan=loan;
        
    }
    public void setInterest(double interest){
        this.interest=interest;
        
    }
    public void setTerms(int terms){
        this.terms=terms;
        
    }
    public void compute(){
        
         mi=interest/(12*100);
         lm= terms*12;
            
         mp= loan* ( mi*((Math.pow(1+mi,lm)) /  (Math.pow(1+mi,lm)-1)));
          
    }
    
    public double getResult(){
        return mp;
    }
    
}


package tenchapter10;


import java.util.Scanner;


public class TenChapter10 {

    
    public static void main(String[] args) {
        
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter annual interest rate for example, 8.25");
        double annualInterestRate=scanner.nextDouble();
        
        System.out.println("Enter the number of years as an intager: ");
        int numberOfYears=scanner.nextInt();
        
        System.out.println("Enter loan amount, for example, 120000.95");
        double loanAmount=scanner.nextDouble();
        Loan loan=new Loan(annualInterestRate,numberOfYears,loanAmount);
      
        System.out.printf("The loan was created on %s\n"+"The monthly payment is %.2f\n",loan.getLoanDate(),
                loan.getMonthlyPayment(),loan.getTotalPayment());
    }
    
}
class Loan{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;
    
    /**Default constructor */
    public Loan(){
       this(2.5,1,100);
    }
    public Loan(double annualInterestRate,int numberOfYears,double loanAmount){
        this.annualInterestRate=annualInterestRate;
        this.numberOfYears=numberOfYears;
        this.loanAmount=loanAmount;
        
        loanDate = new java.util.Date();
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterest(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
    public int getNumberOfYears(){
        return numberOfYears;
    }
      
    public void setNumberOfYears(int numbersOfYears){
        this.numberOfYears=numbersOfYears;
    }
    public double getLoanAmount(){
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount){
        this.loanAmount=loanAmount;
    }
    public double getMonthlyPayment(){
        double monthlyInterestRate=annualInterestRate/1200;
        double monthlyPayment=loanAmount*monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate, numberOfYears*12)));
        return monthlyPayment;
    }
    public double getTotalPayment(){
        double totalPayment=getMonthlyPayment()*numberOfYears*12;
        return totalPayment;
    }
    public java.util.Date getLoanDate(){
        return loanDate;
    }
    
}
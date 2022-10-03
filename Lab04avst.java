// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");


        double Principal  = 250000;
        double AnnualRate = 4.85;
        double Years   = 30;
        double Months = Years * 12;
        double monthlyrate = (AnnualRate / 100) / 12;
        double Numerator = monthlyrate * Math.pow(1 + monthlyrate, Months);
        double Denominator = Math.pow(1 + monthlyrate, Months) - 1;
        double C = Numerator / Denominator;
        double MonthlyPayment = C * Principal;











        System.out.println("Principal"+"    " + "$"+Principal);
        System.out.println("Annual Rate"+"    " + AnnualRate + "%");
        System.out.println("Number of years"+"    " + Years);

        System.out.println("Monthly payment"+"    " +"$"+ MonthlyPayment);



        System.out.println();

    }
}


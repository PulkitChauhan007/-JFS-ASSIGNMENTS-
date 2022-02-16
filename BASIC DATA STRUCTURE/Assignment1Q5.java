import java.util.Scanner;
class TaxAmount{
    public static double calculateTaxAmount(int CTC){
        double tax = 0;
        if(CTC<=0 && CTC<=180000){
            tax = 0;
        }
        else if(CTC>=181001 && CTC<=300000){
            tax = (CTC/100)*10;
        }
        else if(CTC>=300001 && CTC<=500000){
            tax = (CTC/100)*20;
        }
        else if(CTC>=500001&& CTC<=1000000){
            tax = (CTC/100)*30;
        }
        return tax;
    }
}
public class Assignment1Q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter Your CTC =");
        int ctc = sc.nextInt();
        System.out.print("income tax = "+TaxAmount.calculateTaxAmount(ctc));
    }
}
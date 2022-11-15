import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		//Your challenge is to read in a price
		System.out.println("Enter a price");
		double price=in.nextDouble();
		//read in the amount paid
		System.out.println("Your total comes up to $"+price+".");
		System.out.println("Enter a payment.");
		double paid = in.nextDouble();
		//Print out the amount of change
		System.out.println("Your payment amounts to " +paid +"$");
		//Print out the amount of change
		double change = paid-price;
		//Break the change into all denominations: 
		change = Math.round(change*100)/100.0;
		int lastDigit=(int)((change*100)%10);
		if (lastDigit==1||change==2){
			change=change-(lastDigit/100.0);
		}else if(lastDigit==3||lastDigit==4){
			change=change+((5-lastDigit)/100.0);
		}
		else if (lastDigit==6||change==7){
			change=change-(lastDigit/100.0);
		}else if(lastDigit==8||lastDigit==9){
			change=change+((10-lastDigit)/100.0);
		}
		
		System.out.println("Your change is "+change);
		//$100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
		//As a bonus, make your project round to the nearest $0.05 like actual stores.
		int num100 = (int)(change/100);
		System.out.println(num100+" x $100");
		change =change-num100*100;
		int num50= (int)(change/50); {
	    System.out.println(num50+"x 50");
		change = change-num50*50;
	    int num20 = (int)(change/20);
		System.out.println(num20+"x 20");
		change = change - num20/20;	
		int num10 = (int)(change/10);
		System.out.println(num10+"x 10");
		change = change - num10/10;			
		int num5 = (int)(change/5);
		System.out.println(num5+"x 5");
		change = change - num5/5;			
		int num2 = (int)(change/2);
		System.out.println(num2+"x 2");
		change = change - num2/2;			
		int num1 = (int)(change/1);
		System.out.println(num1+"x 1");
		change = change - num1/1;			
		int num025 = (int)(change/0.25);
		System.out.println(num025+"x 0.25");
		change = change - num025/0.25;			
		int num010 = (int)(change/0.10);
		System.out.println(num010+"x 0.10");
		change = change - num010/0.10;			
		int num05 = (int)(change/0.05);
		System.out.println(num05+"x 0.05");
		
        }
     }
 }
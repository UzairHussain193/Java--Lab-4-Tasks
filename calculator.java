import java.util.Scanner;
class calculator{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter num1 : ");
	float num1=scan.nextFloat();
	System.out.print("Enter num2 : ");
	float num2=scan.nextFloat();
	System.out.print("Enter operator : ");
	char op=scan.next().charAt(0);

	switch(op){
	case '+':
	System.out.println("num1 + num2 = "+(num1+num2));
	break;
	case '-':
	System.out.println("num1 - num2 = "+(num1-num2));
	break;
	case '*':
	System.out.println("num1 * num2 = "+(num1*num2));
	break;
	case '/':
	System.out.println("num1 / num2 = "+(num1/num2));
	break;
	case '%':
	System.out.println("num1 % num2 = "+(num1%num2));
	break;
	default:
	System.out.println("Invalid operator.");
	break;
	}
}
}
import java.util.Scanner;
class prime{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter any number : ");
	int x1=scan.nextInt();
	int count=0;
	for(int i=1;i<=x1;i++){
		if(x1%i==0){	
			count++;
		}
	}
	if(count==2){
		System.out.println("Number is Prime..");
	}
	else{
	System.out.println("Number is not a prime..");
	}
}
}
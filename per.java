import java.util.Scanner;
class per{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter sub1 marks : ");
	int x1=scan.nextInt();
	System.out.print("Enter sub1 marks : ");
	int x2=scan.nextInt();
	System.out.print("Enter sub1 marks : ");
	int x3=scan.nextInt();
	System.out.print("Enter sub1 marks : ");
	int x4=scan.nextInt();
	System.out.print("Enter sub1 marks : ");
	int x5=scan.nextInt();
	int sum=x1+x2+x3+x4+x5;

	float per=(float) sum/5 ;
	
	if(per>90){
	System.out.println("Percentage :"+per+"\nGrade : A ");
	}
	else if(per>=75 && per <=90){
	System.out.println("Percentage :"+per+"\nGrade : B+ ");
	}
	else if(per>=60 && per<=74){
	System.out.println("Percentage :"+per+"\nGrade : B ");
	}
	else if(per>=40 && per<=59){
	System.out.println("Percentage :"+per+"\nGrade : C");
	}
	else{
	System.out.println("Percentage :"+per+"\nGrade : Fail ");
	}
}
}
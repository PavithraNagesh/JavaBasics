package week1.day2;

public class Calculator {
      
	public void add() {
		int k=2;
		int l=3;
		int m=5;
		int sum=k+l+m;
		System.out.printf("Add three numbers:"+sum);
	}
	public void sub() {
		int a=6;
		int b=3;
		int sub=a-b;
		System.out.println("Sub of two numbers:"+sub);
	}
	public void mul() {
		double i=325.678d;
		double j=4765.987d;
		double mul=i*j;
		System.out.println("Mul of two numbers:"+mul);	
	}
	public void div() {
		float c=3.5f;
		float d=2.5f;
		float div=c/d;
		System.out.println("Div of two numbers:"+div);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator n=new Calculator();
    n.add();
    n.sub();
    n.mul();
    n.div();
}
}
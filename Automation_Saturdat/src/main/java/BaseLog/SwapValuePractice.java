package BaseLog;


public class SwapValuePractice {
	public void getSwap() {
int a=25;
int b=15;

System.out.println("before swap a value="+a);
System.out.println("before swap b value="+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println();
System.out.println("after swap a value="+a);
System.out.println("after swap b value="+a);

	}
	public static void main(String[] args) {
		SwapValuePractice obj=new SwapValuePractice();
		obj.getSwap();
	}
}


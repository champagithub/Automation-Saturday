package BaseLog;

public class PracticeSwabValue {
	public void getswap() {
		int a=40;
		int b=20;
System.out.println("before swap a value:"+a);	
System.out.println("before swapb value:"+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println();
System.out.println("after swap a value:"+a);
System.out.println("after swap b value:"+b);
	}
public static void main(String[] args) {
	PracticeSwabValue obj=new PracticeSwabValue();
	obj.getswap();
}
}

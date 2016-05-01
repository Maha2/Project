package classAssignment13CONSTRUCTOR;

public class Calculator_Task3 {
public static void main(String[] args) {
		
	Calculator_Task3  cal  = new Calculator_Task3();
	System.out.println(cal.Calcu(2,3)+cal.Calcu(4,5,6));
	//int firstArray[] = {3,6,7,8,9,10};
	System.out.println(cal.Calcu(7,5,6,7,8,9,100));
	System.out.println(cal.Calcu(4,5));
	System.out.println(cal.Calcu(4,5,6));
	System.out.println("*************************");
	System.out.println(cal.Calcu(4,5,1,2));
		
	}
	
	public int Calcu(int i,int j)
	{
		System.out.println("Hello! This is 2 args");
		return i+j;
	}
	
	public int Calcu(int i,int j,int k)
	{
		System.out.println("Hello! This is 3 args");
		return i+j+k;
	}

	 public int Calcu(int...array)
	 {
		 int temp=0;
		 for(int val:array){
		   temp+=val;
		 }
		 return temp;
	 }
	

}

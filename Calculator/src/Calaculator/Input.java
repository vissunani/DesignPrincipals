package Calaculator;

import java.util.*;

public class Input {
	
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
	Calculation cal=new Calculation();
	Scanner sc=new Scanner(System.in);
	int firstnum=sc.nextInt();
	int secondnum=sc.nextInt();
	int addition=cal.addition(firstnum,secondnum);

	int mul=cal.mul(firstnum,secondnum);

	int div=cal.div(firstnum,secondnum);

	int sub=cal.sub(firstnum,secondnum);
	
	System.out.print(addition+"\n"+mul+"\n"+div+"\n"+sub);
	}
	
	
	
	

}

package typecasting;

public class Anytostring {

	public static void main(String args[]) {
		int ii=10;
		long ll=2345;
		float ff=10.43F;//floating literal is float had explictly define
		double dd=234.5234;//floating literal is double by default  (implict done)
		String s = "200";
		int i = Integer.parseInt(s);
		long l=Long.parseLong(s);
		float f=Float.parseFloat(s);
		double d=Double.parseDouble(s);
		
		
		System.out.println("===============================");
		System.out.println("type casting from String to anytpe");
		
		
		System.out.println("string concatenation operator: "+s+100);//200100 because + is string concatenation operator  
		System.out.println("+ is binary plus operator: "+( i+100));//300 because + is binary plus operator  
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		System.out.println("===============================");
		System.out.println("type casting from anytype to String");
		
		String si=String.valueOf(i);  
		String sl=String.valueOf(ll);
		String sf=String.valueOf(ff);
		String sd=String.valueOf(dd);
		
		
		System.out.println(si);
		System.out.println(sl);
		System.out.println(sf);
		System.out.println(sd);
		
		

	}
}

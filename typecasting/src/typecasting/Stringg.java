package typecasting;

public class Stringg {
	
	
	public static void main(String[] args) {
		String s="kali";
		String s1=new String("kali");
		System.out.println(s.concat(s1));
		System.out.println(s1);
		if(s.equals(s1))
			System.out.println("equals");
		else
			System.out.println("not equals");
	}

}

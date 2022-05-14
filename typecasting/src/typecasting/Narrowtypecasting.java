package typecasting;

public class Narrowtypecasting {
	
	public static void main(String[] args)
    {
      double d = 100.04;
      float f=(float)d;
      long l = (long)d;  //explicit type casting required 
      int i = (int)d;	//explicit type casting required
      short s=(short)d;
      byte b=(byte)d;
      
      System.out.println("Double value "+d);
      System.out.println("Float value "+f);
      System.out.println("Long value "+l);
      System.out.println("Int value "+i);
      System.out.println("Short value "+s);
      System.out.println("Byte value "+b);
     
    }

}

package day12;

public class WrapperTest {
	public static void main(String[] args) {
		int num=10;
		Integer numObj=new Integer(num); //¹Ú½Ì
		int num2=numObj.intValue(); //¾ğ¹Ú½Ì

		double d=12.45;
		Double doubleObj=d; //¿ÀÅä¹Ú½Ì
		double d2=doubleObj; //¿ÀÅä¾ğ¹Ú½Ì
	}

}

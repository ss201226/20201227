package day12;

public class WrapperTest {
	public static void main(String[] args) {
		int num=10;
		Integer numObj=new Integer(num); //�ڽ�
		int num2=numObj.intValue(); //��ڽ�

		double d=12.45;
		Double doubleObj=d; //����ڽ�
		double d2=doubleObj; //�����ڽ�
	}

}

package generic;

public class GMethodTest {
	public static <T> T function(T data) {
		T result=data;
		if(data instanceof Integer) {
			System.out.println("������ ���");
			
		}else if(data instanceof Double || data instanceof Float) {
			System.out.println("�Ǽ��� ���");
		}else if(data instanceof Character) {
			System.out.println("���ڷ� ���");
		}else if(data instanceof String) {
			System.out.println("���ڿ��� ���");
		}else {
			System.out.println("????");
			return null;
		}
		return result;
	}
}

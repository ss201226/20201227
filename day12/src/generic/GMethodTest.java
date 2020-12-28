package generic;

public class GMethodTest {
	public static <T> T function(T data) {
		T result=data;
		if(data instanceof Integer) {
			System.out.println("정수로 사용");
			
		}else if(data instanceof Double || data instanceof Float) {
			System.out.println("실수로 사용");
		}else if(data instanceof Character) {
			System.out.println("문자로 사용");
		}else if(data instanceof String) {
			System.out.println("문자열로 사용");
		}else {
			System.out.println("????");
			return null;
		}
		return result;
	}
}

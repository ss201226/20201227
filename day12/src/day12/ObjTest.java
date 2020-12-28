package day12;

public class ObjTest {

	public static void main(String[] args) {
		
		//String은 비교시 .equals()로 비교
		//입력을 받아오는 경우 필드를 새로 생성하기 때문에 주소값이 달라져 ==로 비교할 수 없기 때문이다.
		//String은클래스이기 때문에 msg1,2,3,4 모두 객체임 
		String msg1="hello";
		String msg2="hello";
		String msg3=new String("hello");
		String msg4=new String("hello");
		//이 두 비교의 차이?
		//msg1과 msg2는 같은필드를 가리키고 있기때문에(같은 주소값을 담고 있기 때문에) true
		System.out.println(msg1==msg2);
		//msg3과 msg4는 new String() 생성자를 사용하여 만들었기 때문에 두 필드의 주소값은 다르다
		System.out.println(msg3==msg4);
		//.equals()는 원래 주소값 비교--2교시
		//String 클래스에서 값비교를 하도록 오버라이딩 한 것
		//나머지는 .equals()는 주소값비교
		System.out.println(msg3.equals(msg4));
		Object obj=new Object();
		Object obj2=new Object();
		System.out.println(obj.equals(obj2));
		//고유한 정수값을 리턴하는 메소드
		obj.hashCode();
		
		//user1과 user2는 다른 객체이다 그러나 내용이 같아 같은 객체로 봐야함
		//동위객체
		User user1=new User();
		user1.userNum=1;
		user1.userid="apple";
		user1.username="김사과";
		
		User user2=new User();
		user2.userNum=1;
		user2.userid="apple";
		user2.username="김사과";
		
		System.out.println("equals: "+user1.equals(user2)); //동위객체이기 때문에이 경우 true가 나와야 한다
		System.out.println( user1.hashCode()==user2.hashCode());
		user1.equals(20); //new Integer(20); ->obj에 업캐스팅으로 넣어주고 있는 것
		
		//오토박스를 사용하는 이유: 매개변수로 data를 사용하는 메소드가 아닌
		//public boolean equals(Object obj) 로 넘기기 위해
		user1.equals(new Integer(20)); 
		
	}

}

class User{
	int userNum;
	String userid;
	String username;
	
	boolean equals(int data) { //오토박싱 거치지 않아도 되기 때문에 user1.equals(20);이 바로 여기로 들어온다
		return true;
	}
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User target=(User) obj;
			if(this.userNum==target.userNum) {
				if(this.userid.equals(target.userid)) {
					return true;
				}
			}
		}
		return false;
	}

	public int hashCode() {
		return userNum;
	}
	
}

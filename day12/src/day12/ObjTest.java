package day12;

public class ObjTest {

	public static void main(String[] args) {
		
		//String�� �񱳽� .equals()�� ��
		//�Է��� �޾ƿ��� ��� �ʵ带 ���� �����ϱ� ������ �ּҰ��� �޶��� ==�� ���� �� ���� �����̴�.
		//String��Ŭ�����̱� ������ msg1,2,3,4 ��� ��ü�� 
		String msg1="hello";
		String msg2="hello";
		String msg3=new String("hello");
		String msg4=new String("hello");
		//�� �� ���� ����?
		//msg1�� msg2�� �����ʵ带 ����Ű�� �ֱ⶧����(���� �ּҰ��� ��� �ֱ� ������) true
		System.out.println(msg1==msg2);
		//msg3�� msg4�� new String() �����ڸ� ����Ͽ� ������� ������ �� �ʵ��� �ּҰ��� �ٸ���
		System.out.println(msg3==msg4);
		//.equals()�� ���� �ּҰ� ��--2����
		//String Ŭ�������� ���񱳸� �ϵ��� �������̵� �� ��
		//�������� .equals()�� �ּҰ���
		System.out.println(msg3.equals(msg4));
		Object obj=new Object();
		Object obj2=new Object();
		System.out.println(obj.equals(obj2));
		//������ �������� �����ϴ� �޼ҵ�
		obj.hashCode();
		
		//user1�� user2�� �ٸ� ��ü�̴� �׷��� ������ ���� ���� ��ü�� ������
		//������ü
		User user1=new User();
		user1.userNum=1;
		user1.userid="apple";
		user1.username="����";
		
		User user2=new User();
		user2.userNum=1;
		user2.userid="apple";
		user2.username="����";
		
		System.out.println("equals: "+user1.equals(user2)); //������ü�̱� �������� ��� true�� ���;� �Ѵ�
		System.out.println( user1.hashCode()==user2.hashCode());
		user1.equals(20); //new Integer(20); ->obj�� ��ĳ�������� �־��ְ� �ִ� ��
		
		//����ڽ��� ����ϴ� ����: �Ű������� data�� ����ϴ� �޼ҵ尡 �ƴ�
		//public boolean equals(Object obj) �� �ѱ�� ����
		user1.equals(new Integer(20)); 
		
	}

}

class User{
	int userNum;
	String userid;
	String username;
	
	boolean equals(int data) { //����ڽ� ��ġ�� �ʾƵ� �Ǳ� ������ user1.equals(20);�� �ٷ� ����� ���´�
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

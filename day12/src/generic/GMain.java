package generic;

public class GMain {
	public static void main(String[] args) {
		GClassTest<String> obj=new  GClassTest<>("����");
		GClassTest<Integer> obj2=new GClassTest<>(10);
		
		obj.info();
		obj2.info();
		
		GMethodTest.<Integer>function(10);
		GMethodTest.<String>function("Hello");
		//<> ��������
		GMethodTest.function('A');
		GMethodTest.function(12.4232);
		
		
		//�͸�Ŭ������ ������ ���� 
		GInterTest<Integer, Double> obj3=new GInterTest<Integer, Double>() {
			
			@Override
			public Double sub(Integer data1, Integer data2) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Double mul(Integer data1, Double data2) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Double div(Integer data1, Integer data2) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Integer add(Integer data1, Integer data2) {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}



//�������̽� ������ ����
class GTest implements GInterTest<Integer, Double>{

	@Override
	public Integer add(Integer data1, Integer data2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double mul(Integer data1, Double data2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double sub(Integer data1, Integer data2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double div(Integer data1, Integer data2) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
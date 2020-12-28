package generic;

public class GClassTest<Type> {
	Type data;
	public GClassTest() {;}
	public GClassTest(Type data) {
		this.data=data;
	}
	void info() {
		System.out.println(data);
	}
}

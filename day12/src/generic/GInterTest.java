package generic;

public interface GInterTest<N1,N2> {
	N1 add(N1 data1, N1 data2);
	N2 mul(N1 data1, N2 data2);
	N2 sub(N1 data1, N1 data2);
	N2 div(N1 data1, N1 data2);
}

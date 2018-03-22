package three;

public class Test1 {

	public static void main(String[] args) {
Sample1 s=new Sample1();
try {
	s.m(18);
} catch (Custom e) {
	e.printStackTrace();
}
	}
}
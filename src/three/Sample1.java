package three;

public class Sample1 {
	public void m(int age)throws Custom{
		if(age<=18) {
			throw new CustomUnchecked("You are not eligible!");
		}
		else {
			System.out.println("You are eligible");
		}
	}

}

package three;

public class Sample {
	public void m(int age)throws CustomUnchecked{
		if(age<=18) {
			throw new CustomUnchecked("You are not eligible!");
		}
		else {
			System.out.println("You are eligible");
		}
	}

}

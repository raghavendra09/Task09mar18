package five;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new ComparatorInter());
ts.add(new Customer(1034,25, "Rajesh", "Kathi"));
ts.add(new Customer(1032,26, "Abhilash", "Suhan"));
ts.add(new Customer(1033,26, "Mujeeb", "Md"));
ts.add(new Customer(1039,36, "Sirish", "Vadhwa"));
ts.add(new Customer(1025,25, "Abhilash", "Suhan"));
ts.add(new Customer(1028,20, "Sonal", "Gadwe"));
ts.add(new Customer(1029,26, "Mujeeb", "Mohammed"));

for(Object x:ts) {
	System.out.println(x);
}	
}
}

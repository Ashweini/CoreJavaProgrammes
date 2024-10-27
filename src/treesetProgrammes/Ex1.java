package treesetProgrammes;

import java.util.TreeSet;

public class Ex1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(55);
		ts.add(34);
		ts.add(20);
		ts.add(25);
		//ts.add("Hello");
		
		System.out.println(ts);
		
		//duplicate not allowed
		//insertion order not allowed
		//we are getting element in sorted order
		//we cannot add heterogenous type of data
		//null value allowed but only once
	}

}

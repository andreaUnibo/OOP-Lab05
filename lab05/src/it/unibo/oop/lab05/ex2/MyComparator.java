package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if(Integer.parseInt(o1) > Integer.parseInt(o2)) {
			return 1;
		}else if(Integer.parseInt(o1) < Integer.parseInt(o2)){
			return -1;
		}else {
			return 0;
		}
	}
}

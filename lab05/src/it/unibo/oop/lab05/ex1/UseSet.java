package it.unibo.oop.lab05.ex1;

import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

	private static final int ELEMENTS = 20;
	
    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
    	boolean even = true;
    	
    	//1
    	Set<String> set = new TreeSet<String>();
    	//2
    	for(int i = 0;i < ELEMENTS; i++) {
    		set.add(""+i);
    	}
    	//3
    	System.out.println(set);
    	//4
    	Set<String> setcopy = new TreeSet<String>();
        for (String string : set) {
        	if( Integer.parseInt(string) % 3 != 0 ) {
        		setcopy.add(string);
        	}
		}
    	set = setcopy;
    	//5
    	 for (String string : set) {
    		 System.out.println(string);
    	 }
    	 
    	 //6
    	 for (String string : set) {
    		 if( Integer.parseInt(string) % 2 != 0 ) {
         		even = false;
         		break;
         	}
    	 }
    	 
    	 System.out.println(even);
    	
    }
}

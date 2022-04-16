package it.unibo.oop.lab05.ex2;

import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder {

    private UseSetWithOrder() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
    	//1
    	final TreeSet<String> ordered = new TreeSet<String>( new MyComparator());
    	//2
    	for(int i = 1; i < 101; i++) {
    		ordered.add(""+(int)(+Math.random()*100));
    	}
    	//3
    	System.out.println(ordered);
    	
        /*
         * 
         * 
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define
         * a new Comparator in a separate class.
         * 
         * 2) Inserts in the set a hundred strings containing randomly generated
         * numbers (use Math.random())
         * 
         * 3) Prints the set, which must be ordered
         */
    }

	
		

	}
	



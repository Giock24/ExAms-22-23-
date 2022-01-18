package ex2016.a01.t2.e2;

import java.util.List;

/*
 * A simple Controller that manages all logistics factors.
 */
public interface Controller {
	
	/**
	 * Take the name of file for know where write
	 */
	void nameFile(String name);

	/**
	 * Create a 1 
	 */
	void plusONE();
	
	/**
	 * Create a Random number (-1, -100)
	 */
	void rng();
	
	/**
	 * Create a multiply of 2 remembering how many times was called
	 */
	void mulByTwo();
	
	/**
	 * write on File all numbers memorized
	 */
	void writeAll();
	
	/**
	 * @return the current list built with different interactions
	 */
	List<Integer> getCurrentSequece();
	
	/**
	 * The Client want to add that number and will be add on a list
	 */
	void addElement(Supplier<Integer> elem);
	
	/**
	 * Return an Integer that you pass.
	 */
	interface Supplier<X> {
		int supply();
	}
	
}

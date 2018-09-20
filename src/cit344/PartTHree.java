/* This is a program to recreate the workings of the MyRunnable.class file
 * Creators: Dave v, Bailey M, and Cody F
 * Date: 20 Sept 2018
 */


public class PartTHree {
	public static void main(String[] args) {

		runnableTester();
}

/**
 * a method to create and test the GroupRunnable class with 5 examples
 */
public static void runnableTester() {
	
	//create 5 of type GroupRunnable
	GroupRunnable one = new GroupRunnable("Thread 1");
	GroupRunnable two = new GroupRunnable("Thread 2");
	GroupRunnable three = new GroupRunnable("Thread 3");
	GroupRunnable four = new GroupRunnable("Thread 4");
	GroupRunnable five = new GroupRunnable("Thread 5");
	
	
	//runs 5 of GroupRunnable
	one.run();
	two.run();
	three.run();
	four.run();
	five.run();
	
}

}

class GroupRunnable implements Runnable{

private String text = ""; //a container for a text string

public GroupRunnable(String text) {
	// constructor sets the "text" container for the class to equal the input string
	this.text=text; 
	
}

@Override
public void run() {
	
	String abc = ""; // a temporary String
	for (int i = 'a'; i<='z'; i++) abc += (char)i; // a loop the writes 26 chars (a to z) to a string
	for (int z=1; z<10; z++)	System.out.println("Thread: " + text + " " + abc); //outputs a set string, the text sent to the constructor, and the alphabet
	
}

}

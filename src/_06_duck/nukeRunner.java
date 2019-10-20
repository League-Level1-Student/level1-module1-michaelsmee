package _06_duck;

public class nukeRunner {

	public static void main(String[] args) {
		
		duck aksel = new duck("donutes",5);
		
		Trump aksel1 = new Trump(100000, 1000000);
		
		aksel.quack();
		aksel.waddle();
		aksel1.yell();
		aksel1.nuke();
	
	
	System.out.println(aksel1.numberOfTweets );
	System.out.println(aksel1.numberOfNukes);
	
	}
	
	
	
}

package java_fundamentals;

public class LanguageBasicquestion2 {
	    public static void main(String[] args) {
	        if (args.length < 1) {
	            System.out.println("Please provide two command line argument.");
	            return;
	        }

	        String name = args[0];

	        System.out.println("Welcome" + name);
	    }
	}
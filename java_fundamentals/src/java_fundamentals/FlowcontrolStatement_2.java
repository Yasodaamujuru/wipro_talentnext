package java_fundamentals;

public class FlowcontrolStatement_2 {
	public class CharacterTypeCheck {
	    public static void main(String[] args) {
	        char ch = '#'; 

	        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
	            System.out.println("Alphabet");
	        } else if (ch >= '0' && ch <= '9') {
	            System.out.println("Digit");
	        } else {
	            System.out.println("Special Character");
	        }
	    }
	}

}

package M;
public class NonRepeatingChar {

	public static void main(String[] args) {
	String str = "asda";
	boolean found = false;
	for (int i=0; i < str.length(); i++) {
        char current = str.charAt(i);
        boolean isRepeated = false;
	
	for (int j = 0; j < str.length(); j++) {
        if (i != j && current == str.charAt(j)) {
            isRepeated = true;
            break;
        }
    }
	if (!isRepeated) {
        System.out.println("First non-repeating character: " + current);
        found = true;
        break;
    }
}
	if(!found) {
		System.out.println("No Repeating Character Found!!!");
	}

	
	
	}

}

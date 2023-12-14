package TestCodes;

import java.util.ArrayList;
import java.util.List;

public class Code1 {

	public static void main(String[] args) {
		
		String[] inputArray = {"A5@", "B*92", "#30C", "8D&", "0$E"};
	    List<String> alpL = new ArrayList<>();
	    List<String> symL = new ArrayList<>();
	    List<Integer> numL = new ArrayList<>();

	    for (int i=0; i<inputArray.length; i++) {
	        StringBuffer alpha = new StringBuffer(), symbol = new StringBuffer(), num = new StringBuffer();
	        for (int j=0; j<inputArray[i].length(); j++) {
	            if (Character.isAlphabetic(inputArray[i].charAt(j))) {
	                alpha.append(inputArray[i].charAt(j));
	            } else if (Character.isDigit(inputArray[i].charAt(j))) {
	                num.append(inputArray[i].charAt(j));
	            } else {
	                symbol.append(inputArray[i].charAt(j));
	            }
	        }
	        alpL.add(alpha.toString());
	        numL.add(Integer.parseInt(num.toString()));
	        symL.add(symbol.toString());
	    }
	    System.out.println("Sorted Alphabets: ");
	    alpL.stream().sorted(String::compareTo).forEach(System.out::println);
	    System.out.println("Sorted Number: ");
	    numL.stream().sorted(Integer::compareTo).forEach(System.out::println);
	    System.out.println("Symbols: "+ symL);
 
	}

}

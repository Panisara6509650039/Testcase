package Question4;

public class FourWord {
	 private String word1; 
	 private String word2; 
	 private String word3; 
	 private String word4; 
	 private int count=0;  
	   
	 public void add(String word) {
	        count++;
	        if (count == 1)
	            word1 = word;
	        else if (count == 2)
	            word2 = word;
	        else if (count == 3)
	            word3 = word;
	        else if (count == 4)
	            word4 = word;
	        else {
	            System.out.println("Can't add more word!");
	            count--;
	        }

	    }

	    public String getMin() {
	        String min = word1;
	        if (word1 == null && word2 == null && word3 == null && word4 == null) {
	            return null;
	        } else {
	            if (word2 != null && word2.compareTo(min) < 0)
	                min = word2;
	            if (word3 != null && word3.compareTo(min) < 0)
	                min = word3;
	            if (word4 != null && word4.compareTo(min) < 0)
	                min = word4;
	        }
	        return min;
	    }

	    public String getMax() {
	        String max = word1;
	        if (word1 == null && word2 == null && word3 == null && word4 == null) {
	            return null;
	        } else {
	            if (word2 != null && word2.compareTo(max) > 0)
	                max = word2;
	            if (word3 != null && word3.compareTo(max) > 0)
	                max = word3;
	            if (word4 != null && word4.compareTo(max) > 0)
	                max = word4;
	        }
	        return max;
}


public void printWords() {
    int Length = 0, round = 0;
    System.out.printf("List of words:\n");
    if (word1 != null) {
        System.out.printf("\t %s\n", word1);
    }
    if (word2 != null) {
        System.out.printf("\t %s\n", word2);
    }
    if (word3 != null) {
        System.out.printf("\t %s\n", word3);
    }
    if (word4 != null) {
        System.out.printf("\t %s\n", word4);
    }

    if (word1 != null) {
        Length = Length + word1.length();
        round++;
    }
    if (word2 != null) {
        Length = Length + word2.length();
        round++;
    }
    if (word3 != null) {
        Length = Length + word3.length();
        round++;
    }
    if (word4 != null) {
        Length = Length + word4.length();
        round++;
    }

    System.out.println("The lexicographic minimum is " + getMin());
    System.out.println("The lexicographic maximum is " + getMax());
    System.out.println("Total length is " + Length);
    if (round == 0) {
        round = 1;
    }
    System.out.printf("Average length %.6f\n", (double) Length / round);
}
}
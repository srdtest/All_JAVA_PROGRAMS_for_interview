package mostaskedcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "This is a sample sentence";
        String reversedSentence = reverseWithCharArray(sentence);
        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    public static String reverseWordsInSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }
        return Arrays.stream(sentence.split(" "))
                     .map(ReverseWords::reverseWithStack)
                     .collect(Collectors.joining(" "));
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static String reverseStringwithchararray(String str) {
    	String rev="";
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			rev=ch[i]+rev;
			}
		
    	System.out.println("the reverse word is "+rev);
    	return rev;
    	  	   	
    }
    
    public static String reverseWithLoop(String str) {
       String rev="";
        for (int i = str.length() - 1; i >= 0; i--) {
           rev=str.charAt(i)+rev;
        }
        return rev;
    }
    public static String reverseWithCharArray(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
    public static String reverseWithRecursion(String str) {
        if (str.isEmpty()) return str;
        return reverseWithRecursion(str.substring(1)) + str.charAt(0);
    }

    public static String reverseWithStreams(String str) {
        return str.chars()
                  .mapToObj(c -> (char) c)
                  .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                  .reverse()
                  .toString();
    }
    public static String reverseWithCollections(String str) {
        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) list.add(c);
        Collections.reverse(list);
        return list.stream()
                   .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                   .toString();
    }
    public static String reverseWithStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) 
        	stack.push(c);
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) 
        	reversed.append(stack.pop());
        return reversed.toString();
    }



}
	
	

	

package IsAlphabeticPalindrome;
import java.util.ArrayList;

public class Solution {

    public static String reverseWord(String word){
        String reversedWord = "";
        for(int i=word.length()-1; i>=0; i --){
            reversedWord += word.charAt(i);
            System.out.println("reversed char"+ word.charAt(i) + " at index " +i);
        }
        System.out.println("Reversed word: "+reversedWord);
        return reversedWord;
    }
    
    public static boolean isAlphabeticPalindrome(String code) {
        String new_word = "";
        code = code.toLowerCase();
        ArrayList<Character> alphabet = new ArrayList<>();
        for(char letter = 'a';  letter <= 'z' ; letter ++){
            alphabet.add(letter);
        }

        for (int i=0;i<code.length(); i++){
            char currentLetter = code.charAt(i);
            if(alphabet.contains(currentLetter)){
                new_word += currentLetter;
            }
        }
        System.out.println("new word "+ new_word);
        return reverseWord(new_word).equals(new_word);
        

    }
}
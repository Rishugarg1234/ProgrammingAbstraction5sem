package Basics;
//Q21. Count vowels and consonants in a string.
import java.util.Scanner;

public class countVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        int countVowel = 0;
        int countConsonant = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                countVowel++;
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                countConsonant++;
            }
        }
        System.out.println("Vowel Count: "+countVowel);
        System.out.println("Consonant Count: "+countConsonant);
    }
}


import java.util.*;  
public class Question_2   
{  
    public static void main(String[] args) {  
        String sentence = "Total number of words in the given string";  
        int wrdCount = 0;  
          
        for(int i = 0; i < sentence.length()-1; i++) {   
            if(sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i+1)) && (i > 0)) {  
                wrdCount++;  
            }  
        }  
        wrdCount++;  
          
        System.out.println("Total number of words in the given string: " + wrdCount);  
    }  
}  

/****************output*******************

Total number of words in the given string: 8

******************************************/
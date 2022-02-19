
import java.util.*;
 
public class Question_4{  
     public static void main(String[] args) {  
        String string1 = "Shraddha s Gaware";  
        int cnt;  
        char string[] = string1.toCharArray();  
          
        System.out.println("Duplicate characters in a  string  "+string1 +"  : ");  
        for(int i = 0; i <string.length; i++) {  
            cnt = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    cnt++;   
                    string[j] = '0';  
                }  
            }  
            if(cnt > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        }  
    }  
}  

/*********output***************

Duplicate characters in a  string  Shraddha s Gaware  :
h
r
a
d

*********************************/
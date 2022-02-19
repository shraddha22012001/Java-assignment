
import java.util.*;  
class Question_1
{   
public static void main(String args[])  
{  
HashMap<Integer, String> hm = new HashMap<Integer, String>(); 
hm.put( 121,"Shraddha" );  
hm.put( 122,"Adesh");   
hm.put(123,"Shreya");   
hm.put(124,"Hrushikesh");  
Iterator <Integer> it = hm.keySet().iterator(); 
System.out.println("Hashmap using while loop:\n");     
while(it.hasNext())  
{  
int key=(int)it.next();  
System.out.println("Roll no.: "+key+"     name: "+hm.get(key));  
}  
System.out.println("Hashmap using for loop:\n\n");
for (Map.Entry<Integer, String> entry : hm.entrySet()) 
{  
System.out.println("Roll.No : " + entry.getKey() + ", Name : " + entry.getValue());   
} 
}  
} 



/***************output*************


Hashmap using while loop:

Roll no.: 121     name: Shraddha
Roll no.: 122     name: Adesh
Roll no.: 123     name: Shreya
Roll no.: 124     name: Hrushikesh
Hashmap using for loop:


Roll.No : 121, Name : Shraddha
Roll.No : 122, Name : Adesh
Roll.No : 123, Name : Shreya
Roll.No : 124, Name : Hrushikesh

*************************************** */
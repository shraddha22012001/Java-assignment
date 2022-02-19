
import java.util.*;
 

class Question_3{
   
    public static void main(String[] args)
    {
  
        List<Integer> numbers = Arrays.asList(1, 2, 3,4, 5);

	// iterate Arraylist using for loop
        System.out.print("Using For Loop  \n"); 
        for (int i = 0; i < numbers.size(); i++)
            System.out.print(numbers.get(i) + "\n");  
      
        // iterate Arraylist using while loop
        System.out.print("\nUsing while Loop  \n"); 
	int val = 0;
        while (numbers.size() > val) {
            System.out.println(numbers.get(val));
            val++ ;
        }

        // iterate Arraylist using advanced for loop
        System.out.print("\nUsing advanced For Loop \n "); 
        for (Integer i : numbers)
            System.out.print(i + "\n");     


    }
}

/***********output*********************


Using For Loop
1
2
3
4
5

Using while Loop
1
2
3
4
5

Using advanced For Loop
 1
2
3
4
5

***********************************************/
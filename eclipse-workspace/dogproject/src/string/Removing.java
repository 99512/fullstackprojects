package string;

import java.util.Arrays;
import java.util.Scanner;

public class Removing {
	
	
    public static void main(String[] args)   
    {   
        String info ;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter String : ");
        
        info=sc.nextLine();
        
        char str[] = info.toCharArray();  
        int length = str.length;  
        removeDuplicate(str, length);   
                   
    }
	     static void removeDuplicate(char str[], int length)   
	    {   
	        
	        int index = 0;   
	        for (int i = 0; i < length; i++)   
	        {   
	            int j;   
	            for (j = 0; j < i; j++)    
	            {   
	                if (str[i] == str[j])   
	                {   
	                    break;   
	                }   
	            }   
	            if (j == i)    
	            {   
	                str[index++] = str[i];   
	            }   
	        }   
	        System.out.println(String.valueOf(Arrays.copyOf(str,index)));   
	    }   
}

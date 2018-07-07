package com.sunandan.permutation;

import java.util.HashSet;
import java.util.Set;

public class Permutation
{
	//static int count;
	static Set<String> permutationString = new HashSet<>();
	
    public static void main(String[] args)
    {
    	
    	String str = "ABC";
        String str1 = "BCA";
        int n = str.length();
        Permutation permutation = new Permutation();
        if(str.length() != str1.length()) {
        	System.out.println("2nd String is different");
        	return;
        }
        permutation.permute(str, 0, n-1);
        if(permutationString.contains(str1)) {
        	System.out.println("2nd String is a permutation");
        	
        }
        
    }
    private void permute(String str, int l, int r)
    {
        if (l == r) {
        	permutationString.add(str);
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                if(l!=i)
            	str = swap(str,l,i);
                permute(str, l+1, r);
                if(l!=i)
                str = swap(str,l,i);
            }
        }
    }

    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
 
}
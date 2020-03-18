import java.lang.*;
import java.util.*;
  
class validparenthesis  
{ 
    static void Parenthesis(char str[], int n, int pos, int open, int close) 
    { 
        if(close == n)  
        { 
            for(int i=0;i<str.length;i++) 
                System.out.print(str[i]); 
            System.out.println(); 
            return; 
        } 
        else
        { 
            if(open > close) { 
                str[pos] = ')'; 
                Parenthesis(str, n,pos+1, open, close+1); 
            } 
            if(open < n) { 
                str[pos] = '('; 
                Parenthesis(str, n,pos+1, open+1, close); 
            } 
        } 
    } 
   
    public static void main (String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt(); 
        if(n>0)
        {
        char[] str = new char[2 * n]; 
        Parenthesis(str, n,0,0,0); 
        }
    } 
} 

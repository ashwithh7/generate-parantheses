package generateparantheses;

import java.util.*;
import java.io.*;


public class GenerateValidParantheses {
    public static void generateParantheses(int n,ArrayList<String>al,String s,int open,int close){
        if(s.length()==2*n){
            al.add(s);
            return ;
        }
        if(open <n){
            generateParantheses(n, al,s+"{",open+1,close);
        }
        if(close <open){
            generateParantheses(n, al, s+"}",open,close+1);
        }
        
    
    }
    /*public static boolean isValid(String s){
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='{')c++;
            else c--;
            if(c<0)return false;
        }
        return c==0;
        
    }*/

    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String>al=new ArrayList<>();
        generateParantheses(n,al,"",0,0);
        for(String s:al){
            System.out.println(s);
        }
        
        
    
    }

}

    







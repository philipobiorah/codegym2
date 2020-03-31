/*  
1. Read a file name from the console.
2. Read a set of numbers from the file.
3. Display only the even numbers, sorted in ascending order.

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort_even_file {
    public static void main(String[] args) {
        //write your code here
        try{
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        String file = br.readLine();
        
        FileInputStream fis = new FileInputStream(file);
        
        BufferedReader fbr = new BufferedReader(new InputStreamReader(fis));
        
        String str;
        ArrayList<Integer> num = new ArrayList<Integer>();
        while((str = fbr.readLine()) != null){
            num.add(Integer.parseInt(str));
        }
        
        br.close();
        fbr.close();
        // new ArrayList for even noumbers only
        ArrayList<Integer> even = new ArrayList<Integer>();
        //Iterate throught the Integer ArrayList
        for(int e : num){
            if(e % 2 == 0){
                even.add(e);   //extract event numbers only
            }
        }
        //Sort the list of Even numbers
        Collections.sort(even);
        // Display only even numbers
        for(int e : even){
            System.out.println(e);
        }
        
        }catch(Exception e){
           e.printStackTrace();   
        }
        
    }

}
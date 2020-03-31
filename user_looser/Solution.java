import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




/*
  1. Enter a few strings (keys) from the keyboard [in a loop].
The following strings (keys) are allowed: 
"user", "loser", "coder", "programmer".
Stop reading in strings after reading in
 any string that does not match one of the above.

 2. For each entered string:
2.1. Create the appropriate object [see Person.java], 
e.g. create a User object for the string "user".
2.2. Pass this object to the doWork method.
3. Write an implementation of the doWork method, which:
3.1. Calls the live() method on the passed object if person is a User.
3.2. Calls the doNothing() method if person is a Loser.
3.3. Calls the writeCode() method if person is a Coder.
3.4. Calls the enjoy() method if person is a Programmer.
*/
public class Solution implements Person{
    public static void main(String [] args) throws IOException{
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
      String key = null;
      Person person = null; 
      Boolean canRead = true;

       /// Here's the loop for reading the keys. Item 1
      while(canRead){
          key = br.readLine();
        
         
          if((key.equals("user")) || (key.equals("loser")) || (key.equals("coder")) || (key.equals("programmer"))){
            
            
                if(key.equals("user")){
                   // Create an object. Item 2
                person = new User();
                doWork(person); // Call doWork
                }
                else if(key.equals("loser")){
                    person = new Loser();
                    doWork(person); // Call doWork
                }
                else if(key.equals("coder")){
                   person = new Coder();
                     doWork(person);
                }
                if(key.equals("programmer")){
                  person = new Programmer();
                   doWork(person);          
                }
            
          }
          else{
            canRead = false;
          }
      }
      br.close();

        

}

public static void doWork(Person person) {
    // Item 3
    if(person instanceof User){
          User user = (User)person;
          user.live();
    }else if(person instanceof Loser){
        Loser loser = (Loser)person;
            loser.doNothing();
    }else if(person instanceof Coder){
        Coder coder = (Coder)person;
        coder.writeCode();
    }else{
        Programmer programmer = (Programmer)person;
        programmer.enjoy();
    }
}
}



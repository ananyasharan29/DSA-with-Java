import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// if else statement is used to check the conditions in the form of "true" and "false"
//  Syntax for if statements
/*
    if(boolean expression T or F)      {
           // Body
      }else {
         // Do this
    }
 */
  /*      int salary = 25000;
        if (salary>10000){
            salary = salary +2000;
        } else{
            salary = salary +1000;
        }
        System.out.println(salary);

   */

//  Multiple if-else statement
        //multiple statements are given in one condition

        int salary = 9000;
        if (salary>10000){
            salary += 2000;
        } else if(salary>8000){
            salary += 3000;
        }else{
            salary += 1000;
        }
        System.out.println(salary);
    }
}

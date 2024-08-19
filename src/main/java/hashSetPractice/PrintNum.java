package hashSetPractice;

import java.util.HashSet;
import java.util.Set;

//Write a Java program that creates a HashSet of integers.
// Add the numbers 1 to 10 to the set and print the set.
// Then, try adding the number 5 again and see what happens.
// Finally, remove the number 3 from the set and print the set again.
public class PrintNum {
    public static void main(String[] args) {
        Set<Integer> numbers= new HashSet<>();
       for(int i=1; i<=10; i++){
           numbers.add(i);
       }
        System.out.println("original set : " +  numbers);

       boolean isAdded = numbers.add(5);
        System.out.println("attempt  adding  5 :" + isAdded);
        System.out.println("Set after attempting to add 5 again: " + numbers);

        boolean isRemoved = numbers.remove(3);
        System.out.println("attempt  removing 3 :" + isRemoved);
        System.out.println("Set after removing 3 : " + numbers);
    }

}

package hashSetPractice;

import java.util.HashSet;
import java.util.Set;

//Write a function that takes an array of strings and returns true
// if all elements are unique, and false if there are duplicates. Use a Set to solve this problem.
public class UniqueElementCheck {
public static boolean areElementsUnique(String[] array){
    Set<String> name = new HashSet<>();
    for(String element : array){
        if(!name.add(element)){
            return false;
        }
    }
    return true;
}

    public static void main(String[] args) {
    String [] array1={"apple","banana", "lemon", "pineapple"};
        String [] array2={"apple","banana", "lemon", "apple"};
        System.out.println("Array1 has all unique elements : "+areElementsUnique(array1));
        System.out.println("Array2 has all unique elements : "+areElementsUnique(array2));

    }
}

package hashSetPractice;

import java.util.HashSet;
import java.util.Set;

//Write a Java method that finds the intersection of two sets of strings. The method should take
// two sets as arguments and return a set containing only the elements that are common in both.
public class IntersecionSet {

    public static Set<String> intersectionOfSets(Set<String> set1, Set<String>set2){
        Set<String> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;


    }

    public static void main(String[] args) {
        Set<String> set1= new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");
        Set<String> set2 = new HashSet<>();
        set2.add("banana");
        set2.add("cherry");
        set2.add("date");

        Set<String> intersectionSet = intersectionOfSets(set1,set2);
        System.out.println("intersection of sets  :" + intersectionSet);

    }
}

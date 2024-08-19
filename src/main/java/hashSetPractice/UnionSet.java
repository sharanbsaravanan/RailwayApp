package hashSetPractice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Write a program that takes two sets of integers as input and returns their union.
// Use a HashSet for both sets.
public class UnionSet {

    public static Set<Integer> union(Set<Integer> set1,Set<Integer> set2){
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set1 = new HashSet<>();
        System.out.print("Enter elements of first set(enter non integer to stop):  ");

        while (sc.hasNextInt()){
            set1.add(sc.nextInt());
        }
        sc.next();

        Set<Integer> set2 = new HashSet<>();
        System.out.print("Enter elements of second set(enter non integer to stop):  ");

        while(sc.hasNextInt()) {
            set2.add(sc.nextInt());
        }
        Set<Integer> unionSet = union(set1,set2);
        System.out.println("union of two sets : " + unionSet);
        }
    }


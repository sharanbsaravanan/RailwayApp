package hashSetPractice;
//Write a program that creates a HashSet of strings containing the names of your favorite books.
// Add at least five books to the set.
// Then, check if a particular book (e.g., "The Great Gatsby") is in the set.
// Finally, print the size of the set.
import java.util.HashSet;
import java.util.Set;

public class FavoriteBooks {
    public static void main(String[] args) {
        Set<String> books = new HashSet<>();

        books.add("kill");
        books.add("The Great Gatsby");
        books.add("mercury");
        books.add("1823");
        books.add("Harry potter");

        String bookToCheck = "The Great Gatsby";

        if(books.contains(bookToCheck)){
            System.out.println(bookToCheck + " is one of my fav book");
        }
        else {
            System.out.println(bookToCheck +"is not in my list of fav books");
        }
        System.out.println("Total number of favorite books : " +books.size());
    }
}

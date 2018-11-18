
/**
 * Write a description of class MediaLib here.
 *
 * @author (Erica)
 * @version (9/10/18)
 */
public class MediaLib
{
      public static void main()
    {
        System.out.println("Welcome to your Media Library");
        Song song1 = new Song();
        System.out.println(song1);
        song1.setTitle("Johnny B.Goode");
        System.out.println(song1.getTitle());
        song1.setRating(5);
        System.out.println(song1.getRating());
        Movie movie1 = new Movie();
        System.out.println(movie1);
        movie1.setTitle("Iron Man");
        System.out.println(movie1.getTitle());
        movie1.setRating(6);
        System.out.println(movie1.getRating());
        Book book1 = new Book();
        System.out.println(book1);
        book1.setTitle("Hunger Games");
        System.out.println(book1.getTitle());
        book1.setRating(8);
        System.out.println(book1.getRating());
    }
    
}
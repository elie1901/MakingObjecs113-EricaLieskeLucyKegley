
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
        Song song1 = new Song ("Let It Be", 1.29, 6);
        Song song2 = new Song ("Firefly", 1.29, 10);
        Song song3 = new Song ("Dynamite", 1.29, 8);
        
        System.out.println(song1.getTitle());
        System.out.println(song1.getRating());
        System.out.println(song1.getPrice());
        System.out.println(song1.getnumSongs());
        System.out.println(song1.getAverageCost());
        
        System.out.println(song2.getTitle());
        System.out.println(song2.getRating());
        System.out.println(song2.getPrice());
        System.out.println(song2.getnumSongs());
        System.out.println(song2.getAverageCost());

        System.out.println(song3.getTitle());
        System.out.println(song3.getRating());
        System.out.println(song3.getPrice());
        System.out.println(song3.getnumSongs());
        System.out.println(song3.getAverageCost());

        
        
        MediaFile.writeString(song1.getTitle() + " | " + song1.getRating());
        MediaFile.writeString(song2.getTitle() + " | " + song2.getRating());
        MediaFile.writeString(song3.getTitle() + " | " + song3.getRating());
        
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

        MediaFile.saveAndClose(); 
        
        // testing a calculation:
            double testVal = 109.41;
            double testResult  = testVal / 10;
            System.out.println("Testing Result:");
            System.out.println(testResult);
            

        
    }
    
}

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
        Song song2 = new Song ("Firefly", 1.29, 10);
        Song song3 = new Song ("Dynamite", 1.29, 8);
        Song song4 = new Song ("Let It Be", 1.29, 6);
        

        
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

        System.out.println(song4.getTitle());
        System.out.println(song4.getRating());
        System.out.println(song4.getPrice());
        System.out.println(song4.getnumSongs());
        System.out.println(song4.getAverageCost());
       

        
        String t = song2.getTitle();
        MediaFile.writeString(t + " | " + 10);
        
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
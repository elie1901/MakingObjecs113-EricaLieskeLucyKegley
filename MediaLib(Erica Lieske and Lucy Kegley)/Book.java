
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private int rating;
    private String title;
    /**
     * Constructor for objects of class Song
     */
    public Book()
    {
        title = "";
    }
    public String getTitle(){
        return title;
    }   
    public void setTitle(String t) {
        title = t;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int r) {
        rating = r;
    }
   
}

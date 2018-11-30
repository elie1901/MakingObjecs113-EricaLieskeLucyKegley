/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    private int rating;
    private String title;
    private int price;
    
    {
        price = 0.0;
    }
    /**
     * Constructor for objects of class Song
     */
    public Song()
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

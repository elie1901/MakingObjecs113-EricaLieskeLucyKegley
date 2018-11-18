/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    private int rating;
    private String title;
    private int duration;
    private int hours;
    private int minutes;
    
    public int getHours() {
        return hours;
    }
    public void setHours(int h) {
        hours = h;
    }
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int m) {
        minutes = m;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int d){
        duration = d;
    }
    
    /**
     * Constructor for objects of class Movie
     */
    public Movie()
    {
        rating = 0;
        title = "";
        duration = 0;
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
    public Movie(int duration) {
        minutes = duration % 60;
        hours = duration/60;
    }
}

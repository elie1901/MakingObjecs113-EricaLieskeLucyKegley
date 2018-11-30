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
    private double price;
    private boolean favorite;
    private double totalCost;
    private int numSongs;
    private int totalRatings;
    private double averageCost;
    
    
    public Song(String title, double price, int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        totalCost = price + totalCost;
        numSongs = 1 + numSongs;
        totalRatings = rating + totalRatings;
        averageCost = totalCost/numSongs;
    }
    public Song(){
        rating = 0;
        title = "";
        price = 0.0;
        totalCost = 0.0;
        numSongs = 0;
        averageCost = 0.0;

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
       public double getPrice(){
        return price;
    }
    public void setPrice(double p){
          price = p;
    }
    public void addtoFavorites() {
        favorite = true;
    }
    public int getnumSongs (){
        return numSongs;
    }
    public void setnumSongs (int n){
        numSongs = n;
    }
    public double getAverageCost() {
        return averageCost;
    }
    public void setAverageCost (double a){
        averageCost = a;
    }

    
}

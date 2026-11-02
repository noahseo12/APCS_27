package pkg;
public class Movie{
    private String movieName;
    private double rating;
    private int numRatings;
    private double revenue;
    private double newRating;

    public Movie(){
        movieName = "Unknown";
        rating = 0.0;
        numRatings = 0;
        revenue = 0;


    }
    public Movie(String m){
        movieName = m;
        rating = 0.0;
        numRatings = 0;
        revenue = 0;


    }
    public Movie(String m,double r){
        movieName = m;
        rating =r;
        numRatings = 0;
        revenue = 0;


    }
    public Movie(String m,double r, int n){
        movieName = m;
        rating =r;
        numRatings = n;
        revenue = 0;


    }
    

    public Movie(String m, double r, int n, double re){
        movieName = m;
        rating = r;
        numRatings = n;
        revenue = r;
    }
    public void movieToString(){
        System.out.println(movieName);
        System.out.println(rating);
        System.out.println(numRatings);
        System.out.println(revenue);
    }
    public String getMovieName(){
        return movieName;
    }
    public double getRevenue(){
        return revenue;
        
    }
    public void addRating(double r){
        rating = ((10*rating)+r)/11;

    }
    public double getRating(){
        return rating;
    }
    
    
    public boolean compareRatings(String r){
       r = getRating();
        if(rating>r){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    
}
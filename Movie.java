public class Movie {

    String title;
    String genre;
    int rating;

    void playIt(){
        System.out.println("Playing the movie now");
    }
}

class MovieTestdrive{
    public static void main(String args[]){
        Movie a = new Movie();
        a.title = "Bahubali";
        a.genre = "Fictional";
        a.rating = 10;
        System.out.print(a.title);
        a.playIt();
        Movie b = new Movie();
        b.title = "KGF";
        b.genre = "Action";
        b.rating = 10;
        b.playIt();
        Movie c = new Movie();
        c.title = "Dhurandhar";
        c.genre = "Action";
        c.rating = 10;
        c.playIt();
    }
    }
    
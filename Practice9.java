// Methods

class Computer{
    public String playMovie(String movieName){
        String[] moviesList = {"Bahubali","KGF","Pushpa","Dhurandhar","John Wick","Interstellar","With Love","Kantara"};
        int noOfMovies = moviesList.length;
        String resp = "";
        for(int i=0; i<noOfMovies;i++){
            if(movieName == moviesList[i]){
                resp =  "Now Playing : "+movieName;
                // Here break is needed because lets say here we are searching for KGF, the for loop iteration starts executing and KGF is 2nd item in the array list
                // and when KGF is matched with the movie inside the list the resp string will be changed to "Now playing...", and it won't go for else statement.
                // but the iteration will increase and again it will start matching with the other items as well because it will not stop once it is matched until the break is applied.and the resp will be overwritten with "movie not present ..."
                break;
            }else{
                resp = "Movie is not present in Library";
            }
        }

        return resp;
}
}

public class Practice9 {

    public static void main(String args[]){
        Computer lenovo = new Computer();
        String res = lenovo.playMovie("KGF");
        System.out.println(res);
    }
}
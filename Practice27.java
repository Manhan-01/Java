class Demo{
    String title;
    String artist;
    int duration;

    void play(){
        System.out.println("Song playing...");
    }
    void artistName(){
        System.out.println("Now playing "+title+" by "+artist);
    }
}
public class Practice27 {

    public static void main(String args[]){

        Demo song = new Demo();

        song.title = "Let me Love you";
        song.artist = "Justin Beiber";
        song.play();
        song.artistName();

    }
}
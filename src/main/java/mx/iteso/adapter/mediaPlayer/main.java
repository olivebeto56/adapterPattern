package mx.iteso.adapter.mediaPlayer;

public class main {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();


        audioPlayer.play("mp3", "The Scientist");
        audioPlayer.play("mp4", "Paradise");
        audioPlayer.play("vlc", "lost");
        audioPlayer.play("mp5", "Yellow");

    }

}

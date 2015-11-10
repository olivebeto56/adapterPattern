package mx.iteso.adapter.mediaPlayer;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    public void play(String extension, String song) {

        if(extension.equalsIgnoreCase("mp3")){
            System.out.println(song+".mp3");
        }

        else if(extension.equalsIgnoreCase("vlc") || extension.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(extension);
            mediaAdapter.play(extension, song);
        }

        else{
            System.out.println(extension + ": Is invalid Extension");
        }
    }
}


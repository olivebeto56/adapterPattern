package mx.iteso.adapter.mediaPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedPlayer;

    public MediaAdapter(String extension){

        if(extension.equalsIgnoreCase("vlc") ){
            advancedPlayer = new VLCplayer();

        }else if (extension.equalsIgnoreCase("mp4")){
            advancedPlayer = new MP4player();
        }
    }

    public void play(String extension, String song) {

        if(extension.equalsIgnoreCase("vlc")){
            advancedPlayer.playVLC(song, extension);
        }
        else if(extension.equalsIgnoreCase("mp4")){
            advancedPlayer.playMP4(song, extension);
        }
    }
}


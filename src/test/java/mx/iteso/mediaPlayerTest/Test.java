package mx.iteso.mediaPlayerTest;



import mx.iteso.adapter.enemy.impl.EnemyGiantRobot;
import mx.iteso.adapter.mediaPlayer.AudioPlayer;
import org.junit.Before;

import static junit.framework.Assert.assertEquals;


public class Test {
    EnemyGiantRobot enemyGR;


    @org.junit.Test
    public void test(){
        AudioPlayer audioPlayer = new AudioPlayer();


        audioPlayer.play("vlc", "lost");
        audioPlayer.play("mp3", "The Scientist");
        audioPlayer.play("mp4", "Paradise");
        audioPlayer.play("mp5", "Yellow");
    }
}
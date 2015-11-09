package mx.iteso.enemyTets;



import mx.iteso.adapter.enemy.impl.EnemyGiantRobot;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class EnemyGiantTest {
    EnemyGiantRobot enemyGR;

    @Before
    public void setUp(){
        enemyGR= new EnemyGiantRobot();
    }
    @Test
    public void smashWithHandsTest(){
        assertEquals(enemyGR.smashWithHands(), "Enemy Robot Causes Damage With Its Hands");

        assertEquals("","");
    }

    @Test
    public void WalkForwardTest(){
        assertEquals(enemyGR.walkForward(), "Enemy Robot Walks Forward");
    }
    @Test
    public void ReactToHumanTest(){
        assertEquals(enemyGR.reactToHuman("Juan"), "Enemy Robot Tramps on Juan");
    }
}
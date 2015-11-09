package mx.iteso.enemyTets;



import mx.iteso.adapter.enemy.impl.EnemyTank;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class TankTets {
    EnemyTank enemy;
    @Before
    public void setUp(){
        enemy = new EnemyTank();
    }

    @Test
    public void fireWeaponTest(){
        assertEquals(enemy.fireWeapon(), "Enemy tank fires weapon");
    }
    @Test
    public void driveForwardTest(){
        assertEquals(enemy.driveForward(), "Enemy Tank moves forward");
    }
    @Test
    public void assignDriverTest(){
        assertEquals(enemy.assignDriver("Felipe"), "Felipe is driving the tank");
    }
}
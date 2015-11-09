package mx.iteso.adapter.enemy;

// This is the Target Interface : This is what the client
// expects to work with. It is the adapters job to make new
// classes compatible with this one.

public interface EnemyAttacker {

    public String fireWeapon();

    public String driveForward();

    public String  assignDriver(String driverName);

}

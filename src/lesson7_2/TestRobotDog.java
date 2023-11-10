package lesson7_2;

public class TestRobotDog {

    public static void main(String[] args) {
        RobotDog solarDog  = new SolarDog();
        System.out.println(solarDog.getDogID());
        RobotDog batteryDog = new BatteryDog();
        System.out.println(batteryDog.getDogID());
        System.out.println(solarDog.getDogID());


    }







}

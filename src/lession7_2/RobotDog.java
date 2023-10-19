package lession7_2;

public class RobotDog {

    // Class Variable belongs class scope + keyword: static
    // Can call directly from class
    // Object variable belongs to object scope and call by object
    // Class Variable . method duoc sinh ra truoc object
    //
    public static int dogID = 0;
    //

    public RobotDog() {
        dogID ++;
    }

    public  int getDogID() {
        return dogID;
    }
}

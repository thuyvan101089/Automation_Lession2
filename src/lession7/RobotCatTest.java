package lession7;

public class RobotCatTest {
    public static void main(String[] args) {
        //meomeo is a robotcat object - user defined data
        RobotCat meomeo = new RobotCat("miumiu");
        System.out.println(meomeo.getName());
        meomeo.setName("Doraemon");
        System.out.println(meomeo.getName());

    }
}

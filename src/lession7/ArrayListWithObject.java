package lession7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithObject {
    public static void main(String[] args) {
        List<RobotCat> robotCatList = new ArrayList<>();
        RobotCat meomeo = new RobotCat("MiuMiu");
        robotCatList.add(new RobotCat("MiuMiu"));
        robotCatList.add(new RobotCat("MiuMiu"));
        robotCatList.add(new RobotCat("MiuMiu"));
        robotCatList.add(new RobotCat("MiuMiu"));
        robotCatList.add(new RobotCat("MiuMiu"));
        System.out.println(robotCatList.size());
        robotCatList.get(robotCatList.size() -1 ).setName("Doremi");
        System.out.println(robotCatList);



    }
}


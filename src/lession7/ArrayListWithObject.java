package lession7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithObject {
    public static void main(String[] args) {
        List<RobotCat> robotCatList = new ArrayList<>();
        RobotCat meomeo = new RobotCat("MiuMiu");
        // all meomeo add vao deu chung 1 doi tuong va chung 1 vung nho
        robotCatList.add(meomeo);
        robotCatList.add(meomeo);
        robotCatList.add(meomeo);
        robotCatList.add(meomeo);

/*       robotCatList.add(new RobotCat("MiuMiu"));
        robotCatList.add(new RobotCat("MiuMiu"));
        robotCatList.add(new RobotCat("MiuMiu"));
        robotCatList.add(new RobotCat("MiuMiu"));
        robotCatList.add(new RobotCat("MiuMiu"));*/
        meomeo.setName("meomeo1");
        System.out.println(robotCatList.size());
        robotCatList.get(robotCatList.size() -1 ).setName("Doremi");
        System.out.println(robotCatList);



    }
}


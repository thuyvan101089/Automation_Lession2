package lesson9;

import java.util.ArrayList;
import java.util.List;

import static lesson9.HouseWithBuilder.Builder;

public class BuilderDesignTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        HouseWithBuilder house = builder.setColor("Pink")
                .setMainDoor(2)
                .setWindows(5)
                .setTopRoofColor("Blue")
                .build();
        //Immutable
        List<HouseWithBuilder> houseList = new ArrayList<>();
        houseList.add(house);
        houseList.add(house);
        houseList.add(house);


    }

}

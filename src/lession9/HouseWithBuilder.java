package lession9;

import java.util.Locale;

/*
* 1. Object has multiple attributes
* 2. There is a need tos et various of attribute values
* 3. Immutable object (use as it is)
* => Builder Design Pattern
* */
public class HouseWithBuilder {

    private String color = "White";
    private int  mainDoor = 1;
    private int windows = 4;
    private String topRoofColor = "Green";
    // Constructor
    protected HouseWithBuilder (Builder build){
        this.color = build.color;
        this.mainDoor = build.mainDoor;
        this.windows = build.windows;
        this.topRoofColor = build.topRoofColor;

    }

    // READ ONLY

    public String getColor() {
        return color;
    }

    public int getMainDoor() {
        return mainDoor;
    }

    public int getWindows() {
        return windows;
    }

    public String getTopRoofColor() {
        return topRoofColor;
    }

    // Inner Class
    public static class Builder {
        private String color = "White";
        private int  mainDoor = 1;
        private int windows = 4;
        private String topRoofColor = "Green";
        // WRITE ONLY

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMainDoor(int mainDoor) {
            this.mainDoor = mainDoor;
            return this;
        }

        public Builder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder setTopRoofColor(String topRoofColor) {
            this.topRoofColor = topRoofColor;
            return this;
        }

        public HouseWithBuilder build(){
            return new HouseWithBuilder(this);
        }
    }
}

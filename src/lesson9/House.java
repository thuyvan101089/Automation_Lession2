package lesson9;

public class House {
    private String color = "White";
    private int  mainDoor = 1;
    private int windows = 4;
    private String topRoofColor = "Green";

    // When user want to change various of attribute values
    // Providing Setters

    public void setColor(String color) {
        this.color = color;
    }

    public void setMainDoor(int mainDoor) {
        this.mainDoor = mainDoor;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setTopRoofColor(String topRoofColor) {
        this.topRoofColor = topRoofColor;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        House newHouse = new House();
        newHouse.setColor("Pink");
        System.out.println(newHouse.getColor());
    }
}

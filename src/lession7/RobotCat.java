package lession7;

public class RobotCat {
    private String name;
    private int id;

    //Default Construction
    public RobotCat() {

    }

    // Construction Overloading
    public RobotCat(String name) {
        this.name = name;
    }

    public RobotCat(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //Getter: special method return the CURRENT VALUE of object's attribute
    public String getName() {
        return this.name;
    }

    //Setter: special method to change the CURRENT VALUE of object's attribute to a new value
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RobotCat{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

}



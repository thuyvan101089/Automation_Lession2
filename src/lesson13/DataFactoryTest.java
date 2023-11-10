package lesson13;

import java.util.ArrayList;
import java.util.List;

public class DataFactoryTest {
    public static void main(String[] args) {
        String inputFileRelativePath = "\\src\\lesson13\\People.txt";
        String outfileRelativePath = "\\src\\lesson13\\People_New.txt";
        String projectLocation = System.getProperty("user.dir");
        String inputFileAbsolutePath = projectLocation.concat(inputFileRelativePath);
        String outfileAbsolutePath = projectLocation.concat(outfileRelativePath);

        //Read data and convert to List person
         List<Person> personList = DataFactory.convertDataIntoList(inputFileAbsolutePath);
        System.out.println(personList);
        //Write list person to data file
        DataFactory.savePersonList(personList,outfileAbsolutePath);
    }

}

package lesson13;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataFactory {
    public static List<Person> convertDataIntoList(String filePath) {
        List<Person> personList = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {

                final int PERSON_NAME_INDEX = 0;
                final int PERSON_AGE_INDEX = 1;

                System.out.println(dataLine);

                String[] personData = dataLine.split(";");
                System.out.println(Arrays.toString(personData));
                String personName = personData[PERSON_NAME_INDEX];
                int personAge = Integer.parseInt(personData[PERSON_AGE_INDEX]);
                Person person = new Person(personName, personAge);
                personList.add(person);
                dataLine = bufferedReader.readLine();
            }
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            throw new CustomFileNotFound(filePath);

        } catch (IOException e) {
            throw new RuntimeException("Error while reading data file");
        }

        return personList;

    }


    public static void savePersonList(List<Person> personList, String filePath) {
        if (personList == null || filePath == null) {
            throw new IllegalArgumentException("Person list or file path can not be null");

        }
        if (personList.isEmpty()) {
            System.out.println("Person List is empty");
            return;
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {

            for (Person personData : personList) {
                String personName = personData.getName();
                String personAge = String.valueOf(personData.getAge());
                String dataline = personName + ";" + personAge;
                bufferedWriter.write(dataline);
                bufferedWriter.newLine();

            }

        } catch (FileNotFoundException e) {
            throw new CustomFileNotFound(filePath);

        } catch (IOException e) {
            throw new RuntimeException("Error while reading data file");
        }


        }
    }

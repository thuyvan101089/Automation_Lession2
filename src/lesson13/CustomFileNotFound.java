package lesson13;

public class CustomFileNotFound extends RuntimeException{
    public CustomFileNotFound(String fileName) {
        super("FileNotFound: " + fileName);
    }
}

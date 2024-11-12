package session4.example1;

public class FileUtilsException extends Exception {

    public FileUtilsException(String message) {
        super(message);
    }

    public FileUtilsException(String message, FileNotFoundException cause) {
        super(message, cause);
    }

    public FileUtilsException(String message, IOException cause) {
        super(message, cause);
    }

    public FileUtilsException(String message, SecurityException cause) {
        super(message, cause);
    }
}

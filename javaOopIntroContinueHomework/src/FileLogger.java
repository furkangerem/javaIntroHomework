public class FileLogger extends BaseLogger {

    @Override
    public void log(String message) {
        System.out.println("The message logged in File: " + message);
    }
}

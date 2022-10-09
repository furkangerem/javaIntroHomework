public class DatabaseLogger extends BaseLogger {

    @Override
    public void log(String message) {
        System.out.println("The message logged in database: " + message);
    }
}

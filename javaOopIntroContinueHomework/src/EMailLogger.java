public class EMailLogger extends BaseLogger {

    @Override
    public void log(String message) {
        System.out.println("The message logged in e-mail: " + message);
    }
}

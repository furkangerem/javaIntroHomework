public class StudentCreditManager extends BaseCreditManager{
    @Override
    public void calculate() {

    }

    public double calculate(double amount) {

        return amount * 1.10;
    }
}

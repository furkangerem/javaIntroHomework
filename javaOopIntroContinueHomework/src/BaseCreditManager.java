public abstract class BaseCreditManager implements ICreditManager{
    public abstract void calculate();

    public void save() {

        System.out.println("Credit is saved.");
    }

    public double calculate(double amount) {

        return amount * 1.18;
    }
}

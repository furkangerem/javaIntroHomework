import javax.xml.crypto.Data;

public class CustomerManager {

    private BaseLogger baseLogger;
    BaseDatabaseManager baseDatabaseManager;
    ICustomerDal iCustomerDal;
    private Customer customer;
    private ICreditManager iCreditManager;

    public CustomerManager(Customer customer, ICreditManager iCreditManager, BaseLogger baseLogger) {

        this.customer = customer;
        this.iCreditManager = iCreditManager;
        this.baseLogger = baseLogger;
        System.out.println("Customer object is initialized!");
    }

    public CustomerManager() {

    }
    public CustomerManager(ICustomerDal iCustomerDal) {

        this.iCustomerDal = iCustomerDal;
    }

    public void save() {

        System.out.println("Customer is Saved!: " + customer.firstName + " " + customer.lastName);
    }

    public void delete() {

        System.out.println("Customer is Deleted!: " + customer.firstName + " " + customer.lastName);
    }

    public void giveCredit() {

        iCreditManager.calculate();
        System.out.println("Credit is ready to given.");
    }

    public void add() {

        System.out.println("Customer is added.");
        //this.baseLogger.Log("Log message");
        iCustomerDal.add();
    }

    public void getCustomer() {

        baseDatabaseManager.getData();
    }

}

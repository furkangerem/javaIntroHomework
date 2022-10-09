import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {

        /* Reference Type
        int[] numbers = {1, 2, 3};
        int[] numbers2 = {10, 20, 30};
        numbers = numbers2;

        numbers2[0] = 1000;
        System.out.println(numbers[0]);
         */

        /* C# Video, Part 1
        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.save();

        Customer customer = new Customer();
        customer.id = 1;
        customer.firstName = "Furkan";
        customer.lastName = "GEREM";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
        customerManager.delete();

        Company company = new Company();
        company.companyName = "MFG";
        company.taxNumber = "121212";
        company.id = 100;

        Person person = new Person();
        person.nationalId = "1212121212";
         */

        /* C# Video, Part 2
        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.giveCredit();
         */

        /* Course 38, Polymorphism
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EMailLogger(), new DatabaseLogger()};
        for(BaseLogger logger:loggers) {

            logger.log("Log message in For scope.");
        }
        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager(),new DatabaseLogger());
        customerManager.add();
         */

        /* Course 39, Overriding
        BaseCreditManager[] baseCreditManagers = new BaseCreditManager[]{new TeacherCreditManager(), new SoldierCreditManager(), new StudentCreditManager()};
        for (BaseCreditManager baseCreditManager : baseCreditManagers) {

            System.out.println(baseCreditManager.calculate(1000));
        }
         */

        /* Course 40, Abstract
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.calculate();
        womanGameCalculator.gameOver();

        GameCalculator gameCalculator = new KidsGameCalculator();
         */

        /* Course 41, Abstract Demo
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new SqlServerDatabaseManager();
        customerManager.getCustomer();
         */

        /* Course 42, Interface
        ICustomerDal iCustomerDal = new OracleCustomerDal();
         */

        /* Course 43, Interface with Polymorphism
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
         */

        /* Course 44, Multi implementation Demo

         */

        // Course 45, Compositon Inner Class & Static

        ProductManager productManager = new ProductManager();
        Product product = new Product();

        product.price = 10;
        product.name = "Pencil";

        productManager.add(product);

        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();

    }
}
public class MySqlCustomerDal implements ICustomerDal, IRepository {

    @Override
    public void add() {

        System.out.println("The data is added in MySql DB.");
    }
}

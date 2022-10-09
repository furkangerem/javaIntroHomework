public class ProductManager {

    public void add(Product product) {

        ProductValidator productValidator = new ProductValidator();
        if (ProductValidator.isValid(product))
            System.out.println("Added in db.");
        else
            System.out.println("Can't added in db.");
    }
}

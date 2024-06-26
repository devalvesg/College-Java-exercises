package src;

public class CarItem {
    private int id;
    private int quantity;
    private Product product;


    public CarItem() {
    }

    public CarItem(int id, int quantity, Product product) {
        setId(id);
        setQuantity(quantity);
        setProduct(product);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", quantity=" + quantity +
                ", product=" + product;

    }
}

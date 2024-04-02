package src;

public class Product {

    private int id;
    private String nome;
    private float price;


    public Product() {
    }

    public Product(int id, String nome, float price) {
        setNome(nome);
        setPrice(price);
        setId(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", price=" + price +
                ", id=" + id;
    }
}

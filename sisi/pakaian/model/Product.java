package id.sisi.pakaian.model;

public class Product {
    private int id;
    private String name;
    private float price;
    private int stock;
    private Category category;
    private boolean isAvailable;
    private String size;

    public Product(int id, String name, float price, int stock, Category category, boolean isAvailable, String size) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
        this.isAvailable = isAvailable;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getSize() {
        return size;
    }

   public void setSize(String size) {
        this.size = size;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }
    
     public boolean isAvailabe() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    
}

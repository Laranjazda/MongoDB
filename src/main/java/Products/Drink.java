package Products;

public class Drink {
    private String brand;
    private boolean isPerishable;
    private String description;
    private float price;

    public Drink(String brand, boolean isPerishable, String description, float price) {
        this.brand = brand;
        this.isPerishable = isPerishable;
        this.description = description;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isPerishable() {
        return isPerishable;
    }

    public void setPerishable(boolean perishable) {
        isPerishable = perishable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "brand='" + brand + '\'' +
                ", isPerishable=" + isPerishable +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}

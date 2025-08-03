package ag.demo.selm.entity;

public class Product {
    private Integer id;
    private String title;
    private String details;
    public Product(int id, String name, String description) {
        this.id = id;
        this.title = name;
        this.details = description;
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }

    public String getDescription() {
        return details;
    }

    public void setDescription(String description) {
        this.details = description;
    }
}

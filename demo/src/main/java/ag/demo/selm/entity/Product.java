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

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public String getDescription() {
        return details;
    }

    public void setDescription(String description) {
        this.details = description;
    }
}

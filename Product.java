package construcaoweb.demo.model;

public class Product {
    private Integer id;
    private String name;
    public Integer getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
}


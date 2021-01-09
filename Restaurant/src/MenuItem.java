public class MenuItem {
    private String name;
    private String type;
    private String description;
    private Boolean isNew;
    private Double price;




    public MenuItem(String name, String type, String description, Boolean newItem, Double price){
        this.name = name;
        this.type = type;
        this.description = description;
        this.isNew = true;
        this.price = price;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean IsNew() {
        return isNew;
    }

   public void changeIsNew() {
        this.isNew = !this.isNew;

    }


    public String orderSummary() {
        return "Item: " + this.name + "\nItem Type: " + this.type + "\nDescription: " + this.description +
                "\nPrice: " + this.price + "\n";
    }

    //Modify to add scanners and method for taking customer order. (like in funWithQuizzes repo)

}
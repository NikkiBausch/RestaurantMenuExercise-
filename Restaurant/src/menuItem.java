import java.util.ArrayList;



public class menuItem {
    private String name;
    private String type;
    private String description;
    private Boolean newItem;




    public menuItem(String name, String type, String description, Boolean newItem){
        this.name = name;
        this.type = type;
        this.description = description;
        this.newItem = newItem;

    }
    public menuItem(String name, String type, String description){
        this(name, type, description, true);
    }

}





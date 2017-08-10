package models;


import java.util.ArrayList;

public class crudProject {
    private String cakes;
    private String sprinkles;


    private int id;


    private String frosting;
    private String filling;
    private static ArrayList<crudProject> allCakes = new ArrayList<crudProject>();

    public crudProject(String cakes, String sprinkles, String frosting, String filling) {
        this.cakes = cakes;
        this.sprinkles = sprinkles;
        this.frosting = frosting;
        this.filling = filling;
        allCakes.add(this);
        this.id = allCakes.size();
    }

    public static void clearAllCakes() {
        allCakes.clear();
    }
    public static crudProject findById(int id){
        return allCakes.get(id-1);
    }


    //Getter
    public String getCakes() {
        return cakes;
    }
    public static ArrayList<crudProject> getAllCakes() {
        return allCakes;
    }
    public String getSprinkles() {
        return sprinkles;
    }

    public String getFrosting() {
        return frosting;
    }

    public String getFilling() {
        return filling;
    }
    public int getId() {
        return id;
    }
    public void update(String cakes, String sprinkles, String frosting, String filling) {
        this.cakes = cakes;
        this.sprinkles = sprinkles;
        this.frosting = frosting;
        this.filling = filling;
    }

}

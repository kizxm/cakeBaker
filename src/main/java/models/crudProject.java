package models;


import java.util.ArrayList;

public class crudProject {
    private String cakes;
    private String sprinkles;



    private String frosting;
    private String filling;
    private static ArrayList<crudProject> allCakes = new ArrayList<crudProject>();

    public crudProject(String cakes, String sprinkles, String frosting, String filling) {
        this.cakes = cakes;
        this.sprinkles = sprinkles;
        this.frosting = frosting;
        this.filling = filling;
        allCakes.add(this);
    }

    public static void clearAllCakes() {
        allCakes.clear();
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

}

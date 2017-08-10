package models;


import java.util.ArrayList;

public class crudProject {
    private String cakes;
    private String sprinkles;
    private static ArrayList<crudProject> allCakes = new ArrayList<crudProject>();

    public crudProject(String cakes, String sprinkles) {
        this.cakes = cakes;
        this.sprinkles = sprinkles;
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

}

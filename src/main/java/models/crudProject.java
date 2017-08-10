package models;


import java.util.ArrayList;

public class crudProject {
    private String cakes;
    private static ArrayList<crudProject> allCakes = new ArrayList<crudProject>();

    public crudProject(String cakes) {
        this.cakes = cakes;
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

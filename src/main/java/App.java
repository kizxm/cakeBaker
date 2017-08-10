import models.crudProject;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");



        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<crudProject> allCakes = crudProject.getAllCakes();
            model.put("allCakes", allCakes);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

//        post("/index", (request, response) -> {
//                    Map<String, Object> model = new HashMap<String, Object>();
//                    String cakes = request.queryParams("cakes");
//                    String frosting = request.queryParams("frosting");
//                    String filling = request.queryParams("filling");
//                    String sprinkles = request.queryParams("sprinkles");
//                    crudProject newplaces = new crudProject(cakes, frosting, filling, sprinkles);
//                    return new ModelAndView(model, "index.hbs");
//                }, new HandlebarsTemplateEngine());

        get("/cakes/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "cake-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/cakes/new", (request, response) -> {
                    Map<String, Object> model = new HashMap<String, Object>();
                    String cakes = request.queryParams("cakes");
                    String frosting = request.queryParams("frosting");
                    String filling = request.queryParams("filling");
                    String sprinkles = request.queryParams("sprinkles");
                    crudProject newCake = new crudProject(cakes, frosting, filling, sprinkles);
                   return new ModelAndView(model, "index.hbs");
                }, new HandlebarsTemplateEngine());



    }
}

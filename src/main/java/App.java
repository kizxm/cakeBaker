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

        get("/cakes/:id", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            int idOfCakeToFind = Integer.parseInt(req.params("id"));
            crudProject cakesMade = crudProject.findById(idOfCakeToFind);
            model.put("cakes", cakesMade);
            return new ModelAndView(model, "cake-details.hbs");
        }, new HandlebarsTemplateEngine());

        get("/cakes/:id/update", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            int idOfPostToEdit = Integer.parseInt(req.params("id"));
            crudProject editCakes = crudProject.findById(idOfPostToEdit);
            model.put("editCakes", editCakes);
            return new ModelAndView(model, "cake-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/cakes/:id/update", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            String cakes = req.queryParams("cakes");
            String sprinkles = req.queryParams("sprinkles");
            String frosting = req.queryParams("frosting");
            String filling = req.queryParams("filling");
            int idOfPostToEdit = Integer.parseInt(req.params("id"));
            crudProject editCakes = crudProject.findById(idOfPostToEdit);
            editCakes.update(cakes, sprinkles, frosting, filling);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

    }
}

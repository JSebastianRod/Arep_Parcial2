package edu.escuelaing.arep.app;

import static spark.Spark.*;

public class Secuence {

    public static void main(String... args) {
        staticFiles.location("/public");
        port(getPort());
        get("hello", (req, res) -> "Hello Docker!");
        get("collatzsequence", (req, res) -> {
            res.type("text/json");
            return ("{\n operation = collatzsequence,\n input : "+ Integer.parseInt(req.queryParams("value"))  + " , \n output : " +
                    getSequence(Integer.parseInt(req.queryParams("value"))) + "\n}");
        });

    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

    private static String getSequence(int value) {
        String numbers = String.valueOf(value);
        while (value > 1) {
            if (value % 2 == 0) {
                value = value / 2;
            } else {
                value = (value * 3) + 1;
            }
            numbers = numbers + "->" + String.valueOf(value);
        }
        return numbers;
    }

}

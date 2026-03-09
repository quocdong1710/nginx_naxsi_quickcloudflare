import io.javalin.Javalin;

public class App {

    public static void main(String[] args) {

        int PORT = Integer.parseInt(System.getenv().getOrDefault("PORT", "7000"));
        String NAME = System.getenv().getOrDefault("NAME", "server-name");

        Javalin app = Javalin.create().start(PORT);

        app.get("/", ctx -> {
            ctx.result("This is server run balanced with " + NAME);
        });

        System.out.println("Server is running on  with name " + NAME);
    }
}
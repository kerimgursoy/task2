import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        RandGame game = new RandGame();
        game.gameP = game;
        game.start();
    }

    @Override
    public void start(Stage stage) throws Exception {

    }
}
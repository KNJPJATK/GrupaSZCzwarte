package sample2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
Główna klasa naszej aplikacji
 */
public class Main2 extends Application {

  /*
  Metoda wywoływana jako pierwsza podczas uruchamiania naszej aplikacji
   */
  @Override
  public void start(Stage primaryStage) throws Exception {
    // załadowanie pliku z widokiem który utworzyliśmy w Scene Builderze
    Parent root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
    // ustawienie nagłówka w głównej belce naszej aplikacji
    primaryStage.setTitle("Prosta aplikacja");
    // ustawienie sceny i jej rozmiarów, to w niej potem umieszczane są wszystkie nasze komponenty zdefiniowane w pliku fxml
    primaryStage.setScene(new Scene(root, 600, 400));
    // odpowiednik setVisible() ze Swinga
    primaryStage.show();
  }

  /*
  Uruchomienie naszej aplikacji
   */
  public static void main(String[] args) {
    launch(args);
  }
}

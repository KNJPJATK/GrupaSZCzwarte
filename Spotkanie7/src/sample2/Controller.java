package sample2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/*
Klasa kontrolera dla naszego pliku widoku - sample2.fxml
 */
public class Controller {

  /*
  Dzięki tej adnotacji w kontrolerze przy starcie aplikacji nasza zmienna z kontrolera zostanie automatycznie
  powiązana z kontrolką zdefiniowaną w pliku fxml.
  Należy pamiętać aby nazwa zmiennej była taka sama jak nazwa podana w plku fxml jako fx:id
   */
  @FXML
  private Label label;

  @FXML
  private Button button;

  /*
  Podobnie jak z kontrolkami ta adnotacja powiąże nam automatycznie nasze metody przypisane do kontrolek.
  W tym przypadku w pliku fxml dla przycisku mamy wpis: onAction="#addNumber", jeśli damy adnotację @FXML i
  nazwiemy naszą metodę tak samo to zostanie ona automatycznie powiązana z daną akcją dla przycisku.

  Tutaj nasza metoda pobiera wartość z labelki, parsuje ją do inta bo nie mamy pewności czy tekst jest liczbą
  a następnie zwiększamy wartość o 1 i przypisujemy tą nową do kontrolki.
   */
  @FXML
  void addNumber(ActionEvent event) {
    int num = Integer.parseInt(label.getText());
    num++;
    label.setText(String.valueOf(num));
  }

}

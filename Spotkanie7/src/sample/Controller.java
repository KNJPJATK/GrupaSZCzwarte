package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/*
Klasa kontrolera dla naszego pliku widoku - sample.fxml
 */
public class Controller {

  /*
  Dzięki tej adnotacji w kontrolerze przy starcie aplikacji nasza zmienna z kontrolera zostanie automatycznie
  powiązana z kontrolką zdefiniowaną w pliku fxml.
  Należy pamiętać aby nazwa zmiennej była taka sama jak nazwa podana w plku fxml jako fx:id
   */
  @FXML
  private TableView<Osoba> osobyTable;

  @FXML
  private TableColumn<Osoba, String> cImie;

  @FXML
  private TableColumn<Osoba, String> cNazwisko;

  @FXML
  private Label imie;

  @FXML
  private Label nazwisko;

  @FXML
  private Label wiek;

  @FXML
  private Label ulica;

  @FXML
  private Label miasto;

  // klasa modelu z mvc, to w niej mamy przechowywane dane (w naszym przypadku listę osób)
  private Model model;

  /*
  Dlaczego tak a nie poprzez konstruktor?
  Konstruktor jest wywoływany jako pierwszy, potem są bindowane wszystkie pola z adnotacją @FXML
  a dopiero potem jest wywoływana metoda initialize().

  Co w związku z tym? W konstruktorze nie mamy jeszcze dostępu do pól z adnotacją @FXML więc pojawia się problem,
  którego zgodnie z w/w kolejnością już nie napotkamy :)
   */
  @FXML
  public void initialize() {
    this.model = new Model();
    model.prepareTestData();

    // przypisujemy dane z listy osób dostępnej w modelu do naszej tabeli z widoku
    osobyTable.setItems(model.getListaOsob());

    // podajemy tutaj co ma się wyświetlać nam w danych kolumnach tabeli
    cImie.setCellValueFactory(cellData -> cellData.getValue().imieProperty());
    cNazwisko.setCellValueFactory(celldata -> celldata.getValue().nazwiskoProperty());

    // w pliku fxml nie mamy możliwości podpięcia metody wywoływanej po wybraniu pozycji z tabeli dlatego robimy to ręcznie
    osobyTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> pokazSzczegolyOsoby(newValue));
  }

  private void pokazSzczegolyOsoby(Osoba osoba) {
    if (osoba != null) {
      imie.setText(osoba.getImie());
      nazwisko.setText(osoba.getNazwisko());
      wiek.setText(String.valueOf(osoba.getWiek()));
      ulica.setText(osoba.getUlica());
      miasto.setText(osoba.getMiasto());
    } else {
      imie.setText("");
      nazwisko.setText("");
      wiek.setText("");
      ulica.setText("");
      miasto.setText("");
    }
  }

}

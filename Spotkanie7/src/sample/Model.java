package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/*
Klasa modelu z prostego mvc, przechowuje nam listę osób.
 */
public class Model {

  // typ kolekcji, którą możemy bez żadnych konwersji przypisać do tabeli w widoku
  private ObservableList<Osoba> listaOsob = FXCollections.observableArrayList();

  public ObservableList<Osoba> getListaOsob() {
    return listaOsob;
  }

  public void setListaOsob(ObservableList<Osoba> listaOsob) {
    this.listaOsob = listaOsob;
  }

  public void prepareTestData() {
    listaOsob.add(new Osoba("Jan", "Nowak", 22, "Słoneczna", "Warszawa"));
    listaOsob.add(new Osoba("Janusz", "Kowalski", 45, "Jasna", "Warszawa"));
  }
}

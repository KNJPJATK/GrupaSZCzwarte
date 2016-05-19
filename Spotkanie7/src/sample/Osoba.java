package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Osoba {

  /*
  StringProperty zamiast zwykłego Stringa - dzięki temu łątwiej nam korzystać z obiektu Osoby w naszym TableView,
  nie jest wymagana żadna konwersja między typami.
   */
  private StringProperty imie;

  private StringProperty nazwisko;

  private IntegerProperty wiek;

  private StringProperty ulica;

  private StringProperty miasto;


  public Osoba(StringProperty imie, StringProperty nazwisko, IntegerProperty wiek, StringProperty ulica, StringProperty miasto) {
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.wiek = wiek;
    this.ulica = ulica;
    this.miasto = miasto;
  }

  public Osoba(String imie, String nazwisko, int wiek, String ulica, String miasto) {
    this.imie = new SimpleStringProperty(imie);
    this.nazwisko = new SimpleStringProperty(nazwisko);
    this.wiek = new SimpleIntegerProperty(wiek);
    this.ulica = new SimpleStringProperty(ulica);
    this.miasto = new SimpleStringProperty(miasto);
  }

  public String getImie() {
    return imie.get();
  }

  public StringProperty imieProperty() {
    return imie;
  }

  public void setImie(String imie) {
    this.imie.set(imie);
  }

  public String getNazwisko() {
    return nazwisko.get();
  }

  public StringProperty nazwiskoProperty() {
    return nazwisko;
  }

  public void setNazwisko(String nazwisko) {
    this.nazwisko.set(nazwisko);
  }

  public int getWiek() {
    return wiek.get();
  }

  public IntegerProperty wiekProperty() {
    return wiek;
  }

  public void setWiek(int wiek) {
    this.wiek.set(wiek);
  }

  public String getUlica() {
    return ulica.get();
  }

  public StringProperty ulicaProperty() {
    return ulica;
  }

  public void setUlica(String ulica) {
    this.ulica.set(ulica);
  }

  public String getMiasto() {
    return miasto.get();
  }

  public StringProperty miastoProperty() {
    return miasto;
  }

  public void setMiasto(String miasto) {
    this.miasto.set(miasto);
  }
}

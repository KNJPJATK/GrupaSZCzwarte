package edu.knpj;

import java.util.*;

public class Main {

    public static class SimplePair{

        private Object firstObject;
        private Object secondObject;

        public SimplePair(Object firstObject, Object secondObject) {
            this.firstObject = firstObject;
            this.secondObject = secondObject;
        }

        public Object getFirstObject() {
            return firstObject;
        }

        public void setFirstObject(Object firstObject) {
            this.firstObject = firstObject;
        }

        public Object getSecondObject() {
            return secondObject;
        }

        public void setSecondObject(Object secondObject) {
            this.secondObject = secondObject;
        }
    }

    public static class Pair<T1, T2>{

        private T1 first;
        private T2 second;

        public Pair(T1 first, T2 second) {
            this.first = first;
            this.second = second;
        }

        public T1 getFirst() {
            return first;
        }

        public void setFirst(T1 first) {
            this.first = first;
        }

        public T2 getSecond() {
            return second;
        }

        public void setSecond(T2 second) {
            this.second = second;
        }

    }

    public static class Simple<T>{}
    public static class Triplet<T1,T2,T3>{}
    public static class Quadruplet<T1,T2,T3,T4>{}

    public static class PairUtils{
        public static <T1, T2> boolean compare(Pair<T1, T2> firstPair, Pair<T1, T2> secondPair){
            return firstPair.getFirst().equals(secondPair.getFirst())
                    && firstPair.getSecond().equals(secondPair.getSecond());
        }
    }

    public interface TopInterface{
        void doSomething();
    }

    public static class A implements TopInterface{

        @Override
        public void doSomething() {

        }
    }

    public static class B implements TopInterface{

        @Override
        public void doSomething() {

        }
    }

    public static class UsingClass<T extends TopInterface>{
        public void doWork(){

        }
    }


    public static abstract class Employee{
        int id;
        String name;
        public abstract void doOfficeWork();
    }

    public static class Manager extends Employee{
        @Override
        public void doOfficeWork() {
            System.out.println("Manager: " + id + ":" + name + " manages like crazy");
        }
    }

    public static class Intern extends Employee{

        @Override
        public void doOfficeWork() {
            System.out.println("Intern: " + id + ":" + name + " is lazy.");
        }
    }

    public static class TeamOffice<T extends Employee>{

        T [] employees;// = new T[];

        /*
            addEmployee();
         */

        public void doTeamWork(){
            for(T employee : employees){
                employee.doOfficeWork();
            }
        }
    }

    public static void main(String[] args) {
        /*
        SimplePair simplePair = new SimplePair(1, 1);
        simplePair.setFirstObject("Foobar");
        int sum = (int) simplePair.getFirstObject() + (int) simplePair.getSecondObject();
        */

        Pair<String, String> stringPair = new Pair<String, String>("foo", "bar");
//        stringPair.setFirst(25);
        Pair<Integer, Integer> intPair = new Pair<>(25, 25);
        Pair<Integer, String> intStringPair = new Pair<>(1, "apple");
        Pair<Object, Object> objectPair = new Pair<>(25, new Integer(25));

        boolean same = PairUtils.compare(intPair, intPair);

        //  Listy

        List<String> stringArrayList = new ArrayList<>(Arrays.asList(args));
        List<String> stringLinkedList = new LinkedList<>(Arrays.asList(args));

        for (int i = 0; i < args.length; i++) {
            System.out.println(stringArrayList.get(i) + "-" + stringLinkedList.get(i));
        }

        stringArrayList.add(0, "asd");
        System.out.println(stringArrayList.get(0));

        stringArrayList.addAll(stringLinkedList);

        System.out.println("Rozmiar ArrayListy po dodaniu do niej LinkedList: " + stringArrayList.size());

        System.out.println("Elementy ArrayList po dodaniu do niej LinkedList:");
        for (String stringElement :
                stringArrayList) {
            System.out.println(stringElement);
        }


        stringArrayList.remove("asd");
        System.out.println("Po usunieciu stringa: asd z arraylist");
        for (String stringElement :
                stringArrayList) {
            System.out.println(stringElement);
        }
        System.out.println("Czy stringArrayList zawiera 1?");
        System.out.println(stringArrayList.contains("1"));
        System.out.println("Czy stringArrayList zawiera 8?");
        System.out.println(stringArrayList.contains("9"));


        //  usuwamy "1" - dobra metoda na usuwanie obiektow
        for (int i = 0; i < stringArrayList.size(); i++) {
            if(stringArrayList.get(i).equals("1")){
                stringArrayList.remove(i);
            }
        }

        System.out.println("Po usunieciu 1");
        for (String stringElement :
                stringArrayList) {
            System.out.println(stringElement);
        }

        System.out.println("Indeks 2?");
        System.out.println(stringArrayList.indexOf("2"));

        System.out.println("Ustawiamy pod 0 - asd ");
        stringArrayList.set(0, "asd");
        System.out.println(stringArrayList.get(0));

        LinkedList<Integer> integers = new LinkedList<>();
        //  Koniec list

        //  Sety
        Set<String> stringSet = new HashSet<>(Arrays.asList(args));
        //  w args jest 1, 2, 3, 4, 5, 6, 7
        System.out.println("Czy stringSet zawiera 1:");
        System.out.println(stringSet.contains("1"));
        System.out.println("iterujemy przez stringSet");
        //  kolejnosc nie jest gwarantowana
//        for (String stringElement :
//                stringSet) {
//            System.out.println(stringElement);
//        }
//
//        for (int i = 0; i < 100; i++) {
//            String stringToAdd = (i + 100) + "";
//            stringSet.add(stringToAdd);
//        }
//
//        System.out.println("iterujemy przez stringSet po dodaniu 100 elementow i sprawdzamy czy porzadek" +
//                                   "zostal naruszony");
//
//        for (String stringElement :
//                stringSet) {
//            System.out.println(stringElement);
//        }
//
//        Set<Integer> intTreeSet = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//
//        System.out.println("Iterujemy przez tree set");
//
//        for (int intElement :
//                intTreeSet) {
//            System.out.println(intElement);
//        }
//
//        for (int i = 0; i < 100; i++) {
//            int intToAdd = (i + 100);
//            intTreeSet.add(intToAdd);
//        }
//
//        System.out.println("iterujemy przez Tree Set po dodaniu 100 elementow i sprawdzamy czy porzadek" +
//                                   "zostal naruszony");

//        for (int intElement :
//                intTreeSet) {
//            System.out.println(intElement);
//        }

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "First definition");
        System.out.println("Czy mapa ma wartość dla klucza 1?");
        System.out.println(map.containsKey(1));

        System.out.println("Pobranie wartości dla klucza 1");
        System.out.println("wartość dla klucza 1: " + map.get(1));

        System.out.println("--------");

        map.put(2, "Second definition");
        map.put(3, "Third definition");
        map.put(4, "Fourth definition");

        if (!map.containsKey(2)){
            map.put(2, "Some defintion");
        }

        for (Map.Entry<Integer, String> entry:
             map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }

    }
}

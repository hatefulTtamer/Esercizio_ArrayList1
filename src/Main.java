/*
Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Rocco", 24));
        students.add(new Student("Angelo", 26));
        students.add(new Student("Luca", 30));
        students.add(new Student("Giustino", 18));
        for (Student student : students) {
            System.out.println(student.getName() + ", " + student.getAge());
        }
        students.add(new Student("Emanuele", 35));
        students.add(new Student("Orazio", 29));
        students.add(new Student("Davide", 20));
        students.add(new Student("Rachele", 23));
        for (Student student : students) {
            System.out.println(student.getName() + ", " + student.getAge());

        }
    }
}
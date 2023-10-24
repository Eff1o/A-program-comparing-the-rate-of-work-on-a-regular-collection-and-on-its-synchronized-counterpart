import java.util.ArrayList;
import java.util.Vector;

public class CollectionComparison {
    public static void main(String[] args) {
        // Tworzenie zwykłej kolekcji ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Początek pomiaru czasu dla ArrayList
        long arrayListStartTime = System.currentTimeMillis();

        // Dodawanie 1 000 000 losowych liczb do ArrayList
        for (int i = 0; i < 1000000; i++) {
            arrayList.add((int) (Math.random() * 1000));
        }

        // Koniec pomiaru czasu dla ArrayList
        long arrayListEndTime = System.currentTimeMillis();

        // Obliczanie czasu wykonania dla ArrayList
        long arrayListExecutionTime = arrayListEndTime - arrayListStartTime;

        // Tworzenie zsynchronizowanej kolekcji Vector
        Vector<Integer> vector = new Vector<>();

        // Początek pomiaru czasu dla Vector
        long vectorStartTime = System.currentTimeMillis();

        // Dodawanie 1 000 000 losowych liczb do Vector
        for (int i = 0; i < 1000000; i++) {
            vector.add((int) (Math.random() * 1000));
        }

        // Koniec pomiaru czasu dla Vector
        long vectorEndTime = System.currentTimeMillis();

        // Obliczanie czasu wykonania dla Vector
        long vectorExecutionTime = vectorEndTime - vectorStartTime;

        // Wyświetlanie wyników
        System.out.println("Czas wykonania dla ArrayList: " + arrayListExecutionTime + " ms");
        System.out.println("Czas wykonania dla Vector: " + vectorExecutionTime + " ms");
    }
}
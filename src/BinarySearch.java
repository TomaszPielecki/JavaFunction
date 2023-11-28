
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] liczbyInicjalne = {1, 2, 3, 4, 5};

        // Najpierw upewnij się, że tablica jest posortowana
        Arrays.sort(liczbyInicjalne);

        // Wyszukaj wartość 3 w posortowanej tablicy
        int indeks = Arrays.binarySearch(liczbyInicjalne, 3);

        // Wyświetl wynik
        if (indeks >= 0) {
            System.out.println("Znaleziono wartość 3 na indeksie: " + indeks);
        } else {
            System.out.println("Nie znaleziono wartości 3 w tablicy.");
        }
    }
}



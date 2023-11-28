import java.util.Arrays;

public class BinarySearchExample {

    private int[] sortedArray;

    // Konstruktor klasy, przyjmujący posortowaną tablicę
    public BinarySearchExample(int[] sortedArray) {
        this.sortedArray = sortedArray;
        // Upewnij się, że tablica jest posortowana
        Arrays.sort(this.sortedArray);
    }

    // Metoda do wyszukiwania wartości w tablicy
    public int searchValue(int value) {
        // Wykorzystaj binarySearch do znalezienia indeksu wartości w posortowanej tablicy
        return Arrays.binarySearch(sortedArray, value);
    }

    public static void main(String[] args) {
        // Przykładowe użycie klasy
        int[] liczbyInicjalne = {1, 2, 3, 4, 5};
        BinarySearchExample searcher = new BinarySearchExample(liczbyInicjalne);

        // Wyszukaj wartość 3 w posortowanej tablicy
        int indeks = searcher.searchValue(3);

        // Wyświetl wynik
        if (indeks >= 0) {
            System.out.println("Znaleziono wartość 3 na indeksie: " + indeks);
        } else {
            System.out.println("Nie znaleziono wartości 3 w tablicy.");
        }
    }
}

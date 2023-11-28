import java.util.Arrays;

public class Tablice {
    public static void main(String[] args) {
        //1.Deklaracja liczb calkowitych
        int[] liczby;
        liczby = new int[8];
        int[] liczbyInicjalizacja = {2, 3, 4, 7, 8, 12, 9, 10};
        //2.Dostep do 1 elementu
        int pierwszyElement = liczbyInicjalizacja[0];
        //Zmiana elementu
        liczbyInicjalizacja[2] = 22;
        //3 Iteracja tablicy For
//        for (int i=0; i<liczbyInicjalizacja.length; i++){
//            System.out.println(liczbyInicjalizacja[i]);

        //Foreach
        for (int liczba : liczbyInicjalizacja) {
            System.out.println(liczba);
        }
        //Wielowymiarowe tablice
        int [][] tablicaWielowymiarowe = new int [3][3];
        //przykład inicjalizacji takiej tablicy
        int [][] macierz ={{1,2,3},{4,5,6},{7,8,9}};
        //Sortowanie tablicy
        Arrays.sort(liczbyInicjalizacja);
        //Kopiowanie tablicy
        int [] kopiatablicy=Arrays.copyOf(liczbyInicjalizacja,liczbyInicjalizacja.length);
        //wyszukiwanie elementu w tablicy
        int indeks = Arrays.binarySearch(liczbyInicjalizacja,2);
        System.out.println("3 element tablicy liczbyInicjalizacja to "+indeks);

    }
}


// https://app.patika.dev/
// https://app.patika.dev/thendbranch

public class Main {
    public static void main(String[] args) {

        /*
        Ödev :
            Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

        Palindrom Sayı Nedir ?
            Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

            Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
         */

        System.out.println(palindrom(363));

    }

    static boolean palindrom (int number){
        int x = number;
        int son = 0;
        int ilk ;

        while (x != 0){
            ilk = x % 10;
            son = (son * 10) + ilk;
            x = x / 10;
        }
        if (son == number)
            return true;
        else
            return false;
    }
}
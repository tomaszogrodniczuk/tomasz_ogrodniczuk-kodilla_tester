public class SimpleArray {
    public static void main(String[] args) {
        String [] imionaZnajomych = new String [5];

        imionaZnajomych[0] = "Leszek";
        imionaZnajomych[1] = "Marek";
        imionaZnajomych[2] = "Anka";
        imionaZnajomych[3] = "Asia";
        imionaZnajomych[4] = "Michal";

        String imie = imionaZnajomych[3];
        System.out.println(imie);

        int numberOfElements = imionaZnajomych.length;
        System.out.println("Moja tablica zawiera "+numberOfElements+" elementów");
    }
}
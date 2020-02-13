public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("Siamese Dream", "The Smashing Pumpkins", 13, 42.5);
        Album a2 = new Album("Space Cadet", "beabadoobee", 5, 36);
        Album a3 = new Album("Ten", "Pearl Jam", 8, 39.1);

        System.out.println(myLibrary.add(a1));
        System.out.println(myLibrary.add(a2));

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.doubleSize();

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        System.out.println(myLibrary.remove(1));
        System.out.println(myLibrary.add(a3));
        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        int loc = myLibrary.findTitle("Space Cadet");
        int loc2 = myLibrary.findArtist("Pearl Jam");

        System.out.println("Found title at index " + loc);
        System.out.println(myLibrary.getAlbum(loc));
        System.out.println("Found artist at index " + loc2);
        System.out.println(myLibrary.getAlbum(loc2));

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        Album a4 = new Album("The Beautiful Game", "Vulfpeck", 8, 22.6);
        Album a5 = new Album("Absolution", "Muse", 13, 14.7);
        Album a6 = new Album("Fine Line", "Harry Styles", 12, 68.9);
        Album a7 = new Album("How Do You Love?", "The Regrettes", 10, 40.0);
        Album a8 = new Album("Jagged Little Pill", "Alanis Morisette", 16, 78.0);
        Album a9 = new Album("Abbey Road", "The Beatles", 8, 16.8);
        Album a10 = new Album("Woodstock", "Jimi Hendrix", 8, 95.6);

        System.out.println(myLibrary.add(a1));
        System.out.println(myLibrary.add(a2));
        System.out.println(myLibrary.add(a4));
        System.out.println(myLibrary.add(a5));
        System.out.println(myLibrary.add(a6));
        System.out.println(myLibrary.add(a7));
        System.out.println(myLibrary.add(a8));
        System.out.println(myLibrary.add(a9));
        System.out.println(myLibrary.add(a10));

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.sortByTitle();
        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.sortByArtist();
        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        int loc3 = myLibrary.findTitle2("How Do You Love?");

        System.out.println("Found title at " + loc3);
        System.out.println(myLibrary.getAlbum(loc3));

        int loc4 = myLibrary.findArtist2("The Regrettes");

        System.out.println("\nFound artist at " + loc4);
        System.out.println(myLibrary.getAlbum(loc4));
    }
}
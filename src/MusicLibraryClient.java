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
    }
}
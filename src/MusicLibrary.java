public class MusicLibrary {
    private Album[] albums;

    public MusicLibrary(){
        albums = new Album[10];
    }

    public boolean add(Album album){
        for (int i = 0; i < albums.length; i++) {
            if (albums[i] == null) {
                albums[i] = album;
                return true;
            }
        }
        return false;
    }

    public void doubleSize(){
        albums = new Album[20];
        System.out.println("Doubled library size.");
    }

    public boolean remove(int n){
        if (albums[n] != null){
            albums[n] = null;
            return true;
        }
        return false;
    }

    public String toString(){
        String result = "";
        for (Album a : albums){
            if (a != null){
                result += a.toString() + "\n" + "\n";
            }
            else {
                result += "EMPTY" + "\n";
            }
        }
        return result;
    }


}

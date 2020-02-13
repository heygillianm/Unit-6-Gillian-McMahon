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

    public int findTitle(String title){
        for (int i = 0; i < albums.length; i++){
            if (albums[i] != null && albums[i].getTitle().equals(title)){
                return i;
            }
        }
        return -1;
    }

    public int findArtist(String artist){
        for (int i = 0; i < albums.length; i++){
            if (albums[i] != null && albums[i].getTitle().equals(artist)){
                return i;
            }
        }
        return -1;
    }

    public Album getAlbum(int index){
        if(index >= 0 && index < albums.length){
            return albums[index];
        }
        else {
            System.out.println("Index out of bounds");
            return null;
        }
    }

    public void sortByTitle(){
        Album temp;
        int min;
        for (int i = 0; i < albums.length - 1; i++) {
            min = i;
            for(int scan = i + 1; scan < albums.length; scan++){
                if (albums[scan] != null){
                    if(albums[scan].getTitle().compareTo(albums[min].getTitle()) < 0){
                        min = scan;
                    }
                }
            }
            temp = albums[min];
            albums[min] = albums[i];
            albums[i] = temp;
        }
    }

    public void sortByArtist(){
        for (int i = 1; i < albums.length; i++){
            Album key = albums[i];
            int pos = i;

            if (albums[pos] != null){
                while (pos > 0 && albums[pos - 1].getArtist().compareTo(key.getArtist()) > 0){
                    albums[pos] = albums[pos - 1];
                    pos--;
                }
            }
            albums[pos] = key;
        }
    }

    public int findTitle2(String title){
        sortByTitle();
        int low = 0, high = albums.length - 1, middle = (low + high/2);

        while (albums[middle] != null && !albums[middle].getTitle().equals(title) && low <= high){
            if (albums[middle].getTitle().compareTo(title) > 0){
                high = middle - 1;
            }
            else {
                low = middle + 1;
            }
            middle = (low + high/2);
        }
        if (albums[middle] != null && albums[middle].getTitle().equals(title)){
            return middle;
        }
        else {
            return -1;
        }
    }

    public int findArtist2(String artist){
        sortByArtist();
        int low = 0, high = albums.length - 1, middle = (low + high/2);

        while (albums[middle] != null && !albums[middle].getArtist().equals(artist) && low <= high){
            if (albums[middle].getArtist().compareTo(artist) > 0){
                high = middle - 1;
            }
            else {
                low = middle + 1;
            }
            middle = (low + high/2);
        }
        if (albums[middle] != null && albums[middle].getArtist().equals(artist)){
            return middle;
        }
        else {
            return -1;
        }
    }
}

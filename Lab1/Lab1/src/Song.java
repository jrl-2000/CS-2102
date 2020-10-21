import org.junit.*;
import static org.junit.Assert.*;


class Song {
    String title;
    int lenInSeconds;  // duration of the song
    Album onAlbum;

    Song(String title, Integer lenInSeconds, Album onAlbum) {
        this.title = title;
        this.lenInSeconds = lenInSeconds;
        this.onAlbum = onAlbum;

    }

}


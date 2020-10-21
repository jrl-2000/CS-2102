import org.junit.*;
import static org.junit.Assert.*;


class Song {
    public final Object Album;
    String title;
    int lenInSeconds;  // duration of the song

    Song(String title, Integer lenInSeconds, Album onAlbum) {
        this.title = title;
        this.lenInSeconds = lenInSeconds;
        Album = onAlbum;

    }

}


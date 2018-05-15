package zadanie;

import java.util.Arrays;
import java.util.List;

public class MusicPlayer {

    private List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");
    private int currentTrackNumber = 0;

    public void playFirstTrack(){
        System.out.println(tracks.get(0));
    }

    public void playNextTrack() {
        currentTrackNumber++;
        if (currentTrackNumber > 2) {
            currentTrackNumber = 0;
        }
        System.out.println("Gram kolejny utwór: " + tracks.get(currentTrackNumber));
    }

    public void playRandomTrack(){
        System.out.println("random track");
    }
}

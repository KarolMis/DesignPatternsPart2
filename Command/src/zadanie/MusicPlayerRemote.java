package zadanie;

import zadanie.command.MusicPlayerCommand;
import zadanie.command.PlayFirstTrack;

public class MusicPlayerRemote {

    private MusicPlayerCommand musicPlayerCommand;

    public void pressButton() {
        musicPlayerCommand.play();
    }

    public void setMusicPlayerCommand(MusicPlayerCommand musicPlayerCommand) {
        this.musicPlayerCommand = musicPlayerCommand;
    }
}

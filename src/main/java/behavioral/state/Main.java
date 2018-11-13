package behavioral.state;

public class Main {

    public static void main(String[] args) {
        MusicPlayerContext musicPlayerContext = new MusicPlayerContext(new StandByState());
        musicPlayerContext.requestPlay();
        musicPlayerContext.setState(new PlayingState());
        musicPlayerContext.requestPlay();
    }
}
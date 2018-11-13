package behavioral.state;

public class PlayingState implements State {
    @Override
    public void pressPlay(MediaPlayerContextInterface context) {
        System.out.println("Setting state to play");
        context.setState(new StandByState());
    }
}
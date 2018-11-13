package behavioral.state;

public class StandByState implements State {
    @Override
    public void pressPlay(MediaPlayerContextInterface context) {
        System.out.println("Setting state to stand by");
        context.setState(new PlayingState());
    }
}
package behavioral.state;

public class MusicPlayerContext implements MediaPlayerContextInterface {
    private State state;

    public MusicPlayerContext(State state) {
        this.state = state;
    }

    @Override
    public void requestPlay() {
        state.pressPlay(this);
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public State getState() {
        return state;
    }
}
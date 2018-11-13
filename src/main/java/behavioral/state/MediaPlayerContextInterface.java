package behavioral.state;

public interface MediaPlayerContextInterface {
     void requestPlay();
     void setState(State state);
     State getState();
}
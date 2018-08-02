package behavioral.strategy;

public class DataTransfer {
    private Protocol protocol;

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    public void sendStream(){
        if(protocol!=null){
            protocol.transfer();
        }
    }

    public void loadStream(){
        System.out.println("Loading Stream");
    }
}

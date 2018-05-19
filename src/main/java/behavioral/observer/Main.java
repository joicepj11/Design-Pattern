package behavioral.observer;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Stock> linkedList = new LinkedList();
        linkedList.add(new Stock("microsoft",12));
        linkedList.add(new Stock("google",21));
        linkedList.add(new Stock("microsoft",100));
        linkedList.add(new Stock("google",90));
        linkedList.add(new Stock("microsoft",101));
        linkedList.add(new Stock("google",201));
        linkedList.add(new Stock("microsoft",112));
        linkedList.add(new Stock("google",021));

        StockTicker subject = new StockTicker();

        GoogleObserver  googleObserver = new GoogleObserver(subject);
        MicrosoftObserver microsoftObserver = new MicrosoftObserver(subject);

        for (Stock data :linkedList){
            subject.setStock(data);
        }

    }
}

package CricBuzz_ObserverPattern_Pubsub.producers;

import CricBuzz_ObserverPattern_Pubsub.models.Match;
import CricBuzz_ObserverPattern_Pubsub.subscribers.Subscriber;

public interface Producer {

    Match getMatchData();

    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifySubscribers();
}

package CricBuzz.producers;

import CricBuzz.models.Match;
import CricBuzz.subscribers.Subscriber;

public interface Producer {

    Match getMatchData();

    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifySubscribers();
}

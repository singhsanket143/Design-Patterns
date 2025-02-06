package CricBuzz_ObserverPattern_Pubsub.producers;

import CricBuzz_ObserverPattern_Pubsub.models.Match;
import CricBuzz_ObserverPattern_Pubsub.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class BcciProducer implements Producer {

    Match match;
    private List<Subscriber> subscribers;

    public BcciProducer(Match match) {
        this.subscribers = new ArrayList<>();
    }

    public void scoreUpdated(String runs, String over, String ball, String wickets, boolean isFirstInnings) {
        // Some api or som3e mechanism to fetch data
        this.notifySubscribers();
    }

    @Override
    public Match getMatchData() {
        return this.match;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber sub : this.subscribers) {
            sub.update(this);
        }
    }
}

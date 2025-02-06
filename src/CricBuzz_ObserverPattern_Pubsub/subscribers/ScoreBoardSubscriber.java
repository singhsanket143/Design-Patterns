package CricBuzz_ObserverPattern_Pubsub.subscribers;

import CricBuzz_ObserverPattern_Pubsub.models.Innings;
import CricBuzz_ObserverPattern_Pubsub.models.Match;
import CricBuzz_ObserverPattern_Pubsub.producers.Producer;

import java.util.List;

public class ScoreBoardSubscriber implements Subscriber{

    private Match match;
    private List<Producer> producers;
    public ScoreBoardSubscriber(Match match, List<Producer> producers) {
        this.match = match;
        this.producers = producers;
        for (Producer producer : producers) {
            producer.subscribe(this);
        }
    }

    public void update(Producer producer) {
        boolean isFirstInnings = producer.getMatchData().isFirstInnings();
        Innings inningsProducer = isFirstInnings ? producer.getMatchData().getInnings1() : producer.getMatchData().getInnings2();

        Innings inningsSubscriber = isFirstInnings ? match.getInnings1() : match.getInnings2();

        inningsSubscriber.setCurrentScore(inningsProducer.getCurrentScore());
        inningsSubscriber.setCurrentOver(inningsProducer.getCurrentOver());
        inningsSubscriber.setCurrentBall(inningsProducer.getCurrentBall());
        inningsSubscriber.setWickets(inningsProducer.getWickets());
    }
}

package CricBuzz_ObserverPattern_Pubsub.subscribers;

import CricBuzz_ObserverPattern_Pubsub.producers.Producer;

import java.util.ArrayList;
import java.util.List;

public class CommentarySubscriber implements Subscriber {

    private List<String> commentaries;
    private List<Producer> producers;

    public CommentarySubscriber(List<Producer> producers) {
        this.commentaries = new ArrayList<>();
        this.producers = producers;
        for (Producer producer : producers) {
            producer.subscribe(this);
        }
    }

    @Override
    public void update(Producer producer) {
        this.commentaries.add(producer.getMatchData().getCommentary().get(producer.getMatchData().getCommentary().size() - 1));
    }
}

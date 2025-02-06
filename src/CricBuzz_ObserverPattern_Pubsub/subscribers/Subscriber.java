package CricBuzz_ObserverPattern_Pubsub.subscribers;

import CricBuzz_ObserverPattern_Pubsub.producers.Producer;

public interface Subscriber {

    void update(Producer producer);
}

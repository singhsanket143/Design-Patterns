package CricBuzz.subscribers;

import CricBuzz.producers.Producer;

public interface Subscriber {

    void update(Producer producer);
}

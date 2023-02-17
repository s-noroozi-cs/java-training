package com.javacore.sample.v9.reactive;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;

public class Example2 {

    static class OneByOneRequestSubscriber<T> implements Subscriber<T> {
        private Subscription subscription;
        public List<T> consumedElements = new LinkedList<>();

        @Override
        public void onSubscribe(Subscription subscription) {
            //only subscribe one item
            this.subscription = subscription;
            subscription.request(1);
        }

        @Override
        public void onNext(T item) {
            //after process, request another item
            System.out.println("Got : " + item);
            consumedElements.add(item);
            subscription.request(1);
        }

        @Override
        public void onError(Throwable throwable) {
            throwable.printStackTrace();
        }

        @Override
        public void onComplete() {
            System.out.println("Done");
        }
    }

    public static void main(String[] args) {

        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        OneByOneRequestSubscriber<String> subscriber = new OneByOneRequestSubscriber<>();
        publisher.subscribe(subscriber);
        List<String> items = List.of("1", "one", "2", "two", "3", "three");

        items.forEach(publisher::submit);
        publisher.close();
        while (subscriber.consumedElements.size() < items.size());
    }
}

package com.javacore.sample.v9.reactive;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Flow.*;
import java.util.concurrent.SubmissionPublisher;
import java.util.function.Function;

public class Example3 {

    static class IntegerSubscriber implements Subscriber<Integer> {
        private List<Integer> consumedItems = new LinkedList<>();

        @Override
        public void onSubscribe(Subscription subscription) {
            subscription.request(Long.MAX_VALUE);
        }

        @Override
        public void onNext(Integer number) {
            consumedItems.add(number);
            System.out.println(number);
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

    static class TransformProcessor<T, R>
            extends SubmissionPublisher<R>
            implements Processor<T, R> {

        private Function<T, R> function;
        private Subscription subscription;

        public TransformProcessor(Function<T, R> function) {
            super();
            this.function = function;
        }

        @Override
        public void onSubscribe(Subscription subscription) {
            this.subscription = subscription;
            subscription.request(1);
        }


        @Override
        public void onNext(T item) {
            submit(function.apply(item));
            subscription.request(1);
        }

        @Override
        public void onError(Throwable throwable) {
            throwable.printStackTrace();

        }

        @Override
        public void onComplete() {
            close();
        }

    }

    public static void main(String[] args) {
        IntegerSubscriber subscriber = new IntegerSubscriber();
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        TransformProcessor<String, Integer> transformProcessor
                = new TransformProcessor<>(Integer::parseInt);

        List<String> items = List.of("1","2", "3");

        publisher.subscribe(transformProcessor);
        transformProcessor.subscribe(subscriber);
        items.forEach(publisher::submit);
        publisher.close();

        while (subscriber.consumedItems.size() < items.size()) ;
    }
}

package com.javacore.sample.v9.reactive;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Flow.*;

public class Example1 {

    //publisher
    static class IntegerPublisher implements Publisher<Integer> {
        private final List<Integer> numbers;
        public IntegerPublisher(List<Integer> numbers) {
            this.numbers = numbers;
        }
        @Override
        public void subscribe(Subscriber<? super Integer> subscriber) {
            for (Integer number : numbers) {
                subscriber.onNext(number);
            }
            subscriber.onComplete();
        }
    }


    //subscriber
    static class IntegerSubscriber implements Subscriber<Integer> {
        @Override
        public void onSubscribe(Subscription subscription) {
            subscription.request(Long.MAX_VALUE);
        }
        @Override
        public void onNext(Integer number) {
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

    public static void main(String[] args){

        //subscription
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Publisher<Integer> publisher = new IntegerPublisher(numbers);
        Subscriber<Integer> subscriber = new IntegerSubscriber();
        publisher.subscribe(subscriber);
    }
}

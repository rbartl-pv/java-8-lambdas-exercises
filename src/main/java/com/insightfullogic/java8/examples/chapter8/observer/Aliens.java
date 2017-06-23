package com.insightfullogic.java8.examples.chapter8.observer;

// BEGIN Aliens
@SuppressWarnings("javadoc")
public class Aliens implements LandingObserver {

    @Override
    public void observeLanding(String name) {
        if (name.contains("Apollo")) {
            System.out.println("They're distracted, lets invade earth!");
        }
    }

}
// END Aliens

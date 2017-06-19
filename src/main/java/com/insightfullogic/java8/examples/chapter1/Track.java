/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.insightfullogic.java8.examples.chapter1;

/**
 * @author richard
 */
public final class Track {

    private final String name;
    private final int length;

    /**
     * @param name name of the track
     * @param length length of the track
     */
    public Track(String name, int length) {
        this.name = name;
        this.length = length;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the length of the track in milliseconds.
     */
    public int getLength() {
        return length;
    }

    /**
     * @return deep copy of the track
     */
    public Track copy() {
        return new Track(name, length);
    }

}

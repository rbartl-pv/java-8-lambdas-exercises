package com.insightfullogic.java8.examples.chapter9;

import com.insightfullogic.java8.examples.chapter1.Album;

@SuppressWarnings("javadoc")
public interface AlbumLookup {
    Album lookupByName(String albumName);
}

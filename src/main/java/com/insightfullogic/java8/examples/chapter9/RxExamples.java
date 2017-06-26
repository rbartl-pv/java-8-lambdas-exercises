package com.insightfullogic.java8.examples.chapter9;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.insightfullogic.java8.examples.chapter1.Artist;

import rx.Observable;
import rx.Observer;

@SuppressWarnings("javadoc")
public class RxExamples {

  private final List<Artist> savedArtists;
  private final List<String> savedArtistNames;

  public RxExamples(List<Artist> savedArtists) {
    this.savedArtists = savedArtists;
    savedArtistNames = savedArtists.stream()
        .map(Artist::getName)
        .collect(toList());
  }

  // BEGIN search
  public Observable<Artist> search(String searchedName,
      String searchedNationality,
      int maxResults) {

    return getSavedArtists() // <1>
        .filter(name -> name.contains(searchedName)) // <2>
        .flatMap(this::lookupArtist) // <3>
        .filter(artist -> artist.getNationality() // <4>
            .contains(searchedNationality))
        .take(maxResults); // <5>
  }
  // END search

  // ------------------ FAKE LOOKUP CODE ------------------
  // Again, imaginary external web services

  private Observable<String> getSavedArtists() {
    return Observable.from(savedArtistNames);
  }

  private Observable<Artist> lookupArtist(String name) {
    Artist required = savedArtists.stream()
        .filter(artist -> artist.getName().equals(name))
        .findFirst()
        .get();

    return Observable.from(required);
  }

  // Purely for imported code sample
  public void creationCodeSample() {
    Observer<String> observer = new ObserverDummy();

    // BEGIN completing_observable
    observer.onNext("a");
    observer.onNext("b");
    observer.onNext("c");
    observer.onCompleted();
    // END completing_observable

    // BEGIN error_observable
    observer.onError(new Exception());
    // END error_observable

  }

  private class ObserverDummy implements Observer<String> {

    public void onCompleted() {
      System.out.println("ObserverDummy.onCompleted");
    }

    public void onError(Throwable e) {
      System.err.println("ObserverDummy.onError: " + e.getMessage());
    }

    public void onNext(String args) {
      System.out.println("ObserverDummy.onNext. args: " + args);
    }
  }

}

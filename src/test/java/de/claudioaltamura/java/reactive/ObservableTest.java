package de.claudioaltamura.java.reactive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.reactivex.rxjava3.core.Observable;
import org.junit.jupiter.api.Test;

class ObservableTest {

  private String result = "";

  @Test
  void test() {
    Observable<String> observable = Observable.just("Hello");
    observable.subscribe(s -> result = s);
    assertEquals("Hello", result);
  }
}

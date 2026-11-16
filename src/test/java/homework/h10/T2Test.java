package homework.h10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void testFirstCharacter() {
    T2 solution = new T2();

    assertEquals('a', solution.kthCharacter(1));
  }

  @Test
  void testSecondCharacter() {
    T2 solution = new T2();

    assertEquals('b', solution.kthCharacter(2));
  }

  @Test
  void testFourthCharacter() {
    T2 solution = new T2();

    assertEquals('c', solution.kthCharacter(4));
  }

  @Test
  void testEighthCharacter() {
    T2 solution = new T2();

    assertEquals('d', solution.kthCharacter(8));
  }
}

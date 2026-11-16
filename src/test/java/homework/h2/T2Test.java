package homework.h02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void testExample() {
    assertEquals(true, T2.isSameAfterReversals(526));
  }

  @Test
  void testTrailingZeros() {
    assertEquals(false, T2.isSameAfterReversals(1800));
  }

  @Test
  void testZero() {
    assertEquals(true, T2.isSameAfterReversals(0));
  }

  @Test
  void testNumberEndingInZero() {
    assertEquals(false, T2.isSameAfterReversals(10));
  }
}

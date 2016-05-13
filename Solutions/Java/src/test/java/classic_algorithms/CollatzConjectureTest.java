package classic_algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class CollatzConjectureTest {
  @Test
  public void collatzConjecture() throws Exception {

    /**
     * Test known solutions.
     * @see <a href="https://en.wikipedia.org/wiki/Collatz_conjecture#Examples">Collatz Conjecture</a>
     */
    assertEquals(949, CollatzConjecture.collatzConjecture(63728127));
    assertEquals(986, CollatzConjecture.collatzConjecture(670617279));
    assertEquals(1132, CollatzConjecture.collatzConjecture(9780657631L));
  }
}
import org.example.PrimeFactors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsTest {
    @Test
    void compositenums()
    {
        List<Integer> actual = new ArrayList<>(List.of(2,3,5));
        List<Integer> expected=new ArrayList<>(PrimeFactors.primefactors(30));
Assertions.assertEquals(actual,expected);
    }
    @Test
    void primenums()
    {
        List<Integer> actual = new ArrayList<>(List.of(13));
        List<Integer> expected=new ArrayList<>(PrimeFactors.primefactors(13));
        Assertions.assertEquals(actual,expected);
    }
    @Test
    void oneprime()
    {
        List<Integer> actual = new ArrayList<>(List.of(2));
        List<Integer> expected=new ArrayList<>(PrimeFactors.primefactors(8));
        Assertions.assertEquals(actual,expected);
    }
    @Test
    void negativenums()
    {
        List<Integer> actual = new ArrayList<>(List.of(2,3,5));
        List<Integer> expected=new ArrayList<>(PrimeFactors.primefactors(-30));
        Assertions.assertEquals(actual,expected);
    }
    @Test
    void zeroandone()
    {
        List<Integer> actual = new ArrayList<>(List.of());
        List<Integer> expected=new ArrayList<>(PrimeFactors.primefactors(0));
        Assertions.assertEquals(actual,expected);
        List<Integer> expected2=new ArrayList<>(PrimeFactors.primefactors(0));
        Assertions.assertEquals(expected2,actual);
    }
}

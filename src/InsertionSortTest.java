import org.testng.annotations.Test;
import java.lang.reflect.MalformedParametersException;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class InsertionSortTest {
    @Test (expectedExceptions = MalformedParametersException.class)
    public void TestNullArray(){
        InsertionSort.Sort(null);
    }

    @Test
    public void TestEmptyArray(){
        Integer[] toSort = {};
        Integer[] sorted = InsertionSort.Sort(toSort);

        Integer[] expected = new Integer[0];
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void TestArray_LengthOne(){
        Integer[] toSort = { 50 };
        Integer[] sorted = InsertionSort.Sort(toSort);

        Integer[] expected = { 50 };
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void TestArray_LengthTwo_Integer_Sorted() {
        Integer[] toSort = {2, 5};
        Integer[] sorted = InsertionSort.Sort(toSort);
        assertArrayEquals(toSort, sorted);
    }

    @Test
    public void TestArray_LengthTwo_Integer() {
        Integer[] toSort = { 3 , 1};
        Integer[] sorted = InsertionSort.Sort(toSort);

        Integer[] expected = {1, 3};
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void TestArray_LengthTwo_String() {
        String[] toSort = { "b", "a" };
        String[] sorted = InsertionSort.Sort(toSort);

        String[] expected = { "a", "b" };
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void TestArray_Length3_String(){
        String[] toSort = { "b", "a", "A" };
        String[] sorted = InsertionSort.Sort(toSort);

        String[] expected = { "A", "a", "b" };
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void TestArray_Length3(){
        Integer[] toSort = { 60, 10, -30 };
        Integer[] sorted = InsertionSort.Sort(toSort);

        Integer[] expected = { -30, 10, 60 };
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void TestArray_Length4(){
        Double[] toSort = { 3.2, 1.5, 1.3, 1.4 };
        Double[] sorted = InsertionSort.Sort(toSort);

        Double[] expected = { 1.3, 1.4, 1.5, 3.2 };
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void TestArray_Reverse(){
        Integer[] toSort = { 5, 4, 3, 2, 1 };
        Integer[] sorted = InsertionSort.Sort(toSort);

        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void TestArray_Length5(){
        Integer[] toSort = { 4, 3, 5, 1, 2 };
        Integer[] sorted = InsertionSort.Sort(toSort);

        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void TestArray_Long(){
        Integer[] toSort = { 9, 1, 10, 17, 2, 8, 13, 12, 4, 15, 3, 7, 6, 19, 5, 11, 16, 14, 18 };
        Integer[] sorted = InsertionSort.Sort(toSort);

        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
        assertArrayEquals(expected, sorted);
    }
}
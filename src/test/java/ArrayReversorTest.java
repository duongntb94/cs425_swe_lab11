import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

/**
 * @author duong at 7/7/21
 * @project swe_lab11
 */
class ArrayReversorTest {
    private ArrayReversor arrayReversor;
    private ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);

    @BeforeEach
    void setUp() {
        arrayReversor = new ArrayReversor(arrayFlattenerService);
    }

    @AfterEach
    void tearDown() {
        arrayReversor = null;
    }

    @Test
    void testReverseArray1() {
        Integer[][] input = new Integer[][]{{1, 3}, {0}, {4, 5, 9}};
        Integer[] expected = new Integer[]{9, 5, 4, 0, 3, 1};

        when(arrayFlattenerService.flattenArray(input))
                .thenReturn(new Integer[]{1, 3, 0, 4, 5, 9});

        Integer[] actual = arrayReversor.reverseArray(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testReverseArray2() {
        when(arrayFlattenerService.flattenArray(null)).thenReturn(null);
        Integer[] actual = arrayReversor.reverseArray(null);
        Assertions.assertArrayEquals(actual, null);
    }
}
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
    private IArrayFlattenerService service = mock(IArrayFlattenerService.class);

    @BeforeEach
    void setUp() {
        arrayReversor = new ArrayReversor(service);
    }

    @AfterEach
    void tearDown() {
        arrayReversor = null;
    }

    @Test
    void testReverseArray1() {
        Integer[][] array = new Integer[][]{{1, 3}, {0}, {4, 5, 9}};
        Integer[] expectedResult = new Integer[]{9, 5, 4, 0, 3, 1};

        when(service.flattenArray(array))
                .thenReturn(new Integer[]{1, 3, 0, 4, 5, 9});

        Integer[] actualResult = arrayReversor.reverseArray(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testReverseArray2() {
        when(service.flattenArray(null)).thenReturn(null);
        Integer[] actual = arrayReversor.reverseArray(null);
        Assertions.assertArrayEquals(actual, null);
    }
}
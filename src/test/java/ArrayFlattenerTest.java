import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author duong at 7/7/21
 * @project swe_lab11
 */
class ArrayFlattenerTest {
    ArrayFlattener flattener;

    @BeforeEach
    void setUp() {
        flattener = new ArrayFlattener();
    }

    @AfterEach
    void tearDown() {
        flattener = null;
    }

    @Test
    void testFlattenArray1() {
        Integer[][] array1 = {{1, 3}, {0}, {4, 5, 9}};
        Integer[] result1 = flattener.flattenArray(array1);
        Integer[] expectedResult1 = {1, 3, 0, 4, 5, 9};
        Assertions.assertArrayEquals(result1, expectedResult1);
    }

    @Test
    void testFlattenArray2() {
        Integer[] result2 = flattener.flattenArray(null);
        Assertions.assertNull(result2);
    }
}
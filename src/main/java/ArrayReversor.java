import java.util.ArrayList;

/**
 * @author duong at 7/7/21
 * @project swe_lab11
 */
public class ArrayReversor {
    private IArrayFlattenerService service;

    ArrayReversor(IArrayFlattenerService service) {
        this.service = service;
    }

    public Integer[] reverseArray(Integer[][] input) {
        if (input == null) {
            return null;
        }
        Integer[] flatArray = service.flattenArray(input);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = flatArray.length - 1; i >= 0; i--) {
            result.add(flatArray[i]);
        }
        Integer[] reversedArray = new Integer[result.size()];
        reversedArray = result.toArray(reversedArray);
        return reversedArray;
    }
}

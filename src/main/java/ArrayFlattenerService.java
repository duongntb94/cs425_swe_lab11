import java.util.ArrayList;

/**
 * @author duong at 7/7/21
 * @project swe_lab11
 */
public class ArrayFlattenerService {
    public Integer[] flattenArray(Integer[][] twoDimensionArray) {
        if (twoDimensionArray == null) {
            return null;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (var array: twoDimensionArray) {
            if (array != null) {
                for (var item: array) {
                    if (item != null) {
                        result.add(item);
                    }
                }
            }
        }
        Integer[] flatArray = new Integer[result.size()];
        flatArray = result.toArray(flatArray);
        return flatArray;
    }
}

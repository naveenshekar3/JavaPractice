package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenNestedList {

    public static List<Integer> flatten(List<?> nestedList){
        List<Integer> result = new ArrayList<>();
        flattenHelper(nestedList,result);
        return result;
    }

    public static void flattenHelper(List<?> list, List<Integer> result){
        for (Object element: list){
            if (element instanceof Integer){
                result.add((Integer) element);
            }else if (element instanceof List<?>){
                flattenHelper((List<?>) element,result);
            }
        }
    }
    public static void main(String[] args) {
        //        Input: [[1,2],[3,[4,5]],6]
        List<Object> nestedList = Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,Arrays.asList(4,5)),6);
        System.out.println(flatten(nestedList)); // Output: [1, 2, 3, 4, 5, 6]
    }
}

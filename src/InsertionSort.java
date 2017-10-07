import java.lang.reflect.MalformedParametersException;

public class InsertionSort {
    public static <T extends Comparable> T[] Sort(T[] toSort){
        if(toSort == null){
            throw new MalformedParametersException("toSort should not be null");
        }

        if(toSort.length == 0 || toSort.length == 1){
            return toSort;
        }

        for(int i = 1; i < toSort.length; i++){
            for(int j = i-1; j >= 0; j--) {
                T leftValue = toSort[j];
                T rightValue = toSort[j+1];
                if(leftValue.compareTo(rightValue) > 0){
                    toSort[j] = rightValue;
                    toSort[j+1] = leftValue;
                } else {
                    break;
                }
            }
        }

        return toSort;
    }
}

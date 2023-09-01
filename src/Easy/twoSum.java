package Easy;
import java.util.Hashtable;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] solucion = new int[2];
        int aux;
        Hashtable<Integer, Integer> array = new Hashtable<>();


        for(int i = 0; i < nums.length; i++) {
            aux = target - nums[i];
            if(array.containsKey(aux) ){
                solucion[0] = array.get(aux);
                solucion[1] = i;
            }
            array.put(nums[i], i);
        }
        return solucion;

    }

    public static void main(String[] args){

        int[] nums = {2,7,11,15};
        int target = 9;
        int[] solucion = twoSum(nums, target);
        System.out.println(solucion[0] + " " + solucion[1]);


    }
}

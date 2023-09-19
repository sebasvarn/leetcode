package Easy;

import java.util.Hashtable;

public class ContainsDuplicate {
        public boolean containsDuplicate(int[] nums) {
            Hashtable<Integer,Integer> verificar = new Hashtable<>();
            boolean contains = false;
            int random;
            for(int i = 0; i < nums.length; i++){
                if(verificar.containsKey(nums[i])){
                    contains = true;
                    break;
                }
                else {
                    random = (int) (Math.random() * nums.length);
                    verificar.put(nums[i], random);
                }
            }
            return contains;
        }

}

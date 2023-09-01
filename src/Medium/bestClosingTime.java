package Medium;
class BusinessPenalty {

    public static int bestClosingTime(String customers) {
        String Yes = "Y", No = "N";
        int count;
        int[] array = new int[2];
        array[0] = 100000;
        for (int i = 0; i < customers.length() + 1; i++) {
            count=0;
            for (int j = 0; j< customers.length();j++){
                if(i>=j  && customers.charAt(j)==Yes.charAt(0)){count++;} else if (i < j && customers.charAt(j)==No.charAt(0)){count++;}
            }
            System.out.println("contador" + count);
            if(count < array[0]){
                array[0] = count;
                array[1] = i;
            }
        }
        return array[1];
    }

    public static void main(String[] args){
        String customers = "YYNY";
        System.out.println(bestClosingTime(customers));
    }
}

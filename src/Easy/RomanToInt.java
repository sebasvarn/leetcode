package Easy;

/*
ex: "MCMXCIV"

if aux > char at i
suma -= char at i
else
suma += char at i

*/
import java.util.Hashtable;
public class RomanToInt{


    public static int romanToInt(String s){
        Hashtable<Character, Integer> symbols = new Hashtable<Character, Integer>();
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);
        int suma = 0, n = s.length();
        for (int i = 0; i < n;i++){
            if(i + 1 < n && symbols.get(s.charAt(i)) < symbols.get(s.charAt(i + 1))){
                suma += symbols.get(s.charAt(i + 1)) - symbols.get(s.charAt(i));
                i++;
            } else {
                suma += symbols.get(s.charAt(i));
            }
        }
        return suma;

    }

    public static void main(String[] args){
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LV"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("DCXXI"));
    }


}



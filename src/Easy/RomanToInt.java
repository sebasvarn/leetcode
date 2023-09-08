package Easy;

/*
ex: "MCMXCIV"

if aux > char at i
suma -= char at i
else
suma += char at i

*/
import java.util.Hashtable;
import java.util.Objects;

public class RomanToInt {
    public static int romanToInt(String s) {
        Hashtable<Character, Integer> symbols = new Hashtable<Character, Integer>();
        symbols.put('I',1);
        symbols.put('V',5);
        symbols.put('X',10);
        symbols.put('L',50);
        symbols.put('C',100);
        symbols.put('M',1000);
        int suma = 0, i = 1, aux;
        while (i < s.length()){
            aux = symbols.get(s.charAt(i-1));
            if (aux > symbols.get(s.charAt(i))){
                suma -= symbols.get(s.charAt(i));
            }
            else{
                suma += symbols.get(s.charAt(i));
            }
            i++;
        }
        return suma;
    }

    public static void main(String[] args){
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LV"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}



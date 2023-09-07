package Easy;

/*
ex: IIIV
aux =+ value(i)
check if char at i is equals to char at i+1
if true - aux =+ value(i)
else if char at i is less than char at i+1
aux = value(i+1) - aux
else - suma =+ aux and aux = 0
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
        int suma = 0, i = 0,aux = 0;

        while (i < s.length()-1){
            aux =+ symbols.get(s.charAt(i));
            if(Objects.equals(symbols.get(s.charAt(i)), symbols.get(s.charAt(i + 1)))){
                aux =+ symbols.get(s.charAt(i));
            } else if (symbols.get(s.charAt(i)) < symbols.get(s.charAt(i+1))) {
                aux = symbols.get((s.charAt(i+1))) - aux;
            }
            else {
                suma =+aux;
                aux = 0;
            }
            i++;
        }
        return suma;
    }

    public static void main(String[] args){
        System.out.println(romanToInt("IIIV"));
    }
}



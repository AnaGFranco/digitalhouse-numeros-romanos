package numerosromanos.service;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class NumerosRomanosService {

    public String RomanNumerals(int numero) {
        LinkedHashMap<String, Integer> linkRomanoToNumero = new LinkedHashMap<>();
        linkRomanoToNumero.put("M", 1000);
        linkRomanoToNumero.put("CM", 900);
        linkRomanoToNumero.put("D", 500);
        linkRomanoToNumero.put("CD", 400);
        linkRomanoToNumero.put("C", 100);
        linkRomanoToNumero.put("XC", 90);
        linkRomanoToNumero.put("L", 50);
        linkRomanoToNumero.put("XL", 40);
        linkRomanoToNumero.put("X", 10);
        linkRomanoToNumero.put("IX", 9);
        linkRomanoToNumero.put("V", 5);
        linkRomanoToNumero.put("I", 1);

        String res = "";

        for(Map.Entry<String, Integer> entry : linkRomanoToNumero.entrySet()){
            int matches = numero/entry.getValue();
            res += repeat(entry.getKey(), matches);
            numero = numero % entry.getValue();
        }
        return res;
    }

    public static String repeat(String s, int n) {
        if(s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}

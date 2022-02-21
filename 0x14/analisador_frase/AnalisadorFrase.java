import java.util.TreeMap;

public class AnalisadorFrase {
        public static TreeMap<String, Integer> contagemPalavras(String frase) {
            String[] splited = frase.toLowerCase()
                    .replace("!", "").replace("?", "").replace(".", "").split(" ");
            TreeMap<String, Integer> contadorPalavras = new TreeMap<>();

            for (String palavra : splited) {
                int cont = 0;
                if (contadorPalavras.get(palavra) == null){
                    for (String palavraToCompare : splited) {
                        if (palavra.equals(palavraToCompare)){
                            cont ++;
                        }
                    }
                    contadorPalavras.put(palavra, cont);
                }
            }
            return contadorPalavras;
        }

}

import java.text.NumberFormat;
import java.util.Locale;
    
    public class PrintFormatacaoNumeros {
        public static void main(String[] args) {
            float taxa = 0.2456f;
            float valor = 7654.321f;
            NumberFormat locale = NumberFormat.getInstance(new Locale("en", "US"));
            String value = locale.format(valor);
            System.out.printf("Valor: R$ "+ value.substring(0,8) + "\n");
            System.out.printf("Taxa: %.2f%s", taxa, "%" + "\n");
            
        }
    }

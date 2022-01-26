public class NumerosPares {
    public static void main(String[] args) {
       int mod = 0 ;
       int num = 0;
       for(int i = 0; mod < 95; i++) {
           mod = mod + 2;
           num = mod;
           System.out.print(num + "," + " ");
       }
        System.out.println("98");
    }
}

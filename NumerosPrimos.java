public class NumerosPrimos{
    public static void main(String[] args){
       
        for (int i = 2; i <= 100; i++){
            boolean numeroPrimo = true;
            int divisor = 2;
            
            while(divisor <= i/2){   // Por que até i / 2? — Porque nenhum número tem divisores maiores que sua metade, exceto ele mesmo.
                if( i % divisor == 0){
                    numeroPrimo = false;
                    break;
                }
                divisor++;
            }
            if(numeroPrimo){
                System.out.print( i + ", ");
            }
        }
    }
}
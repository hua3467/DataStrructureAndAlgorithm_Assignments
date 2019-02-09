/**
 *
 * @author zhenhuayang
 */
public class Harmonic {
    public static void main(String[] args) {
        System.out.println(harmonic(4));
    }
    
    public static double harmonic(int n){
        if( n == 0){
            return 1;
        } else {
            return (1.0/n) + harmonic(n-1);
        }
        
    }
}

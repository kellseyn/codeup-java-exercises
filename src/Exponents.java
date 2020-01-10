public class Exponents {
    public static double warmup(double base, double expo){
        double bucket = 1;
        for(int i = 1; i <= expo; i++){
            bucket *= base;
        }
        return bucket;
    }

    public static void main(String[] args) {
        System.out.println(warmup(2,4));
    }
}

public class GeneralizedHarmonic
{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double bloop = 0;
        double den;
        for (int i = 1; i <= n; i++) 
        {
            den = Math.pow(i,r);
            bloop = bloop+(1/den);
        }
    System.out.println(bloop);   
    }
}

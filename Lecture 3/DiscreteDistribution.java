public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] sum = new int[args.length];
        sum [0] = 0;
        for (int i = 1; i < args.length; i++)
        {
            sum[i] = Integer.parseInt(args[i]) + sum[i-1];
        }
        for (int i = 0; i < m; i++) {
            int r = (int) (Math.random() * (sum[args.length - 1] - 1));
            int index = 0;
            while (sum[index] <= r) {
                index++;
            }
            System.out.print(index + " ");
        }
    } 

}
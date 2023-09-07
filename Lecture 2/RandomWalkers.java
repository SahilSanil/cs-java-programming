public class RandomWalkers {
    public static void main (String[] args) { 
        int r = Integer.parseInt(args[0]);
        double trials = Double.parseDouble(args[1]);
        int totalsteps = 0;
        for (int i = 1; i <= trials; i++)
        {
            int x = 0;
            int y = 0;
            int steps = 0;
            while (Math.abs(x) + Math.abs(y) < r)
            {
                double p = Math.random();
                if (p>0.75) {
                    x+=1; }
                else if (p>0.5) {
                    x-=1; }
                else if (p>0.25) {
                    y+=1; }
                else {
                    y-=1; }
                steps++;
            }
            totalsteps += steps;
        }
    double avgsteps = (totalsteps/trials);
    System.out.println("average number of steps = " + avgsteps);
    }
}
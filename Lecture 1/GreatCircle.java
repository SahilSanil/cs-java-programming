public class GreatCircle {
    public static void main(String[] args)
    {
        double x01 = Double.parseDouble(args[0]);
        double y01 = Double.parseDouble(args[1]);
        double x02 = Double.parseDouble(args[2]);
        double y02 = Double.parseDouble(args[3]);
        double r = 6371.0;
        double x1 = Math.toRadians(x01);
        double y1 = Math.toRadians(y01);
        double x2 = Math.toRadians(x02);
        double y2 = Math.toRadians(y02);
        
        double p1 = ((x2-x1)/2);
        double sinsqrx = (Math.sin(p1)*Math.sin(p1));
        double p2 = ((y2-y1)/2);
        double cosx1x2sinsqry = ((Math.cos(x1)*Math.cos(x2))*(Math.sin(p2)*Math.sin(p2)));
        double exp = Math.sqrt(sinsqrx + cosx1x2sinsqry);
        double distance = (2*r)*(Math.asin(exp));
        
        System.out.println(distance);
    }
}
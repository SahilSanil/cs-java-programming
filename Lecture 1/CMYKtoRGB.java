public class CMYKtoRGB {
    public static void main(String[] args)
    {
        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);
        double w = (1-k);
        double dred = Math.round(255*w*(1-c));
        double dgreen = Math.round(255*w*(1-m));
        double dblue = Math.round(255*w*(1-y));
        int red = (int)dred;
        int green = (int)dgreen;
        int blue = (int)dblue;
        
        System.out.println("red   = " + red);
        System.out.println("green = " + green);
        System.out.println("blue  = " + blue);
    }
    
}
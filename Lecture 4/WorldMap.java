public class WorldMap {
    public static void main(String[] args) {
        int b = StdIn.readInt();
        int h = StdIn.readInt();

        StdDraw.setCanvasSize(b, h);

        StdDraw.setXscale(0, b);
        StdDraw.setYscale(0, h);

        StdDraw.enableDoubleBuffering();

        while (!StdIn.isEmpty()) {
            StdIn.readString();
            int vert = StdIn.readInt();
            double[] x = new double[vert];
            double[] y = new double[vert];
            for (int i = 0; i < vert; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }
            StdDraw.polygon(x, y);
        }
        StdDraw.show();
    }
}

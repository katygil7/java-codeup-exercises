public class HelloWorld {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Hello World");
        System.out.print(" from Venus\n");

        double myFavoriteNumber = 3.14;
        double myString = 3.14159;
        System.out.println(myFavoriteNumber + " " + myString);
        float myNumber = 123;

        System.out.println(myNumber);

        int x = 5;
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);
//    public class class{
//            String theNumberThree = "three";
//            Object o = theNumberThree;
//            int three = (int) o;
        int xx = 4;
//      x = x + 5;
        xx += 5;
        System.out.println("xx" + " " + xx);
        int xy = 3;
        int yx = 4;
//      y = y * x;
        xy *= yx;
        System.out.println("xy is" + " " + xy);
        int xyy = 10;
        int yxx = 2;
//      xyy = xyy / yxx;
//      yxx = yxx - xyy;
        xyy /= yxx;
        yxx -= xyy;
        System.out.println("xyy is" + " " + xyy + " " + "and yxx is" + " " + yxx);

    }
}
package LineComparision;
import java.util.Scanner;
public class LineCompare {
    public LineCompare() {
        System.out.println("Welcome to Line Comparison Computation Program");
    }
    public static void main(String[] args) {
        LineCompare l = new LineCompare();
        Scanner scan = new Scanner(System.in);
        String s1 = "Line 1";
        String s2 = "Line 2";
        Double l1 = setLines(scan,s1);
        System.out.println();
        Double l2 = setLines(scan,s2);
        System.out.println();
        checkEquality(l1,l2);
        System.out.println();
        comparingLines(l1,l2);

    }
    public static double setLines(Scanner scan, String s) {
        System.out.println("Enter "+s+" End Points:-");
        //Declare the variable.
        System.out.print("Enter First Co-ordinates(x1,y1): \n");
        double x1= scan.nextDouble();
        double y1= scan.nextDouble();
        System.out.printf("First Co-ordinates (x1= %g , y1= %g)%n",x1,y1);
        System.out.print("Enter Second Co-ordinates(x2,y2): \n");
        double x2= scan.nextDouble();
        double y2= scan.nextDouble();
        System.out.printf("Second Co-ordinates (x2= %g , y2= %g)%n",x2,y2);
        double length = getLength(x1,x2,y1,y2,s);
        return length;
    }
    public static double getLength(double x1, double x2, double y1, double y2, String s) {
        double a = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        double length = (double)Math.sqrt(a);
        System.out.println();
        System.out.println("Length of "+s+" is : "+length);
        return length;
    }
    public static void checkEquality(Double l1, Double l2) {
        boolean equal = l1.equals(l2);
        System.out.println("Equality of two lines using Java equals method is : "+equal);
    }
    public static void comparingLines(Double l1, Double l2) {
        int comp = l1.compareTo(l2);
        System.out.println("Comparing two lines using Java compareTo method is: "+comp);
        if (comp > 0)
            System.out.println("Line-1 is greater than Line-2");
        else if (comp == 0)
            System.out.println("Line-1 is equal to Line-2");
        else
            System.out.println("Line-1 is smaller than Line-2");
    }
}

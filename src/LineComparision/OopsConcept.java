package LineComparision;

import java.util.Scanner;

public class OopsConcept {
    public OopsConcept() {
        System.out.println("Welcome to Line Comparison Program");
    }
    Scanner scan = new Scanner(System.in);
    String s1 = "Line 1";
    String s2 = "Line 2";
    public static void main(String[] args)
    {
        OopsConcept line = new OopsConcept();
        //
        Double length1 = getLine(line.scan,line.s1);
        Double length2 = getLine(line.scan,line.s2);
        checkEquality(length1,length2);
        System.out.println();
        comparingLines(length1,length2);
    }
    public static double getLine(Scanner scan, String s) {
        System.out.println("Enter "+s+" End Points:-");
        LineComparision.Line l = new Line(scan);
        System.out.println();
        System.out.println("Length for "+s+" is : "+l.calculateLength());
        System.out.println();
        return l.calculateLength();
    }
    public static void checkEquality(Double l1, Double l2) {
        boolean equal = l1.equals(l2);
        System.out.println("Equality of two lines using Java equals method is : "+equal);
    }
    public static void comparingLines(Double l1, Double l2) {
        int comp = l1.compareTo(l2);
        System.out.println("Comparing two lines using Java compareTo method is: "+comp);
        System.out.println();
        if (comp > 0)
            System.out.println("Line-1 is greater than Line-2");
        else if (comp == 0)
            System.out.println("Line-1 is equal to Line-2");
        else
            System.out.println("Line-1 is smaller than Line-2");
    }

}
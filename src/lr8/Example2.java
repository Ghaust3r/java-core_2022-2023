package lr8;

import java.io.*;
import java.util.*;


public class Example2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File ("C:\\Primer\\MyFile1.txt"));
        sc=new Scanner (sc.nextLine()).useDelimiter(" ");
        List<Double> dlist=new ArrayList<>();
        sc.forEachRemaining(x->listPositiveDouble(dlist,Double.parseDouble(x)));
        int indexMax=dlist.indexOf(Collections.max(dlist));
        FileWriter outFile = new FileWriter("C:\\Primer\\MyFile2.txt",true);
        for (int i=0;i<dlist.size();i++){

            if (i != indexMax) outFile.write (dlist.get(i)+ " ");
        }
        outFile.write(String.valueOf(dlist.get(indexMax)));
        outFile.close();

    }

    static void listPositiveDouble(List<Double> list, double val) {
        if (val > 0.0) list.add(val);
    }
}




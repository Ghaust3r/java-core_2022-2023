package lr4;

public class Example1 {
    public static void main(String[] args) {
        int figure=10,i,j,z;
        for (i=0;i<figure;i++){
            System.out.print("номер строки" +i+ "");
            z=0;
            for(j=-5;j<figure;j++){
                System.out.print("+");
                z=z+1;
            }
            System.out.println("Число символов в строке "+z);
        }
    }
}

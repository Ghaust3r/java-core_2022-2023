package lr6;


import org.jetbrains.annotations.NotNull;

public class Example1 {

    static class Example6_1{
        private static String text;
        private static char symbol;

        public Example6_1(char s){
            symbol=s;
        }

        public Example6_1 (String t){
            text=t;
        }
public Example6_1(char @NotNull [] ch){
            if (ch.length==1){
               symbol=ch[0];
            }
            else{
                text="";
                for (int i=0;ch.length>i;i++){
                    text=text+ch[i];
                }
            }
}
 public char return_ch() {
return symbol;

}
 public String return_txt(){
return text;
}
    }
    public static void main(String[] args) {
        char[] txt={'а','б'};
        char[] sym={'а'};
        Example6_1 test1=new Example6_1(sym);
        System.out.println("Символьное значение " +test1.return_ch());

        Example6_1 test2=new Example6_1(txt);
        System.out.println("Текстовое значение " +test2.return_txt());


    }
}

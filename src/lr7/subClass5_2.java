package lr7;

public class subClass5_2 extends superCLass5 {
    private  char ch;

    subClass5_2 (String strEx,char chEx){
        super(strEx);
        this.ch=chEx;
    }

    public void setChar (String str,char ch){
        super.setStr(str);
        this.ch=ch;
    }
    public char getChar(){
        return ch;
    }
    @Override
    public String console (){
        String superStr;
        superStr= "Class: "+this.getClass().getSimpleName() +  "\n" +
                "char= " +ch+ "\n" +
                getStr()+ this.getChar();
        return superStr;
    }
}

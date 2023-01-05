package lr7;
public class subClass5_1 extends superCLass5{
    private int num;

    subClass5_1 (String strEx, int numEx){
        super(strEx);
        this.num=numEx;
    }

    public void setNum (String str,int num){
        super.setStr(str);
        this.num=num;
    }
    public int getInt(){
        return num;
    }
    @Override
    public String console (){
        String superStr;
        superStr= "Class: "+this.getClass().getSimpleName() +  "\n" +
                "int= " +num+ "\n" +
                 super.getStr() +" "+ this.getInt() ;
        return superStr;
    }

}

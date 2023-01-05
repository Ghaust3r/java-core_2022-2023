package lr7;

public class superCLass5 {
    private String str;

    superCLass5(String strEx){
        this.str=strEx;
    }
    superCLass5 (){
    }

    public void setStr(String str){
       this.str=str;
    }
    public String getStr (){
        return str;
    }


public String console (){
        String superStr;
    superStr= "Class: "  +this.getClass().getSimpleName() + "\n" +
            " str = " + this.getStr();
    return superStr;
}
}

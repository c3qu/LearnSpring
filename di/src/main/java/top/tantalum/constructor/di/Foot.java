package top.tantalum.constructor.di;

public class Foot {
    
    private int quantity;
    
    Foot(int quantity){
        this.quantity=quantity;
    }   

    public String toString(){
        return "hava "+quantity+" foots";
    }
}

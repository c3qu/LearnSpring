package top.tantalum.constructor.di;

public class Dog {
    private String name;
    Foot foot;
    Dog(String name,Foot foot){
        this.name=name;
        this.foot=foot;
    }
    public String toString(){
        return "My name is "+name+"."+foot;
    }
}

package com.raja;

public class Demo {
    int num;
    float name;
    @Override
    public String toString() {
        return super.toString();}
    
    public Demo(int num,float name) {
        this.num=num;
        this.name=name;
    }
  public Demo(){
    super();

  }  
    
@Override
public int hashCode() {
    return super.hashCode();
}
@Override
public boolean equals(Object obj) {
   return this.num== ((Demo)obj).num ;
    // Add your comparison logic here
}
@Override
protected Object clone() throws CloneNotSupportedException {
    return super.clone();
    // Add your cloning logic here
}

public static void main(String[] args) {
    Demo demo = new Demo(34, 56.5f);
   Demo demo2 = new Demo(34, 78.5f);
   if(demo==demo2){
       System.out.println("Demo1 is less than Demo2");
   }
   if(demo.equals(demo2)){
       System.out.println("Demo1 is equal to Demo2");
    // Demo demo2 = demo;
    //System.out.println(demo.hashCode());
    //System.out.println(demo2.hashCode());
    System.out.println(demo.getClass().getName());
}}}

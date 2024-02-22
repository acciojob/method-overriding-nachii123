package com.driver;



public class Main {
public static  class A{

  public String meth(){
    // System.out.println("Invoking method from class A");
    return "Invoking method from class A";
  }
  
}
public static class B extends A{
  @Override
  public String meth(){
    // System.out.print("Method is overridden in Extendend class B");
    return "Method is overridden in Extendend class B";
  }
  
}

  public static void main(String args[]){
    B b = new B();
    b.meth();
  }
  
  
}

package com.svlugovoy.youtube300plus.q35_q_q39;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 30.03.2016.
 */
public class GetSetDemo {
    private String name;
    public GetSetDemo() {
    }
    public GetSetDemo(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private void privPrint(){
        System.out.println("privPrint...");
    }
    protected void protPrint(){
        System.out.println("protPrint...");
    }
    static void statPrint(){
        System.out.println("statPrint...");
    }
}
class SubCl extends GetSetDemo{
    public static void main(String[] args) {
        SubCl child = new SubCl();
//        child.privPrint();
        child.protPrint();
        statPrint();
        GetSetDemo parent = new GetSetDemo("Name");
//        System.out.println(parent.name);
        System.out.println(parent.getName());
        parent.setName("New Name");
        System.out.println(parent.getName());
    }
}
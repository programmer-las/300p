package com.svlugovoy.youtube300plus.q330;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 29.02.2016.
 */
public class ShadowTest {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }

        void doSmth() {
            int x = 10;
            class MemberLocal{
                MemberLocal(){
                    System.out.println(x);
                }
            }
        }
    }


    public static void main(String... args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);

    }
}
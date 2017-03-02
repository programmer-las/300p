package com.svlugovoy.youtube300plus.q91;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 08.03.2016.
 */
public class FinalizeDemo {
    public static void main(String[] args) {

        User user1 = new User(1);
        user1 = null;

        User user2 = new User(2);
        Object user3 = user2;
//        Object user3 = new User(3);
        user2 = user1;
        System.gc();

    }
}

class User{
    private int id;

    public User(int id) {
        this.id = id;
    }

    protected void finalize() throws Throwable {
        try {
            // do smth
            System.out.println("Объект будет удален, его id = " + id);
        } finally {
            super.finalize();
        }
    }
}
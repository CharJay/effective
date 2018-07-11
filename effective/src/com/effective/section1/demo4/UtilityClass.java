package com.effective.section1.demo4;

public class UtilityClass {
    // Suppress default constructor for noninstantiability
    private UtilityClass() {
        throw new AssertionError();
    }

    public static UtilityClass getInstance(){
        return new UtilityClass ();
    }
}

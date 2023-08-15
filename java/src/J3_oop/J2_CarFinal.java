package J3_oop;

public final class J2_CarFinal {

    // FINAL PROPERTIES REFERENCE CAN'T BE CHANGED AFTER FIRST ASSIGN
    // OBJECT TYPE REFERENCE CAN'T BE CHANGED, BUT REFERENCED OBJECT PROPERTY VALUES CAN BE MODIFIED (!)
    // VALUE SHOULD BE SET IN CLASS BODY OR CONSTRUCTOR - OTHERWISE COMPILATION ERROR
    final String name;

    public J2_CarFinal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

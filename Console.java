import static java.lang.System.out;

interface Console

{

//------------------------------------------------------------------------------
// Prints a new line to the console
//------------------------------------------------------------------------------
default void print() {
    out.println();
}

//------------------------------------------------------------------------------
// Prints to the console
//------------------------------------------------------------------------------
default void print(Object... messages) {
    for (Object o : messages)
        out.print(o);
    out.println();
}

}
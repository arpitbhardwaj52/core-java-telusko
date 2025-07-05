public class StringBuilderAndStringBuffer {
    public static void main(String args[]){
        /*
         * A sequence of characters that can be modified, which means we can change the content of the StringBuffer without creating a new object every time. It represents a mutable sequence of characters.
         * StringBuffer is thread safe.
         */
        StringBuffer sb = new StringBuffer(); // The initial capacity is 16 and it gets changed according to the manipulation in the object of StringBuffer.
        sb.append("Arpit");
        System.err.println(sb.capacity());

    }
}

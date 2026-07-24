public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hellow");
        sb.append(" World");

        sb.insert(5," Beautiful");

        sb.replace(5, 15, " Gorgius");

        sb.delete(5, 14);

        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.charAt(6));

    }
}
//reverse
//how rwverce work on backend
//substring
//ensurecapacity
//train tosize
//sate car at

// //1)many string modification are required
// //2)thread set operations are needed
// //3)bulding SQL queries
// //4)creating large log(where,when and how it is created) message

// buffer is use to buiding dinamic html
//ensure capacity

// //# Builder 


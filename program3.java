public class program3 {
    int id;
    static int count = 0;
    program3(int i){
        count++;
        System.out.println("object created with id : "+i);
    }
    public static void main(String[] args) {
        program3 ob1 = new program3(90011);
        program3 ob2 = new program3(90012);
        program3 ob3 = new program3(90013);
        program3 ob4 = new program3(90014);

        System.out.println("Total objects Created "+count);
    }
}

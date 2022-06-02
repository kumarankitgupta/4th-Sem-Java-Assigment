public class program3 {
    int id;
    static int count = 0;
    program3(int i){
        count++;
        System.out.println("object created with id : "+i);
    }
    void idestroy(program3 ob){
        System.out.println("object id "+ob.id);
        
    }
    protected void finalize(){
        System.out.println("object destroyed with id ");
    }
    public static void main(String[] args) {
        program3 ob1 = new program3(90011);
        program3 ob2 = new program3(90012);
        program3 ob3 = new program3(90013);
        program3 ob4 = new program3(90014);
        ob1.idestroy(ob2);
        System.out.println("Total objects Created "+count);
    }
}

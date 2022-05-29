/**
 * program2
 */
public class program2 {
    int val1,val2;
    program2(int a , int b){    //parametrized constructor with this keyword
        this.val1 = a;
        this.val2 = b;
    }
    void display(){
        System.out.println("value 1 = "+val1);
        System.out.println("value 2 = "+val2);
    }
    public static void main(String[] args) {
        program2 ob = new program2(32, 45);
        ob.display();
    }
}
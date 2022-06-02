/**
 * program2
 */
public class program2 {
    int val1,val2;
    program2(){
        this.val1 =0;
        this.val2=0;
    }
    program2(int a , int b){    //parametrized constructor with this keyword
        this.val1 = a;
        this.val2 = b;
    }
    void display(){
        System.out.println("value 1 = "+val1);
        System.out.println("value 2 = "+val2);
    }
    public static void main(String[] args) {
        program2 ob1 = new program2();
        program2 ob2 = new program2(32, 45);
        ob1.display();
        ob2.display();

    }
}
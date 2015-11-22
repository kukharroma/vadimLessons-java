package T05_11_15.Generic;

/**
 * Created by roma on 05.11.15.
 */
public class ExampleGeneric<E> {
    E ob;

    public ExampleGeneric() {
    }

    public ExampleGeneric(E ob) {
        this.ob = ob;
    }

    public void setOb(E ob) {
        this.ob = ob;
    }

    E getOb(){
        return ob;
    }
    void showType(){
        System.out.println("Типом Т є " + ob.getClass());
    }
}

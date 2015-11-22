package T05_11_15.Generic;

import java.util.List;

/**
 * Created by roma on 05.11.15.
 */
public class WorkOut<E> {

    E ob;

    public void setOb(List<? extends E> ob) {

    }

    public E getOb() {
        return ob;
    }
}

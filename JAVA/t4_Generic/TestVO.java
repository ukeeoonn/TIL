package _03_28.t4_Generic;

public class TestVO<T> {

    //public class TestVO<T>      TestVO<T>  //T 타입의 첫글자
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}

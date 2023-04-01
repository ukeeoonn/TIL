package _03_28.t2_Generic;

public class T1_GenericRun2 {
    public static void main(String[] args) {

    T1_GenericVO2 vo = new T1_GenericVO2();

    vo.setObject(1);
    System.out.println("su1 : "+vo.getObject());

    vo.setObject(3.14);
    System.out.println("su2 : "+vo.getObject());

    vo.setObject("안녕");
    System.out.println("su3 : "+vo.getObject());

    }
}

package _03_28.t2_Generic;

public class T1_GenericRun {
    public static void main(String[] args) {


    T1_GenericVO vo = new T1_GenericVO();

    vo.setSu1(3);
    System.out.println("su1 : "+vo.getSu1());

    vo.setSu2(3.14);
    System.out.println("su2 : "+vo.getSu2());

    vo.setStr1("안녕");
    System.out.println("su2 : "+vo.getSu2());

    }
}

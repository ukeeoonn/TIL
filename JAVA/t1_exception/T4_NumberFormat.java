package _03_28.t1_exception;

public class T4_NumberFormat {
    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "Green100";

        System.out.println("data1+200="+(data1+200));

        int intData1 = Integer.parseInt(data1);
        System.out.println("intData1+200"+(intData1+200));

    }
}

package _03_28.t1_exception;

public class T3_Array {

    /*
    *  바운다리 입셉션 -> 배열에서 나옴
    * */
    public static void main(String[] args) {
        //String[] strArr = new String[5];
        try{
            args[0] = "atom";
            String data1 = args[0];
            String data2 = args[1];
            String data3 = args[2];

            System.out.println("data1="+args[0]);
            System.out.println("data1="+data1);
            System.out.println("data1="+data2);
            System.out.println("data1="+data3);
            System.out.println("data1="+data1);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }



        /*
        * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0at T1_exception.T3_Array.main(T3_Array.java:10)
        * Index 0 -> 여기 문재가 있다는 이야기
        *
        * */




    }
}

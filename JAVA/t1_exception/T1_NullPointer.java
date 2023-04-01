package _03_28.t1_exception;

/*
    예외처리 시작
    1. NullPoint Ex
 */
public class T1_NullPointer {
    public static void main(String[] args) {
        String data = "atom";

        //String data = new String(); // String 객체는 예외
        System.out.println("1.data="+data); //atom

        String data2 = "100";
        int data3 = 200;
        System.out.println("2.data2=" +data2); //100
        System.out.println("3.data2=" +data3); //200
        System.out.println("4.data2 + 100=" +(data2+100)); // 100100
        //System.out.println("5.data3 + 200=" +((String)data3+100)); //
        System.out.println("6." +((String)data2));

        System.out.println();

        int data4= Integer.parseInt(data2) + data3;  // data2가 문자라서 연산 안됨

        System.out.println("6.data4:"+data4);

        String data5 = null;
        //String data5 = " ";

        System.out.println("7.:"+data5);
        System.out.println("8.:"+(String)data5);

        try {
                System.out.println("---------------");
                System.out.println("9."+data5.toString()); //toStrong-> 문자로 변경해라
                System.out.println("=================");
                System.out.println("10. 통과");
        }catch (NullPointerException e) { // NullPointerException일때만
            System.out.println("오류발생 "+ e.getMessage());
            //e.printStackTrace();
        }

    }
}

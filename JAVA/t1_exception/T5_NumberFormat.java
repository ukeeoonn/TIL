package _03_28.t1_exception;

public class T5_NumberFormat {
    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "Green100";

        System.out.println("data1+200="+(data1+200));

        int intData1 = Integer.parseInt(data1);
        System.out.println("intData1+200"+(intData1+200));


        try{
            int intData2 = Integer.parseInt(data2);
            System.out.println("intData2+200"+(intData2+200));
        }catch (NumberFormatException e){
            //e.printStackTrace();
            System.out.println("오류"+e.getMessage());
        }

        // Data2 쪽 여기서는 에러 안나지만 콘솔에서 에러 남

        /*
        int intData2 = Integer.parseInt(data2);
        System.out.println("intData2+200"+(intData2+200));
        */

    }
}

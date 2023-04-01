package _03_28.t1_exception;

public class T8_MultiException {
    public static void main(String[] args) {

        try{

            String data1 = args[0];
            String data2 = args[1];
            String data3 = args[2];

            System.out.println("data1 =" +data1);
            System.out.println("data2 =" +data2);
            System.out.println("data3 =" +data3);

            int res = Integer.parseInt(data1)  + Integer.parseInt(data2);
            System.out.println("res "+res);

            int res2 = Integer.parseInt(data1)  + Integer.parseInt(data3);
            System.out.println("res2 "+res2);


        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("오류 : " + e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("오류:"+e.getMessage());
        }catch (Exception e){ //최후 모든에러 처리 가능 마지막에
            e.printStackTrace();
        }finally {
            System.out.println("데이터 작업 완료");
        }
    }
}

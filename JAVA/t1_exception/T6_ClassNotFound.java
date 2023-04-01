package _03_28.t1_exception;

public class T6_ClassNotFound {
    public static void main(String[] args) {

        try{
        //Class.forName("java.lang.String");                   //forName() 외부의 파일명을 찾
        Class.forName("java.lang.String22");   //java.lang.String22 이런 건 없다.
            System.out.println("java.lang.String 클래스가 있습니다.");
        }catch (ClassNotFoundException e){
            System.out.println("java.lang.String 클래스가 없습니다.");
            e.printStackTrace();
        }finally {
            System.out.println("클래스 작업 완료!");
        }
        System.out.println("작업끝");
    }
}

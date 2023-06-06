public class Task1{

    public static void main(String[] args) {
        //вернет ошибку  - деление на 0

        System.out.println(divides(10, 1));
        System.out.println(getFileSize("c/name.doc"));
    }
    public static int divides(int a1, int a2){

        return a1/a2;
    }
//Вернет ошибку, если файл не существует
    public static long getFileSize(String file){

        return file.length();
    }
}

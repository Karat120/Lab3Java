import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args)throws FileNotFoundException {
        System.out.println("Конструктор с параметрами: "+"\n");
        MachineBench test=new MachineBench(true,"железо","квадрат",23,54);
    System.out.println("Вызван метод info(вывод из файла)"+"\n");
        test.info();
        System.out.println("Вызван метод getStatusBench: "+"\n");
        test.getStatusBench();

        test.launch();
        System.out.println("Создание объекта с введением параметров: \n" );
        MachineBench test2=new MachineBench(true);
        test2.getStatusBench();
    }
}
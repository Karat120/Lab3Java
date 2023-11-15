import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class MachineBench {
   private boolean start;
   private String stuff;
   private String form;
   private double mLength;
   private double mWidth;
    Engine engine=new Engine();
    ControlSystem systemmanag =new ControlSystem();
   public MachineBench(){
       this.start=false;
       this.mLength=0;
       this.mWidth=0;
   }
   public MachineBench(boolean start, String stuff, String form, double length, double width){
       this.start=start;
       this.stuff=stuff;
       this.form=form;
       this.mLength=length;
       this.mWidth=width;
       engine=new Engine(50,90);
       systemmanag =new ControlSystem("scan", true);
   }
   public MachineBench(boolean start) {
       this.start = start;
       if (!this.start) {
           MachineBench b = new MachineBench(false, " ", " ", 0, 0);
       } else {
           Scanner variable = new Scanner(System.in);
           System.out.println("Введите материал:\n ");
           this.stuff = variable.nextLine();
           System.out.println("Введите форму заготовки:\n");
           this.form = variable.nextLine();
           System.out.println("Введите размеры заготовки \n Длину :");
           this.mLength = variable.nextDouble();
           System.out.println("\nВведите Ширину: ");
           this.mWidth = variable.nextDouble();
       }
   }
public void setStart(boolean start){
     this.start=start;
}
public void setStuff(String stuff){
        this.stuff=stuff;
}
public void setForm(String form){
       this.form=form;
}
public void setmLength(double length){
       this.mLength=length;
}
public void setmWidth(double width){
       this.mWidth=width;
}
public void getStuff(){
       System.out.println(this.start);
}
public void getStart(){
       System.out.println("Состояние станка: "+this.start+"\n");
}

public void getStatusBench () {
    System.out.println("Состояние станка: " + this.start+"\n");
    System.out.println("Загруженный материал: " + this.stuff +"\n");
    System.out.println("Выбранная форма: " + this.form+ "\n");
    System.out.println("Параметры заданные Длина: " + this.mLength + "\tШирина: " + this.mWidth +"\n");
}

public   double square(){
    double square;
    square = mLength * mWidth;
    return square;
    }
public void launch(){
    if (this.start) {
        if ( systemmanag.getAmperes() == 220) {
            for (int i = 0; i <= 100; i++)
            {
                System.out.print("\033[H\033[J");
                System.out.println(i);
            }
        }
        else {
            System.out.println("Ошибка напряжения");
        }
        System.out.println("Успешно"+"\nФорма: "+ form + "\tготова"+"\n");
    }
}
public void info() throws FileNotFoundException {
       String separator= File.separator;
       String path=separator+"Users"+separator+"Karat"+separator+"Desktop"+separator+"lab3"+separator+"Java"+separator+"src"+separator+"info.txt";
File info=new File(path);
Scanner scanner=new Scanner(info);
while(scanner.hasNextLine()){
    System.out.println(scanner.nextLine());
}
scanner.close();
}
}

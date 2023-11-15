import java.util.Scanner;
class MachineBench {
   private boolean start;
   private String stuff;
   private String form;
   private double mLength;
   private double mWidth;

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
public void getStatusBench () {
    System.out.println("Состояние станка: " + this.start+"\n");
    System.out.println("Загруженный материал: " + this.stuff +"\n");
    System.out.println("Выбранная форма: " + this.form+ "\n");
    System.out.println("Параметры заданные Длина: " + this.mLength + "\tШирина: " + this.mWidth +"\n");
}

}

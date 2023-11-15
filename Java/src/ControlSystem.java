public class ControlSystem {
    private String mode;
    private boolean sadMode;
    class LaserScanner{
        private double mSquare;
        private boolean mDefect;
        public LaserScanner(){
            this.mSquare = 0;
            this.mDefect = false;
        }
        public LaserScanner(double square, boolean defect) {
            this.mSquare = square;
            this.mDefect = defect;
        }
    }
    class SensorTemperature {
        private double mTemperature;
        private double mAmperes;

        public SensorTemperature() {
            this.mAmperes = 0;
            this.mTemperature = 0;
        }

        public SensorTemperature(double temperature, double amperes) {

            this.mTemperature = temperature;
            this.mAmperes = amperes;
        }
        public double getTemperature(){
            return this.mTemperature;
        }
        public double getAmperes(){
            return  this.mAmperes;
        }
    }
    LaserScanner laserScan=new LaserScanner();
    SensorTemperature sensorTempe=new SensorTemperature();
   public ControlSystem()
    {
       this.sadMode = false;
        sensorTempe=new SensorTemperature(80,220);
        laserScan= new LaserScanner(0, false);
    }
    public ControlSystem(String mode, boolean sadMod)
    {
        this.mode = mode;
        this.sadMode = sadMod;
        if (this.sadMode)
        {
            laserScan= new LaserScanner();
        }
    }

    public void setMode(String mode){
        this.mode = mode;
    }
    public void setSadMod(boolean sadmod){
        this.sadMode = sadmod;
    }
    public void getSadMod(){
        if (this.sadMode) {
            System.out.println("Сканер включен\n");
        }
        else {
            System.out.println("Сканер выключен\n");
        }
    }


    public double getTempe(){
        return sensorTempe.getTemperature();
    }
    public double getAmper(){
        return sensorTempe.getAmperes();
    }
}


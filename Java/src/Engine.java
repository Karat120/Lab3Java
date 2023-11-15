
class Engine{
    private int mPetrol;
    private double mPower;

    public Engine()
    {
        mPetrol = 0;
        mPower = 0;
    }
    Engine(int petrol, double power)
    {
        this.mPetrol = petrol;
        this.mPower = power;
    }

    public void SetPetrol(int petrol){
        this.mPetrol = petrol;
    }
    public void SetPower(double power){
        this.mPower = power;
    }
    public void GetPetrol(){
        System.out.println("Количество топлива: " + mPetrol+"\n");
    }
    public void GetPower(){
        System.out.println("Установленная мощность двигателя: " + mPower +"\n");
    }
    public void Print(){
        System.out.println("Количество топлива: " + mPetrol+"\n");
        System.out.println("Установленная мощность двигателя: " + mPower +"\n");
    }
}

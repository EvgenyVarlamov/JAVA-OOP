package geekbrains;

public class TeeBottle extends Product{
   private double volume;

   public TeeBottle(String name, double cost, double volume){
        super(name,cost);
        this.volume=volume;
    }

    @Override
    public String toString() {
        return "TeeBottle{" +
                "volume=" + volume +
                '}';
    }
}

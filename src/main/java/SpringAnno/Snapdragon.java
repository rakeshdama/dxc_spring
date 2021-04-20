package SpringAnno;

public class Snapdragon implements MobileProcessor{

    @Override
    public void processor() {
        System.out.println("World's best CPU");
    }
}

package ly.generalassemb.drewmahrt.oofundamentals;

/**
 * Created by joey on 7/13/16.
 */
public class Pikachu extends Mammal {
    private boolean mIsAwesome;

    public Pikachu(boolean isAwesome){
        super(4, 50, false, "Pikachu");
        mIsAwesome = isAwesome;
    }

    public boolean isAwesome() {
        return mIsAwesome;
    }

    public void setIsAwesome(boolean mIsAwesome) {
        this.mIsAwesome = mIsAwesome;
    }

    @Override
    public String makeNoise() {
        return "Pika pika!";
    }

    @Override
    public String toString() {
        return "Pikachu" + (mIsAwesome? " (Awesome)" : "");
    }
}

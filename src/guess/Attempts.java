package guess;

public class Attempts {
    private final VerboseDiff diff;
    private final int max;

    public Attempts(VerboseDiff diff, int max) {
        this.diff = diff;
        this.max = max;
    }

    boolean matches(){
        int t = 0;
        while(t <= this.max && this.diff.number() != 0){
            ++t;
        }
        return t <= this.max;
    }
}

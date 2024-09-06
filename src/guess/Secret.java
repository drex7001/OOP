package guess;

public class Secret {
    private final int num;

    Secret() {
        this((int) (Math.random() * 100));
    }

    Secret(int n) {
        this.num = n;
    }

    // guess.Secret(){
    //   this.num = (int)(Math.random() * 100);
    // }

    int number() {
        return this.num;
    }

    // int getRandom(){
    //   return this.num;
    // }
}

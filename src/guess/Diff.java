package guess;

public class Diff {

    private final Secret secret;
    private final Guess guess;

    Diff(Secret n, Guess x){
        this.secret = n;
        this.guess = x;
    }

    int number(){
        return this.guess.number() - this.secret.number();
    }

    // int diff = new guess.Diff(
    //   new guess.Secret(),new guess.Guess()
    //   ).number();

}
package guess;

public class Farewell {
    private final Attempts attempts;
    private final Secret secret;

    public Farewell(Attempts attempts, Secret secret) {
        this.attempts = attempts;
        this.secret = secret;
    }

    void say(){
        if(!this.attempts.matches()){
            System.out.println("You lost it was: " + this.secret.number());
        }
        System.out.println("Thanks for playing with me!");
    }
}

package guess;

public class Main {
    public static void main(String[] args) {
        // guess.Secret secret = new guess.Secret();
        // System.out.println(secret.getRandom());

        // int n = new guess.Secret().number();
        // System.out.println(n);
//        System.out.printf("The difference is: %d", );
        //save for later
        Secret secret = new Secret();
        System.out.println(secret.number());
        new Farewell(new Attempts(new VerboseDiff(new Diff(secret, new Guess())), 10), secret ).say();
    }
}

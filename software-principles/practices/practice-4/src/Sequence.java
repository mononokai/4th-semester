public class Sequence {
    public String split() {
        System.out.println("Enter your number:");

        String num = System.console().readLine();
        String broken = "";

        for (char i : num.toCharArray()) {
            broken += i;
            broken += " ";
        }

        return broken;
    }
}

public class StateDemo {
    public static void main(String[] args) {
        StateContext context = new StateContext();

        context.writeName("John");
        context.writeName("Jane");
        context.writeName("Jerry");
        context.writeName("Angela");
        context.writeName("Hellen");
        context.writeName("Terence");
        context.writeName("Paul");
    }
}
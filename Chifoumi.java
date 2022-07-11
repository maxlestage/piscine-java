public class Chifoumi {

    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {

        switch (chifoumiAction) {
            case ROCK: {
                return ChifoumiAction.SCISSOR;
            }
            case SCISSOR: {
                return ChifoumiAction.PAPER;
            }
            case PAPER: {
                return ChifoumiAction.ROCK;
            }
            default:
                return ChifoumiAction.NONE;
        }
    }
}

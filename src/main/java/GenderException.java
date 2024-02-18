public class GenderException extends RuntimeException{
    public GenderException() {
        super("Неправильный формат пола (ожидается f или m)");
    }
}

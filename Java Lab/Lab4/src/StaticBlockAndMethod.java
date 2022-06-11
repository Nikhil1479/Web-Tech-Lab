public class StaticBlockAndMethod {
    public static void main(String[] args) {
        static_block e1 = new static_block();
        e1.showName();
        static_block.changeName();

        static_block e2 = new static_block();
        static_block e3 = new static_block();

        e2.showName();
        e3.showName();
    }
}
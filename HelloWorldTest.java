public class HelloWorldTest {
    public static void main(String[] args) {
        String result = HelloWorld.greet();
        if (!"Hello, Travis CI!".equals(result)) {
            System.out.println("Test failed: Expected 'Hello, Travis CI!' but got " + result);
            System.exit(1);  // fail build
        }
        System.out.println("Test passed!");
    }
}
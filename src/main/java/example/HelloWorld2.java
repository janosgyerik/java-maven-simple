package example;

// TODO I'm a real boy
public class HelloWorld2 {
  HelloWorld2() {}

  public static void main(String[] args) {
    System.out.println("Hello!");
    hello(null);
  }

  private void hello(String name) {
      System.out.println(name.length());
  }
}

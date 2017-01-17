package example;

// TODO I'm a real boy
public class HelloWorld2 {
  HelloWorld2() {}

  public static void main(String[] args) {
    System.out.println("Hello!");
    hello(null);
  }

  private void hello(String name) {
      if (name == null) {
          System.out.println(name.length());
      } else if (name != null) {
          System.out.println("all good");
      }
  }

  private void switchMe() {
      char c = 'a';
      switch (c) {
          case 'a':
              break;
          case 'a':
              break;
      }
  }

  // TODO this is really such a mess...
}

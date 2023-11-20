package it.gb.generic;

public abstract class Client {

  public static void executeGeneric() {

    // Init factory
    FlyweightFactory flyweightFactory = new FlyweightFactory();

    // Create some context elements
    Context context1 = new Context("-Header-", "-Footer-",
        "A1", "B1", flyweightFactory);
    Context context2 = new Context("-Header-", "-Footer-",
        "A2", "B2", flyweightFactory);
    Context context3 = new Context("-Header-", "-Footer-",
        "A3", "B3", flyweightFactory);
    Context context4 = new Context("-Header X-", "-Footer X-",
        "A4", "B4", flyweightFactory);
    Context context5 = new Context("-Header-", "-Footer-",
        "A5", "B5", flyweightFactory);
    Context context6 = new Context("-Header X-", "-Footer X-",
        "A6", "B6", flyweightFactory);
    Context context7 = new Context("-Header X-", "-Footer X-",
        "A7", "B7", flyweightFactory);
    Context context8 = new Context("-Header-", "-Footer-",
        "A8", "B8", flyweightFactory);
    Context context9 = new Context("-Header X-", "-Footer X-",
        "A9", "B9", flyweightFactory);

    // Print obj contents... 
    // Check headers and footers hashes
    System.out.println(context1.printAllContents());
    System.out.println(context2.printAllContents());
    System.out.println(context3.printAllContents());
    System.out.println(context4.printAllContents());
    System.out.println(context5.printAllContents());
    System.out.println(context6.printAllContents());
    System.out.println(context7.printAllContents());
    System.out.println(context8.printAllContents());
    System.out.println(context9.printAllContents());

  }

}

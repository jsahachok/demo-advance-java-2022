package demo;

public class HelloWorld {
    public String hi(String name){
        return "Hello " + name;
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.hi("Sahachok");
        System.out.println(result);
    }
}

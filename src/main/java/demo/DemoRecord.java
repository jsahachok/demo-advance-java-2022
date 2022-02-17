package demo;

public class DemoRecord
{
    public static void main(String[] args){
        Data data = new Data(1,"Sahachok");
    }
}

record Data (int id, String name){
}
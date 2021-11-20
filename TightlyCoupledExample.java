class Ssubjects{
    Science1 s  = new Science1();

    public void startReading(){

        s.read();
    }

}
class Science1{
    public void read(){
        System.out.println("Reading Science...");
    }
}

public class TightlyCoupledExample{
    public static void main(String[] args) {
     
        Ssubjects s = new Ssubjects();
        s.startReading();
    }
}
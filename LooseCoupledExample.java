interface Topic{
    public void read();
}

class Science implements Topic{
    public void read(){
        System.out.println("Reading Science...");
    }
}
class Subjects{
    Topic s  = new Science();

    public void startReading(){

        s.read();
    }

}

public class LooseCoupledExample{
    public static void main(String[] args) {
     
        Subjects s = new Subjects();
        s.startReading();
    }
}
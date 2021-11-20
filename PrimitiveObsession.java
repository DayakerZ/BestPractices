import java.util.HashMap;
import java.util.Map;

public class PrimitiveObsession{
    public static void main(String[] args) {
        
       /* Map<String,Integer> details = new HashMap<String,Integer>();
        details.put("Hyderabad",70000000);
        details.put("delhi",90000000);
        details.put("pune",8000000);*/
        //Above code uses primitive types which limits extensiblity
        City c = new City();
        c.setNameAndCatagory("Hyderabad","Big City");
        Population p = new Population();
        p.setPopulationOfAdultsChildren(300000000, 500000000);
        Map<City,Population> details = new HashMap<City,Population>();
        details.put(c,p);
        System.out.println(details);

    }
}
class City{
    private String name;
    private String catagory;

    public void setNameAndCatagory(String name,String catagory){
        this.name = name;
        this.catagory = catagory;
    }
    public String getCityCatagory(){
        return catagory;
    }
    
    public String getCityName(){
        return catagory;
    }
    public String toString(){
        return "[name : "+name+" catagory : "+catagory+"]";
    }
}
class Population{
    private int adults;
    private int children;

    public void setPopulationOfAdultsChildren(int adults,int children){
        this.adults = adults;
        this.children = children;
    }
    public int getPopulationOfAdults(){
        return adults;
    }
    
    public int  getPopulationOfChildren(){
        return children;
    }
    public String toString(){
        return "[adults : "+adults+" children : "+children+"]";
    }
}
class Frog {
    private String name;
    private int age;
    
    private String color;
    
     
    public void setName(String name) {
        this.name = name;
    }
     
    public void setAge(int age) {
        this.age = age;
    }
     
    
    public void setColor(String color) {
        this.color = color;
    }
     
    public String getName() {
        return name;
    }
     
    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
     
    public void setInfo(String name, int age, String color) {
        setName(name);
        setAge(age);
        setColor(color);
    }
    
    public String makesound()
    {
    	return "ima zvuk";
    }
}
 
public class App {
 
    public static void main(String[] args) {
     
        Frog frog1 = new Frog();
         
        frog1.setName("Zabac");
        frog1.setAge(1);
         
        System.out.println(frog1.getName());
        
        
        Frog frog2 = new Frog();
        
        frog2.setName("Zabac2");
        frog2.setAge(2);
        frog2.setColor("green");
        System.out.println(frog2.getName());
        frog2.makesound();
        System.out.println(frog2.getName() + " "+ frog2.makesound());
    }
 
}

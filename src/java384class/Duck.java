package java384class;

public class Duck extends Animal{

    public String beakColor;

    public Duck(int age, String gender) {
        super(age, gender);
        beakColor = "yellow";
    }

    public void swim(){
        System.out.println("Swimming Duck");
    }

    public void quack(){
        System.out.println("Quacking Duck");
    }

    @Override
    public void mate(){
        System.out.println("Duck is looking for mate");
    }

}

public class SuperHero extends Hero{

    private String superPower;
    private String lair;




    public SuperHero(String firstName) {
        super(firstName);
    }

    @Override
    public void codeJava() {
        System.out.println("Coding like a SUPER hero ;)");
    }

    public SuperHero(String firstName, String superPower, String lair) {
        super(firstName);
        this.superPower = superPower;
        this.lair = lair;
    }


    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public String getLair() {
        return lair;
    }

    public void setLair(String lair) {
        this.lair = lair;
    }
}

public class Hero extends Person{



    private String origin;

    public Hero(String firstName) {
        super(firstName);
    }

    public void beHeroic(){
        System.out.println("YEIH");
    }

    @Override
    public void codeJava() {
        System.out.println("Coding like an Hero");
    }
}

public class AnotherMain {
    public static void main(String[] args) {


        Person salvatore = new Person();
        salvatore.firstName = "Salvatore";
        salvatore.surname = "Corsaro"; // CTRL + D - to duplicate a line
        salvatore.age = 35;
        salvatore.favoriteColor = "Green";

        Person beau = new Person();
        beau.firstName = "Beau";
        beau.surname = ""; // CTRL + D - to duplicate a line
        beau.age = 42;
        beau.favoriteColor = "Blue";

        System.out.println( salvatore.firstName + " favorite color is " + salvatore.favoriteColor);
        System.out.println( beau.firstName + " favorite color is " + beau.favoriteColor);


        beau.walk();
        salvatore.codeJava();





//        var mba = new Laptop();
//        mba.model = "Mac Book Air";
//        mba.brand = "APPLE";


        var xps = new Laptop("XPS 13", "DELL");


        String xpsModel = xps.getModel();
        System.out.println(xpsModel);
        System.out.println(xps.getModel());

        xps.setModel("Xps9590");



        var logger = new Logger();

        logger.log("JAVA is FUN!");

        var musk = new Hero("Elon");


        var myFavoriteSuperHero = new SuperHero("Doctor Strange",
                "Control Time", "Metaverse");


        System.out.println(myFavoriteSuperHero.getSuperPower());

        System.out.println(salvatore);

        Object theBigFather;

        Person misterX = myFavoriteSuperHero;

        if (misterX instanceof Hero) {
            ((Hero) misterX).beHeroic();
            misterX.codeJava();
        }
        if (misterX instanceof SuperHero) {
            System.out.println(((SuperHero) misterX).getLair());
            misterX.codeJava();
        }

        misterX.codeJava();




    }
}


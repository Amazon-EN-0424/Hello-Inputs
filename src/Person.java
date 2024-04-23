public class Person {

    String firstName;
    String surname;
    int age;
    String favoriteColor;

    public Person() {

    }

    public Person(String firstName) {
        this.firstName = firstName;
    }


    public void walk(){
        System.out.println("Walking...");
    }

    public void codeJava(){
        System.out.println("Im writing sout.. ;)");
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", favoriteColor='" + favoriteColor + '\'' +
                '}';
    }


//    @Override
//    public String toString(){
//        return this.firstName + this.surname;
//    }

}

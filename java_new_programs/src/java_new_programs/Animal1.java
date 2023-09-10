package java_new_programs;



abstract class Animal1 {
    public void bark() {
        getDog();
        getCat();
    }

    abstract void getDog();
    abstract void getCat();
}

class Dog extends Animal1 {
    @Override
    void getDog() {
        System.out.println("Dog barks");
    }

    @Override
    void getCat() {
        // Dog doesn't make cat sounds
    }
}

class Cat extends Animal1 {
    @Override
    void getDog() {
        // Cat doesn't make dog sounds
    }

    @Override
    void getCat() {
        System.out.println("Cat meows");
    }
}
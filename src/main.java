package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal[]= new Animal[6];

        animal[0]=new Mammal("Little silver",2,3,"Bat");
        animal[1]=new Dog("Tom",3,16,"Carnivora","German Shepard");
        animal[2]=new Fish("CatFish",2,1,"Yellow");
        animal[3]=new BlowFish("Kevin",2,5,"Purple",10);
        animal[4]=new Bird("Falcon",4,10,"Brown");
        animal[5]=new Pigeon("Smith",3,4,"Grey","Argentina");

      /*  animal[2].getVoiceShuma56633();
        animal[4].getVoiceShuma56633();
*/


        AnimalBehavior animalBehavior[] = new AnimalBehavior[3];
        animalBehavior[0]= new Dog("Tim",3,14,"Carnivor","Bulldog");
        animalBehavior[1]= new Pigeon("Kevin",5,1,"pink","America");
        animalBehavior[2]= new BlowFish("BlowFish",4,1,"yellow",18);


        animalBehavior[0].sleep();
        animalBehavior[1].sleep();
        animalBehavior[2].sleep();


        for (Animal b: animal){
            b.moveShuma56633();
        }

        for (Animal b: animal) {
            AnimalName.name(b.getNameShuma56633());
        }

    }
}
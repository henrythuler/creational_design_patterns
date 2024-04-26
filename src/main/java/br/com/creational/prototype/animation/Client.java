package br.com.creational.prototype.animation;

import br.com.creational.prototype.animation.model.Person;
import br.com.creational.prototype.animation.model.PersonSamples;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static List<Person> frames = new ArrayList<Person>();

    public static void animate() throws InterruptedException {
        System.out.println("*********************************");
        System.out.println("* ");
        System.out.println("* Adjust your screen's height!");
        System.out.println("* ");
        System.out.print("*********************************");
        Thread.sleep(3000);
        for (Person frame : frames) {
            frame.draw();
            Thread.sleep(500);
        }
        System.out.println("**********************");
        System.out.println("* ");
        System.out.println("* The End!");
        System.out.println("* ");
        System.out.print("**********************");
    }

    public static Person leftWalk(Person p) {
        Person pAnimation = (Person) p.clone();
        pAnimation.left();
        frames.add(pAnimation);
        //Returning the current animation state
        return pAnimation;
    }

    public static Person rightWalk(Person p) {
        Person pAnimation = (Person) p.clone();
        pAnimation.right();
        frames.add(pAnimation);
        //Returning the current animation state
        return pAnimation;
    }

    public static void main(String[] args) throws InterruptedException {
        PersonSamples characters = new PersonSamples();
        Person animationPerson = characters.get("fatMan");
        frames.add(animationPerson);
        animationPerson = leftWalk(animationPerson);
        animationPerson = leftWalk(animationPerson);
        animationPerson = leftWalk(animationPerson);
        animationPerson = leftWalk(animationPerson);
        animationPerson = rightWalk(animationPerson);
        animationPerson = rightWalk(animationPerson);
        animationPerson = rightWalk(animationPerson);
        animationPerson = rightWalk(animationPerson);
        animationPerson = rightWalk(animationPerson);
        animationPerson = rightWalk(animationPerson);
        animationPerson = rightWalk(animationPerson);
        rightWalk(animationPerson);
        animate();
    }
}

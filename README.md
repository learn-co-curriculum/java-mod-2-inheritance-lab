# Inheritance Lab

## Learning Goals

- Create class hierarchy using inheritance

## Instructions

In this lab, we are going to create another hierarchy using inheritance! We
will create a sport hierarchy where `Sport` will be the parent class and
`Football` and `Baseball` will be the child classes:

![Sport Inheritance](https://curriculum-content.s3.amazonaws.com/java-mod-2/inheritance-lab/Sport-Inheritance.png)

When creating these classes, follow these rules:

- Every sport should have teammates.
- Every sport can be played.
- A football team should have 45 teammates.
- A baseball team should have 26 teammates.
- There are 4 quarters in football.
- If we are up to bat in baseball, we should change a variable to say so
  and print "Hey batter, batter, swing!"
- If we are not up to bat in baseball, we should change a variable to say so
  and print "Out in the field!"
- If a touchdown is scored in football, print to the console "Yay! Touchdown!"
- If a home run is hit in baseball, print to the console "Yay! Home run!"
- If we play football, we should say we are playing football.
- If we play baseball, we should say we are playing baseball.

Each of the classes have been created for us in the `com.flatiron.sport`
package. It is your job to write the classes correctly based on the given rules
and use the `SportDriver` class to run and test your code.

The `SportDriver` class has the following code:

```java
package com.flatiron.sport;

public class SportDriver {

  public static void main(String[] args) {
    Sport mySport = new Sport();
    Football footballTeam = new Football();
    Baseball baseballTeam = new Baseball();

    System.out.println("mySport has " + mySport.getTeammates() + "  teammates.");
    mySport.play();

    footballTeam.play();
    System.out.println("The footballTeam has " + footballTeam.getTeammates() + " teammates.");
    System.out.println("There are " + footballTeam.getQuarters + "  quarters in football.");
    footballTeam.touchdown();

    baseballTeam.play();
    System.out.println("The baseballTeam has " + baseballTeam.getTeammates() + " teammates.");
    baseballTeam.upToBat();
    baseballTeam.homeRun();
    baseballTeam.outToField();
  }
}
```

Running this driver class will give you the following output:

```plaintext
mySport has 0 teammates.
I'm playing a sport!
I'm playing football!
The footballTeam has 45 teammates.
There are 4 quarters in football.
Yay! Touchdown!
I'm playing baseball!
The baseballTeam has 26 teammates.
Hey batter, batter, swing!
Yay! Home run!
Out in the field!
```

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc_battlegame;


public class Battle {
  public Battle(Creature a, Creature b) {
    Terrain terrain = pickTerrain();
    System.out.println("Terrain: " + terrain.string);
    a.calculateHealth(terrain);
    b.calculateHealth(terrain);
    while (a.health > 0 && b.health > 0) {
      double chooseStarter = Math.random();
      if (chooseStarter < 0.5) {
        System.out.println(a.name + " attacks first!");
        b.health -= a.calculateAttack();
        if (b.health > 0) {
            System.out.println(b.name + " now attacks!");
            a.health -= b.calculateAttack();
        }
        else {
            continue;
        }
      }
      else {
        System.out.println(b.name + " attacks first!");
        a.health -= b.calculateAttack();
        if (a.health > 0) {
            System.out.println(a.name + " now attacks!");
            b.health -= a.calculateAttack();
        }
        else {
            continue;
        }
      }
      System.out.println(a.name + " health:" + a.health);
      System.out.println(b.name + " health:" + b.health);
    }
    System.out.println(winner(a,b));
  }

  Terrain pickTerrain() {
    double random = Math.random();
    if (random < 0.333) {
      return new Terrain("Water");
    }
    else if (random < 0.666) {
      return new Terrain("Air");
    }
    else {
      return new Terrain("Land");
    }
  }
  
  String winner(Creature a, Creature b) {
      if (b.health < 0) {
          return (a.name + " is the winner");
      }
      else {
          return (b.name + " is the winner");
      }
  }
}

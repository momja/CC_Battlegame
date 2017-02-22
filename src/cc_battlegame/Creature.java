/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc_battlegame;

public class Creature {
  String name;
  String gender;
  double weight; // in pounds
  String habitat;
  int attack;
  int defense;
  double health;
  public Creature() {

  }

  double calculateMultiplier(Terrain terrain) {
    double multiplier;
    if (habitat == terrain.string) {
      multiplier = 1.2;
      System.out.println(name + " is benefitted by the terrain!");
    }
    else if (habitat == terrain.weakestIn) {
      multiplier = 0.8;
      System.out.println(name + " is hindered by the terrain!");
    }
    else {
      multiplier = 1.0;
    }

    return multiplier;
  }

  void calculateHealth(Terrain terrain) {
    double multiplier = calculateMultiplier(terrain);
    health = (health + defense*multiplier)*5;
  }

  double calculateAttack() {
    double random = Math.random()*10;
    return random+(attack/4);
  }
}

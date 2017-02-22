/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc_battlegame;

class Terrain {
  String string;
  String weakestIn;

  public Terrain(String terrain) {
    string = terrain;
    if (string == "air") {
      weakestIn = "water";
    }
    else if (string == "water") {
      weakestIn = "air";
    }
    else {
      weakestIn = "water";
    }
  }
}

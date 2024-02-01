package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();
    //nakresliPrasatko();
    nakresliSlunicko();
  }
    void nakresliPrasatko() {
      // kreslim telo
      for (int i = 0; i < 5; i++) {
        zofka.move(15);
      }
      zofka.turnRight(90);

      for (int i = 0; i < 7; i++) {
        zofka.move(20);
      }
      zofka.turnRight(90);

      for (int i = 0; i < 5; i++) {
        zofka.move(15);
      }
      zofka.turnRight(90);

      for (int i = 0; i < 7; i++) {
        zofka.move(20);
      }
      //kreslim hlavu
      zofka.turnRight(45);

      for (int i = 0; i < 6; i++) {
        zofka.move(8.9);
      }

      zofka.turnRight(90);

      for (int i = 0; i < 6; i++) {
        zofka.move(8.9);
      }
      //kreslim nohy ve predu

      zofka.turnRight(135);
      zofka.penUp();
      zofka.move(73);
      zofka.turnRight(30);
      zofka.penDown();
      for (int i = 0; i < 3; i++) {
        zofka.move(10);
      }
      zofka.penUp();
      zofka.turnRight(180);
      for (int i = 0; i < 3; i++) {
        zofka.move(10);
      }
      zofka.turnRight(120);
      zofka.penDown();
      for (int i = 0; i < 3; i++) {
        zofka.move(10);
      }
      zofka.penUp();
      zofka.turnRight(180);
      for (int i = 0; i < 3; i++) {
        zofka.move(10);
      }
      zofka.turnRight(121);
      zofka.move(140);

      // kreslim zadni nohy
      zofka.penDown();
      zofka.turnRight(50);

      for (int i = 0; i < 3; i++) {
        zofka.move(10);
      }
      zofka.penUp();
      zofka.turnRight(180);
      for (int i = 0; i < 3; i++) {
        zofka.move(10);
      }
      zofka.turnLeft(120);
      zofka.penDown();
      for (int i = 0; i < 3; i++) {
        zofka.move(10);
      }
      zofka.penUp();
      zofka.turnRight(180);
      for (int i = 0; i < 3; i++) {
        zofka.move(10);
      }

      //Ocas
      zofka.turnLeft(19);
      zofka.move(75);
      zofka.turnRight(45);
      zofka.penDown();
      for (int i = 0; i < 3; i++) {
        zofka.move(10);
      }
    }

    void nakresliSlunicko() {

    zofka.penUp();
    zofka.move(230);
    zofka.turnLeft(90);
    zofka.move(380);
    zofka.penDown();

      for (int i = 0; i < 18; i++) {
      zofka.move(14);
      zofka.turnLeft(20);
      zofka.turnRight(90);
      zofka.move(20);
      zofka.turnRight(180);
      zofka.move(20);
      zofka.turnRight(90);
    }

    }
  }



package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(300);
    zofka.turnLeft(90);
    zofka.move(100);
    zofka.turnLeft(90);
    zofka.penDown();

    nakresliDomecky();

    zofka.penUp();
    zofka.turnRight(120);
    zofka.move(420);
    zofka.turnRight(105);

    nakresliPrasatko();

    zofka.penUp();
    zofka.turnLeft(45);
    zofka.move(320);
    zofka.turnLeft(90);
    zofka.move(650);

    nakresliSlunicko();
  }


    void nakresliSlunicko() {

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

    void nakresliDomecky() {


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

      zofka.turnLeft(140);
      zofka.penUp();
      zofka.move(220);
      zofka.turnLeft(90);
      zofka.move(53);
      zofka.turnRight(90);
      zofka.penDown();
      zofka.turnRight(95);
      //druhy domecek
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

      //treti domecek
      zofka.penUp();
      zofka.turnLeft(45);
      zofka.move(110);
      zofka.penDown();

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

      //4 domecek
      zofka.penUp();
      zofka.turnLeft(45);
      zofka.move(110);
      zofka.penDown();

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

      //5 domecek
      zofka.penUp();
      zofka.turnLeft(45);
      zofka.move(110);
      zofka.penDown();

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

      //6 domecek
      zofka.penUp();
      zofka.turnLeft(45);
      zofka.move(110);
      zofka.penDown();

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

      // posledni domecek

      zofka.penUp();
      zofka.turnRight(45);
      zofka.move(220);
      zofka.turnLeft(90);

      zofka.turnLeft(180);
      zofka.move(70);
      zofka.turnLeft(180);
      zofka.penDown();

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
    }

  void nakresliPrasatko() {
    zofka.penDown();
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
  }



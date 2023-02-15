package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        //nakresli prasatko
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliObdelnik();
        zofka.turnLeft(45);
        nakresliHlavu();
        zofka.turnRight(135);
        zofka.move(100);
        nakresliNozicky();
        zofka.turnRight(135);
        zofka.move(140);
        zofka.turnRight(90);
        nakresliNozicky();
        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnRight(45);
        zofka.move(30);

        //nakresli 8uhelnik
        zofka.penUp();
        zofka.turnLeft(135);
        zofka.move(800);
        zofka.turnRight(135);
        zofka.penDown();
        nakresliOsmiUhelnik();

        //vychozi bod pro kruh
        zofka.turnRight(45);
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnRight(90);
        zofka.penDown();

        //nakresli kruh
        nakresliKruh();

        //vychozi bod pro slunce
        zofka.turnLeft(15);
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();

        //nakresli slunicko
        nakresliSlunce();
    }

    private void nakresliNozicky() {
        zofka.turnRight(45);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
    }

    private void nakresliHlavu() {
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
    }

    private void nakresliObdelnik() {
        for (int i = 0; i < 2; i++) {
            zofka.move(100);
            zofka.turnRight(90);
            zofka.move(140);
            zofka.turnRight(90);
        }
    }

    private void nakresliOsmiUhelnik() {
        for (int i = 0; i < 8; i++) {
            zofka.move(40);
            zofka.turnRight(45);

        }
    }

    private void nakresliKruh() {
        for (int i = 0; i < 75; i++) {
            zofka.move(5);
            zofka.turnRight(5);

        }
    }

    private void nakresliSlunce() {
        for (int i = 0; i < 12; i++) {
            zofka.move(5);
            zofka.turnLeft(90);
            zofka.move(30);
            zofka.turnRight(180);
            zofka.move(30);
            zofka.turnLeft(90);
            zofka.turnRight(5);
            for (int d = 0; d < 5; d++) {
                zofka.move(5);
                zofka.turnRight(5);
            }


        }
    }
    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}

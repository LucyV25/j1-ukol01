package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

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
    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}

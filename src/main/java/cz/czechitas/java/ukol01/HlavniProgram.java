package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

//        //nakresli prasatko
//        nakresliPrasatko();
//
//        //nakresli 8uhelnik
//        zofka.penUp();
//        zofka.turnLeft(135);
//        zofka.move(800);
//        zofka.turnRight(135);
//        zofka.penDown();
//        nakresliOsmiUhelnik();
//
//        //vychozi bod pro kruh
//        zofka.turnRight(45);
//        zofka.penUp();
//        zofka.move(200);
//        zofka.turnLeft(90);
//        zofka.move(40);
//        zofka.turnRight(90);
//        zofka.penDown();
//
//        //nakresli kruh
//        nakresliKruh();
//
//        //vychozi bod pro slunce
//        zofka.turnLeft(15);
//        zofka.penUp();
//        zofka.move(200);
//        zofka.penDown();

        //vychozi bod pro finalni obrazek-slunce
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(400);
        zofka.turnRight(90);
        zofka.move(220);
        zofka.penDown();
        //nakresli slunicko
        nakresliSlunce();

        //nakresli domecky
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(230);
        zofka.turnLeft(180);
        zofka.penDown();
        for (int i = 0; i < 5; i++) {
            nakresliDomek();
            posunSeNaDalsiDomek();
        }
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliDomek();
        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(700);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliDomek();

        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnRight(180);
        zofka.penDown();

        //nakresli prase
        zofka.penUp();
        nakresliPrasatko();

        //vychozi bod psani jmena
        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(330);
        zofka.turnLeft(90);
        zofka.move(250);
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.penDown();
        napisL();

        zofka.penUp();
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.penDown();

        napisU();

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(90);
        zofka.turnRight(90);
        zofka.move(15);
        zofka.penDown();
        zofka.turnRight(135);

        napisC();

        zofka.penUp();
        zofka.move(60);
        zofka.turnLeft(245);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.penDown();

        napisI();

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(70);
        zofka.penDown();

        napisE();
    }

    private void napisL() {
        zofka.turnRight(180);
        zofka.move(70);
        zofka.turnRight(180);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(40);
    }

    private void napisI() {
        zofka.move(70);
    }

    private void napisU() {
        zofka.turnRight(180);
        zofka.move(45);
        for (int i = 0; i < 36; i++) {
            zofka.turnLeft(5);
            zofka.move(2);
        }
        zofka.move(45);
    }

    private void napisC() {
        for (int i = 0; i < 50; i++) {
            zofka.turnLeft(5);
            zofka.move(3);
        }
    }

    private void napisE() {
        zofka.turnRight(180);
        zofka.move(70);

        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.move(35);
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.move(35);
        zofka.turnLeft(90);
        zofka.move(30);
    }

    private void nakresliDomek() {
        nakresliCtverec();
        //dostane se na vychozi bod pro kresleni strechy
        vychoziBodProStrechu();
        nakresliStrechu();
    }

    private void nakresliPrasatko() {
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
            zofka.move(20);
            zofka.turnRight(180);
            zofka.move(20);
            zofka.turnLeft(90);
            zofka.turnRight(5);
            for (int d = 0; d < 5; d++) {
                zofka.move(2);
                zofka.turnRight(5);
            }


        }
    }

    private void nakresliCtverec() {
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
    }
    private void nakresliStrechu() {
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
    }

    private void vychoziBodProStrechu() {
        zofka.penUp();
        zofka.turnRight(0);
        zofka.move(100);
    }

    private void posunSeNaDalsiDomek() {
        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(180);
        zofka.penDown();
    }
    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}

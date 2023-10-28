package lab3p1_arnoldmilla;

import java.util.Scanner;

public class Lab3P1_ArnoldMilla {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Sucesiones y más sucesiones!");
        System.out.println("2. Pocket Monsters");
        System.out.println("3. Asterisco en casa!");
        System.out.println("Ingrese una opción [1,2,3]");
        int op = sc.nextInt();
        while (op > 0 && op < 4) {
            switch (op) {
                case 1: {
                    System.out.println("--------------Sucesiones y más sucesiones!------------------");
                    char coma = ',';
                    System.out.println("Ingrese la diferencia entre los numeros ");
                    int diff = sc.nextInt();
                    int diff2 = diff;
                    System.out.println("Ingrese el numero inicial ");
                    int numi = sc.nextInt();
                    System.out.println("Ingrese la cantidad de numeros que quiere ver de la suceción ");
                    int limite = sc.nextInt();
                    limite = limite - 1;
                    int num = numi;
                    System.out.print(numi + ", ");
                    for (int contador = 1; contador <= limite; contador++) {
                        numi = numi + diff;
                        diff++;
                        System.out.print(numi);
                        if (contador < limite) {
                            for (int cont = limite - 1; cont < limite; cont++) {
                                System.out.print(coma + " ");
                            }
                        }
                    }
                    diff = diff2;
                    System.out.println(" ");
                    System.out.println("Ingrese la posición que quiere ver de la sucesión ");
                    int sec = sc.nextInt();
                    for (int contar = 1; contar < sec; contar++) {
                        num = num + diff;
                        diff++;
                        System.out.println(num);
                    }
                    System.out.println("El numero seria: " + num);
                    System.out.println(" ");
                }
                break;//fin primera opcion

                case 2: {
                    double hp1 = 0;
                    double hp2 = 0;
                    double atk1 = 0;
                    double atk2 = 0;
                    double def1 = 0;
                    double def2 = 0;
                    
                    System.out.println("----------Pocket Monsters---------");
                    System.out.println("Ingrese que modo de pelea pokemon desea: ");
                    System.out.println("1. - Hasta la muerte");
                    System.out.println("2. - Por rondas");
                    int pelea = sc.nextInt();
                    System.out.println(" ");
                    System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15%");
                    System.out.println("Gyarados Vida:300 Ataque:50 Defensa:10%");
                    System.out.println("Giratina Vida:300 Ataque:70 Defensa:25%");
                    System.out.println("Sylveon Vida:250 Ataque:75 Defensa:20%");
                    System.out.println(" ");

                    System.out.println("Ingrese una pelea determinada");
                    System.out.println("1.- Sylveon vrs Dragonite");
                    System.out.println("2.- Gyarados vrs Giratina");
                    System.out.println("3.- Dragonite vrs Giratina");
                    System.out.println("4.- Giratina vrs Sylveon");
                    int pkmn = sc.nextInt();
                    while (pkmn > 0 && pkmn < 5) {
                        switch (pkmn) {
                            case 1:
                                hp1 = 280;
                                hp2 = 250;
                                atk1 = 80;
                                atk2 = 75;
                                def1 = 0.15;
                                def2 = 0.20;
                                break;// fin verif pkmn valido

                            case 2:
                                hp1 = 300;
                                hp2 = 300;
                                atk1 = 50;
                                atk2 = 70;
                                def1 = 0.10;
                                def2 = 0.25;
                                break;

                            case 3:
                                hp1 = 250;
                                hp2 = 300;
                                atk1 = 75;
                                atk2 = 70;
                                def1 = 0.20;
                                def2 = 0.25;
                                break;

                            case 4:
                                hp1 = 300;
                                hp2 = 280;
                                atk1 = 70;
                                atk2 = 80;
                                def1 = 0.25;
                                def2 = 0.15;
                                break;
                        }//fin verif pkmn determinado
                        
                        //break para salir del while
                        break;
                    }
                    if (pelea > 0 && pelea < 3) {
                        switch (pelea) {
                            case 1: {
                                int contador = 1;
                                atk1 = (atk1 - (atk1 * def2));
                                atk2 = (atk2 - (atk2 * def1));
                                while (hp1 > 0 && hp2 > 0) {;
                                        System.out.println("------Ronda " + contador + "-------");
                                        System.out.println("Vida de pokemon 1: " + hp1);
                                        System.out.println("Vida de pokemon 2: " + hp2);
                                        System.out.println(" ");
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        hp2 = hp2 - atk1;
                                        hp1 = hp1 - atk2;
                                        if (hp1 < 0){
                                            hp1 = 0;
                                        }
                                        if (hp2 < 0){
                                            hp2 = 0;
                                        }
                                    contador++;   
                                }
                                System.out.println("Vida de pokemon 1: " + hp1);
                                System.out.println("Vida de pokemon 2: " + hp2);
                                System.out.println("****** Fin de la Batalla *******");
                                if (hp1 > hp2){
                                    System.out.println("Pokemon 1 Ha sido el ganador!");
                                }
                                    else if(hp2 > hp1){
                                        System.out.println("Pokemon 2 Ha sido el ganador!");
                                    }

                            }break;
                            
                            case 2:{
                                atk1 = (atk1 - (atk1 * def2));
                                atk2 = (atk2 - (atk2 * def1));
                                System.out.println("Ingresar la cantidad de rondas que quiere que sucedan ");
                                int rondas = sc.nextInt();
                                if (rondas <= 10){
                                    for(int c1 = 1; c1 < rondas; c1++){
                                        System.out.println("------Ronda " + c1 + "-------");
                                        System.out.println("Vida de pokemon 1: " + hp1);
                                        System.out.println("Vida de pokemon 2: " + hp2);
                                        System.out.println(" ");
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        hp2 = hp2 - atk1;
                                        hp1 = hp1 - atk2;
                                        if (hp1 < 0 || hp2 < 0){
                                            hp1 = 0;
                                            hp2 = 0;
                                        }
                                    }
                                }
                                System.out.println("Vida de pokemon 1: " + hp1);
                                System.out.println("Vida de pokemon 2: " + hp2);
                                System.out.println("****** Fin de la Batalla *******");
                                if (hp1 > hp2){
                                    System.out.println("Pokemon 1 Ha sido el ganador! por hp más alta");
                                }
                                    else if(hp2 > hp1){
                                        System.out.println("Pokemon 2 Ha sido el ganador! por hp más alta");
                                    }
                            }
                        }
                    }
                   
                }
                break;//fin segunda opcion
                
                case 3:{
                    System.out.println("--------Asterisco en casa!---------");
                    System.out.println("Ingresar el ancho de la forma tiene que ser impar");
                        int ancho = sc.nextInt();
                    System.out.println("Ingresar el alto de la forma tiene que ser impar");
                        int alto = sc.nextInt();
                        if (ancho > 0 && alto > 0){
                        if (ancho % 2 == 1 && alto % 2 == 1){
                            for (int contador = 1; contador <= alto; contador++){
                                System.out.println("");
                                    for (int cont = 1; cont <= ancho; cont++){
                                        if (contador == 1 || contador == alto || cont == 1 || cont == ancho){
                                            System.out.print("*");
                                        }
                                        else if (cont == (ancho/2) +1){
                                            System.out.print("|");
                                        }
                                        else if(cont == contador){
                                            System.out.print(">");
                                        }
                                        else if (contador + cont == ancho + 1){
                                            System.out.print(">");
                                        }
                                        else  {
                                            System.out.print(" ");
                                        }
                                    }
                            }
                            System.out.println(" ");
                        }
                        else if (ancho % 2 == 0 || alto % 2 == 0){
                            System.out.println("Una longitud de la figura es invalida");
                        }   
                        }//fin while verif medida negativa
                        else if (ancho < 0 || alto < 0){
                            System.out.println("Una longitud de la figura es negativa");
                        }
                }
            }
            System.out.println("1. Sucesiones y más sucesiones!");
            System.out.println("2. Pocket Monsters");
            System.out.println("3. Asterisco en casa!");
            System.out.println("Ingrese una opción [1,2,3]");
            op = sc.nextInt();
        }
    }

}

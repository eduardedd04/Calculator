package org.example.services;

public class Calculator {

    /*
     *Clasa = absolut tot ce ne inconjoara -> o schita conceptuala a unui obiect (defineste proprietatile, constructorii, metodele etc.)
     * Instanta unei clase este un obiect.
     * Instanta unui tip de date primitiv, este o variabila.
     * Clasa este un tip de date.
     */

    //propritetati = atributele unui obiect de tipul  clasei

    public String tipCalculator;
    public String culoare;

    // constructor = schita generala a unui obiect
    /*
    1. inplicit = un constructor fara nici un parametru -> unul singur per clasa
    2. explicit = un constructor PARAMETRIZAT -> putem avea unul sau mai multi per clasa

  - Principii OOP:
       1. abstractivare
       2. incapsulare
       3. polimorfism
       4. mostenire = ne permite sa generalizam o clasa parinte care sa fie mostenita de clase copil(Animal -> caine, pisica)
       5. compunere = ne permite sa conectam 2 clase intre ele prin relatii 1-to-1, 1-to-many, many-to-1.

    De ce am vrea sa folosim constructori expliciti?
        - Pentru ca o clasa este o entitate generala. Defineste proprietatile si comportamentul pentru ORICE obiect de acel tip.
        Dar pot aparea exceptii, in care anumite proprietati nu se regasesc sau nu sunt necesare. De aceea, avand mai multi constructoriexpliciti
        parametrizat in toate modurile. PUTEM defini obiecte cu diferite STRUCTURI/SCHITE.

    this = este un cuvant cheie care POINTEAZA spre interiorul clasei, spre proprietatile clasei, spre metodele clasei.
     */


    //constructor implicit
    public Calculator() {
        this.tipCalculator = "";
        culoare = "";
    }


    //constructori explicit
    public Calculator(String tipCalculatorExtern, String culoare) {
        tipCalculator = tipCalculatorExtern;
        this.culoare = culoare;
    }

    public Calculator(String tipCalculator) {
        this.tipCalculator = tipCalculator;
    }

    //metode
    public float sum(float a, float b) {
        return a + b;
    }

    public float dif(float a, float b) {
        return a - b;
    }

    public float multiplay(float a, float b) {
        return a * b;
    }

    public float divide(float a, float b) {
        return a / b;
    }

    //getter/setter


}

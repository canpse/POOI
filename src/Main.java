import generelizacao.dna.Dna;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Dna dna = new Dna(new File("C:/Users/lucas/IdeaProjects/POOI/data/fitaDNA.txt"));
        dna.verificaLinhas();

    }
}
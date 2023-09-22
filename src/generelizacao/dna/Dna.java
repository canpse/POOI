package generelizacao.dna;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Dna {

    private File dnaFile;
    private ArrayList<Integer> linhasInvalidas;
    private ArrayList<Integer> linhasValidas;

    public Dna(File dnaFile) {
        this.dnaFile = dnaFile;
    }

    public void verificaLinhas() {
        File file = this.dnaFile;

        int totalLinhasValidas = 0;
        int totalLinhasInvalidas = 0;

        HashMap<String, String> letraComplementar = new HashMap<String, String>();
        letraComplementar.put("A", "T");
        letraComplementar.put("C", "G");
        letraComplementar.put("G", "C");
        letraComplementar.put("T", "A");

        ArrayList<Integer> numerosLinhasInvalidas = this.linhasValidas;

        try (Scanner scanner = new Scanner(file)) {
            BufferedWriter writer = new BufferedWriter(new FileWriter("dnaComplementar.txt"));
            int i = 0;
            while (scanner.hasNext()) {
                boolean linhaInvalida = false;
                String linha = scanner.nextLine();
                StringBuilder complementar = new StringBuilder();
                for (char letra : linha.toCharArray()) {
                    if (!letraComplementar.containsValue(""+letra)) {
                        linhaInvalida = true;
                        totalLinhasInvalidas++;
                        numerosLinhasInvalidas.add(i+1);
                    }
                }
                if (linhaInvalida) {
                    complementar.append("****FITA INVALIDA - ");
                    complementar.append(linha);
                    writer.write(complementar.toString());
                } else {
                    for (char letra : linha.toCharArray()) {
                        complementar.append(letraComplementar.get(""+letra));
                    }
                    writer.write(complementar.toString());
                    totalLinhasValidas++;
                }
                writer.newLine();
                i++;
            }
            writer.close();
            System.out.println("O Total de fitas é " + i);
            System.out.println("O Total de fitas validas é " + totalLinhasValidas);
            System.out.println("O Total de fitas invalidas é " + totalLinhasInvalidas);
            System.out.println("as Linhas invalidas são " + numerosLinhasInvalidas.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

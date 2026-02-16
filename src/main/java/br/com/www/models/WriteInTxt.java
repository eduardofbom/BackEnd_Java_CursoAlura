package br.com.www.models;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteInTxt {
    private String fileName;

    public WriteInTxt(String fileName) {
        this.fileName = fileName;
    }
    public String getFileName() {
        return fileName;
    }


    public void writeMessage(String message) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(message);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "file.txt";
        WriteInTxt writeInTxt = new WriteInTxt(fileName);
        String data = "Content to be saved in the file.";
        writeInTxt.writeMessage(data);

        scanner.close();
    }
}




/*
Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt":
"Conteúdo a ser gravado no arquivo." Utilize as classes do pacote java.io.
 */
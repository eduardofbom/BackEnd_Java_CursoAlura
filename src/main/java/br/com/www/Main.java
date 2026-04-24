package br.com.www;

import br.com.www.models.BoxGeneric;

public class Main {

    public static void main(String[] args) {

        BoxGeneric<String> textBox = new BoxGeneric<>();
        textBox.setContent("Text");
        System.out.println(textBox.getContent());
        System.out.println(textBox.sumContent("ing"));

        // -----------

        BoxGeneric<Integer> ageBox = new BoxGeneric<>();
        ageBox.setContent(19);
        System.out.println(ageBox.getContent());
        System.out.println(ageBox.sumContent(10));

        // -----------

        BoxGeneric<Double> valueBox = new BoxGeneric<>();
        textBox.setContent(150.87);
        System.out.println(textBox.getContent());
        System.out.println(textBox.sumContent(250.13));
    }
}

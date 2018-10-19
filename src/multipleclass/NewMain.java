/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilder;

/**
 *
 * @author L410-S01
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//            System.out.println(c.get(Calendar.HOUR));
//            System.out.println(c.get(Calendar.SECOND));
//            System.out.println(c.get(Calendar.AM_PM));
//            System.out.println(c.get(Calendar.YEAR));
//            System.out.println("current time: " + c.getTime());
//            c.add(Calendar.YEAR, -1);
//            System.out.println(c);

//            String value = "Gillian.. Doctor";
//            //String pattern = "[a-f]";
//            String special = "\\.";
//            String pattern = "[^aeiou .]";
//            String temp = value.replaceAll(pattern, "X");
//            System.out.println(temp);
//        String input = "Manolito";
//        String not = "[aeiou]";
//        String temp = input.replaceAll(not, "");
//        System.out.println(temp.length());
            String value = "cat.cat";    
            String pattern = "\\.";
            String temp = value.replaceAll(pattern, "x");
            System.out.println("temp = " + temp);


    }

}

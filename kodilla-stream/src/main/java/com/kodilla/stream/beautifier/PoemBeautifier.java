package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String str, PoemDecorator pd){
        str = pd.decorate(str);
        System.out.println(str);
        return str;
    }

    public static String pokemonText(String str) {
        String newString = "";
        for(int i = 0; i < str.length(); i++){
            if(i % 2 == 0) newString = newString.concat(str.substring(i,i+1).toUpperCase());
            else newString = newString.concat(str.substring(i,i+1).toLowerCase());
        }
        return newString;
    }

    public String beautyText(String str){
        return "~.~.~.~ "+str+" ~.~.~.~";
    }

}

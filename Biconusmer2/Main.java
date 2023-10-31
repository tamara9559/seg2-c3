package Biconusmer;

import java.util.function.BiFunction;

public class Main {


    public static void main(String[] args) {
        Junior junior = new Junior("juan",19);
        Senior senior = new Senior("julio","9 años");

        BiFunction<Junior,Senior,String> experiencia=(J,S) ->{
            J.setEdad(19);
            return S.getExperiencia() +"_"+ "se pide para "+ S.getNombre() +  "y"  +  J.getNombre() + ".";

        };
        System.out.println(experiencia.apply(junior,senior));

    }
}

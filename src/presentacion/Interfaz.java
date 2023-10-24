package presentacion;
import dominio.*;
import java.util.*;

public class Interfaz{

    public static ArrayList<Provincia> leer(){
        ArrayList<Provincia> provincias = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String nombreprovincia;
        do {
            System.out.print("Nombre de la provincia (enter para finalizar): ");
            nombreprovincia = sc.nextLine();
            if (!nombreprovincia.equals("")){
                Provincia p = new Provincia(nombreprovincia);
                do {
                    System.out.print("Leer municipio de la provincia ");
                    String nombremunicipio = sc.nextLine();
                    if (!nombremunicipio.equals("")){
                        Municipio m = new Municipio(nombremunicipio);
                        p.addMunicipio(m);
                    }
                } while (!nombremunicipio.equals(""));
                provincias.add(p);
            }
        } while (!nombreprovincia.equals(""));
        return provincias;
    }
}

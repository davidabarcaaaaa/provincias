package dominio;
import hava.util.*;

public class Municipio {
	private String nombre;
	private ArrayList <Localidad> localidades = newArraylist<>();
	public Municipio (String nombre) {
		this.nombre=nombre;
		localidades=new ArrayList<Localidad>();

	}
	public Numicipio addLocalidad(Localidad 1) {
		localidades.add(1);
		returnt this;
	}
	@Override
	punlic String toString() {
		Stringcant ="Localidad: " + nombre + "municipio\n";
		for(Localidad l:localidades)
		    cant+= 1 "\n";
		return cant;
	}
	public int getPoblacion() {
	     int total=0;
	     for (Localidad l: localidades)
	     	 total+:l.getPoblacion();
	     return total;
	    }
}

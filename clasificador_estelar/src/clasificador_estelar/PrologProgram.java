/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasificador_estelar;

import org.jpl7.*;
/**
 *
 * @author alain
 */
public class PrologProgram {
    private String idObj, corrimiento_rojo, ultravioleta, verde, infrarrojo, infrarrojo_cercano; 
    
    public PrologProgram(String idObj, String corrimiento_rojo, String ultravioleta, String verde, String infrarrojo, String infrarrojo_cercano) {
        this.idObj=idObj;
        this.corrimiento_rojo = corrimiento_rojo;
        this.ultravioleta = ultravioleta;
        this.verde = verde;
        this.infrarrojo = infrarrojo;
        this.infrarrojo_cercano = infrarrojo_cercano;        
    }
    
    public String clasificar(){
        Query consult = new Query("consult('src/clasificador_estelar/programa.pl')");
        consult.hasSolution();
        
        Term c_r=Term.textToTerm("corrimiento_rojo("+idObj+", "+corrimiento_rojo+")");
        Query.hasSolution("assert(" + c_r + ")");
        
        Term uv=Term.textToTerm("filtro_ultravioleta("+idObj+", "+ultravioleta+")");
        Query.hasSolution("assert(" + uv + ")");
        
        Term vrd=Term.textToTerm("filtro_verde("+idObj+", "+verde+")");
        Query.hasSolution("assert(" + vrd + ")");
        
        Term infrrjo=Term.textToTerm("filtro_infrarrojo("+idObj+", "+infrarrojo+")");
        Query.hasSolution("assert(" + infrrjo + ")");
        
        Term infrrjo_crcno=Term.textToTerm("filtro_infrarrojo_cercano("+idObj+", "+infrarrojo_cercano+")");
        Query.hasSolution("assert(" + infrrjo_crcno + ")");
        
        
        Variable X=new Variable("X");
        Query hallar_clase = new Query("clase", new Term[]{new Atom(idObj), X});
        
        java.util.Map<String, Term> solution;
        solution = hallar_clase.oneSolution();

        Query.hasSolution("retractall(corrimiento_rojo(X, Y))");
        Query.hasSolution("retractall(filtro_ultravioleta(X, Y))");
        Query.hasSolution("retractall(filtro_verde(X, Y))");
        Query.hasSolution("retractall(filtro_infrarrojo(X, Y))");
        Query.hasSolution("retractall(filtro_infrarrojo_cercano(X, Y))");
        
        return solution.get("X")+"";

    }
}

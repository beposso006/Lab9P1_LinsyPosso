/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_linsyposso;

/**
 *
 * @author LINSY POSSO
 */
public class Libros {
    private String Titulo;
    private String NombredeAutor;
    private String Genero;
    private int Edadmin;
    
    public Libros(String Titulo, String NombredeAutor, String Genero, int Edadmin) {
        this.Titulo = Titulo;
        this.NombredeAutor = NombredeAutor;
        this.Genero = Genero;
        this.Edadmin = Edadmin;
}
    public String getTitulo(){
        return Titulo;
    }
    public void setTitulo(String titulo){
        this.Titulo = titulo;
    }
    public String getNombredeAutor(){
        return NombredeAutor;
    }
    public void setNombredeAutor(String nombredeAutor){
        this.NombredeAutor = nombredeAutor;
    }
    public String getGenero (){
        return Genero;
    }
    public void setGenero(String genero){
        this.Genero = genero;
    }
    public int getEdadmin (){
        return Edadmin;
    }
    public void setEdadmin(int edad){
        this.Edadmin = edad;
    }
    
}

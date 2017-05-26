/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sietemediablackjack;

/**
 *
 * @author Dani
 */
public enum TiposDeBaraja {
    BARAJA1("Siete Y Media","barajaespanola/reverso.jpg","barajaespanola/b1.jpg,barajaespanola/b2.jpg,barajaespanola/b3.jpg,barajaespanola/b4.jpg,"
    + "barajaespanola/b5.jpg,barajaespanola/b6.jpg,barajaespanola/b7.jpg,barajaespanola/bs.jpg,"
    + "barajaespanola/bc.jpg,barajaespanola/br.jpg,barajaespanola/c1.jpg,barajaespanola/c2.jpg,"
    + "barajaespanola/c3.jpg,barajaespanola/c4.jpg,barajaespanola/c5.jpg,barajaespanola/c6.jpg,"
    + "barajaespanola/c7.jpg,barajaespanola/cs.jpg,barajaespanola/cc.jpg,barajaespanola/cr.jpg,"
    + "barajaespanola/e1.jpg,barajaespanola/e2.jpg,barajaespanola/e3.jpg,barajaespanola/e4.jpg,"
    + "barajaespanola/e5.jpg,barajaespanola/e6.jpg,barajaespanola/e7.jpg,barajaespanola/es.jpg,"
    + "barajaespanola/ec.jpg,barajaespanola/er.jpg,barajaespanola/o1.jpg,barajaespanola/o2.jpg,"
    + "barajaespanola/o3.jpg,barajaespanola/o4.jpg,barajaespanola/o5.jpg,barajaespanola/o6.jpg,"
    + "barajaespanola/o7.jpg,barajaespanola/os.jpg,barajaespanola/oc.jpg,barajaespanola/or.jpg",
            "1f,2f,3f,4f,5f,6f,7f,0.5f,0.5f,0.5f,1f,2f,3f,4f,5f,6f,7f,0.5f,0.5f,0.5f,1f,2f,3f,4f,5f,6f,7f,0.5f,0.5f,0.5f,1f,2f,3f,4f,5f,6f,7f,0.5f,0.5f,0.5f",7.5f),
    
    BARAJA2("Blackjack","barajainglesa/reverso.jpg","barajainglesa/C1.GIF,"
            + "barajainglesa/C2.GIF,"
            + "barajainglesa/C3.GIF,"
            + "barajainglesa/C4.GIF,"
            + "barajainglesa/C5.GIF,"
            + "barajainglesa/C6.GIF,"
            + "barajainglesa/C7.GIF,"
            + "barajainglesa/C8.GIF,"
            + "barajainglesa/C9.GIF,"
            + "barajainglesa/C10.GIF,"
            + "barajainglesa/C11.GIF,"
            + "barajainglesa/C12.GIF,"
            + "barajainglesa/C13.GIF,"
            + "barajainglesa/D1.GIF,"
            + "barajainglesa/D2.GIF,"
            + "barajainglesa/D3.GIF,"
            + "barajainglesa/D4.GIF,"
            + "barajainglesa/D5.GIF,"
            + "barajainglesa/D6.GIF,"
            + "barajainglesa/D7.GIF,"
            + "barajainglesa/D8.GIF,"
            + "barajainglesa/D9.GIF,"
            + "barajainglesa/D10.GIF,"
            + "barajainglesa/D11.GIF,"
            + "barajainglesa/D12.GIF,"
            + "barajainglesa/D13.GIF,"
            + "barajainglesa/P1.GIF,"
            + "barajainglesa/P2.GIF,"
            + "barajainglesa/P3.GIF,"
            + "barajainglesa/P4.GIF,"
            + "barajainglesa/P5.GIF,"
            + "barajainglesa/P6.GIF,"
            + "barajainglesa/P7.GIF,"
            + "barajainglesa/P8.GIF,"
            + "barajainglesa/P9.GIF,"
            + "barajainglesa/P10.GIF,"
            + "barajainglesa/P11.GIF,"
            + "barajainglesa/P12.GIF,"
            + "barajainglesa/P13.GIF,"
            + "barajainglesa/T1.GIF,"
            + "barajainglesa/T2.GIF,"
            + "barajainglesa/T3.GIF,"
            + "barajainglesa/T4.GIF,"
            + "barajainglesa/T5.GIF,"
            + "barajainglesa/T6.GIF,"
            + "barajainglesa/T7.GIF,"
            + "barajainglesa/T8.GIF,"
            + "barajainglesa/T9.GIF,"
            + "barajainglesa/T10.GIF,"
            + "barajainglesa/T11.GIF,"
            + "barajainglesa/T12.GIF,"
            + "barajainglesa/T13.GIF",
        "2f,3f,4f,5f,6f,7f,8f,9f,10f,10f,10f,10f,11f,2f,3f,4f,5f,6f,7f,8f,9f,10f,10f,"
            + "10f,10f,11f,2f,3f,4f,5f,6f,7f,8f,9f,10f,10f,10f,10f,11f,2f,3f,"
            + "4f,5f,6f,7f,8f,9f,10f,10f,10f,10f,11f",21.0f);
    
    private String nombre;
    private String archivoReverso;
    private String archivosDeImagen;
    private String valores;
    private float limite;

    private TiposDeBaraja(String nombre, String archivoReverso, String archivosDeImagen, String valores, float limite) {
        this.nombre = nombre;
        this.archivoReverso = archivoReverso;
        this.archivosDeImagen = archivosDeImagen;
        this.valores = valores;
        this.limite = limite;
    }

    public float getLimite(){
        return this.limite;
    }
    
    public float[] valores(){
        String[] valor = this.valores.split(",");
        float[] fValores = new float[valor.length];
        for(int i = 0; i < valor.length; i++){
            fValores[i] = Float.parseFloat(valor[i]);
        }
        return fValores;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getArchivoReverso(){
        return this.archivoReverso;
    }
    
    public String[] archivosDeImagen(){
        return this.archivosDeImagen.split(",");
    }
    
    public int numeroDeCartasDeLaBaraja(){
        return this.valores.split(",").length;
    }
    
    public static String[] nombresBarajas(){
        String[] nombres = new String[TiposDeBaraja.values().length];
        for(int i = 0; i < TiposDeBaraja.values().length; i++){
            nombres[i] = TiposDeBaraja.values()[i].getNombre();
        }
        return nombres;
    }
    
    public static TiposDeBaraja devuelveBaraja(String nombre){
        TiposDeBaraja baraja = null;
        if(nombre.equals(BARAJA1.getNombre())){
            baraja = TiposDeBaraja.BARAJA1;
        } else if (nombre.equals(BARAJA2.getNombre())){
            baraja = TiposDeBaraja.BARAJA2;
        }
        return baraja;
    }
}

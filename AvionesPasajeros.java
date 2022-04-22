package examen1;

public class AvionesPasajeros {

	private String modelo;
	private String paisElab;
	private String nLicencia;
	private int nMotores;
	private int pesoNeto;
    private int peso;
    private int nCarga;
    private int nPasajeros;
    private int velocidadMax;
    private int pesoMotores;
 
    private int precioNNP;
    private boolean filtroUV, televisionPersonal;
    

    //Metodo Constructor
    
    public AvionesPasajeros() {
           
            modelo= "AVPA"; 
            nLicencia = "AVPA-2020"; 
            nMotores = 3;
            pesoNeto= 3000;
            nCarga  = 250;
            nPasajeros= 250; 
            velocidadMax= 300; 
           
    }      
    public String getModelo() {
    	return "\nModelo:"+ modelo;
    }
    
    public String getPaisElab() {
    	return "Pais: "+ paisElab;
    }
    public String getnLicencia() {
    		return "Licencia: "+ nLicencia;
    }
    
    public String getnMotores() {
    	return "Motores: " + nMotores +" motores";
    }
    
    public String getpesoMotores() {
    	pesoMotores= nMotores*1000;
    	return "Peso de los motores: " + pesoMotores +"kg";
    }
    
    public String getPesoNeto() {
    	peso= pesoMotores+peso;
    	return "Peso neto: "+ pesoNeto+ "kg";
    }
    
    public String getPeso() {
    	peso= pesoMotores+pesoNeto;
    	return "Peso total: "+ peso+ "kg";
    }
    
    public String getnCarga() {
    	return "Compartimientos de carga: "+ nCarga;
    }
    
    public String getnPasajeros() {
    	return "Capacidad de pasajeros:"+ nPasajeros;
    }
    
    public String getVelocidadMax() {
    	return "Velocidad Maxima: "+ velocidadMax + "km/s";
    }
    
    public String getPrecioNNP() {
    	precioNNP=(nCarga*5)+((nPasajeros+2)*10)+(peso*15);
    	return "Costo: "+precioNNP +"$";
    }
    
    public String getfiltroUV() {
    	return "Filtro UV: "+ filtroUV;
    }
     
     public String gettelevisionPersonal() {
       	 return "Television personal: "+ televisionPersonal;
    }
    
    // info general
    public String getInfo() {
        return getModelo() +"\n"+getPaisElab()+"\n"+getnLicencia() +"\n"+getnMotores() +"\n"+getpesoMotores()+"\n"+getPesoNeto()+"\n"+getPeso() +"\n"+getnCarga() +"\n"+getnPasajeros()+"\n"+getVelocidadMax()+"\n"+getPrecioNNP()+"\n"+getfiltroUV()+"\n"+gettelevisionPersonal()+"\nTripulantes: 2";
    }
    
    //setters
    
    public void setModelo(String modelo)
    {
            this.modelo = modelo;
    }
    
    public void setPaisElab(String paisElab)
    {
            this.paisElab = paisElab;
    }
    
    public void setnLicencia(String nLicencia)
    {
            this.nLicencia = nLicencia;
    }

    public void setnMotores(int nMotores)
    {
            this.nMotores = nMotores;
    }
    
    public void setpesoMotores(int pesoMotores)
    {
            this.pesoMotores = pesoMotores;
    }
    
    public void setPeso(int peso)
    {
            this.peso = peso;
    }
    
    public void setPesoNeto(int pesoNeto)
    {
            this.pesoNeto = pesoNeto;
    }
    
    public void setnCarga(int nCarga)
    {
            this.nCarga = nCarga;
    }
    
    public void setnPasajeros(int nPasajeros)
    {
            this.nPasajeros = nPasajeros;
    }
 
    public void setVelocidadMax (int velocidadMax)
    {
            this.velocidadMax = velocidadMax;
    }
    
    public void setPrecioNNP(int precioNNP)
    {
            this.precioNNP = precioNNP;
    }
    
    public void configFUV(String filtroUV)
    {
   	 if (filtroUV.equalsIgnoreCase ("si")) {
   		 this.filtroUV= true;
   		 
   	 }
   	 else {
   		 this.filtroUV= false;
   		 
   	 }
   	 
    }
    
    public void settelevisionPersonal(String televisionPersonal)
    {
   	 if (televisionPersonal.equalsIgnoreCase ("si")) {
   		 this.televisionPersonal= true;
   		 
   	 }
   	 else {
   		 this.televisionPersonal= false;
   		 
   	 }
   	 
    }
	
}

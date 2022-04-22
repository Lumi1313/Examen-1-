package examen1;

public class HelicopterosMilitares {

	private String modelo;
	private String paisElab;
	private String nLicencia;
	private int nMotores;
	private int pesoNeto;
    private int peso;
    private int nPasajeros;
    private int nCarga;
    private int alturaMax; 
    private int pesoMotores;
    private String color;
 
    private int precioNNP;
    private boolean camuflaje, blindado;
    
    //Constructor
    
    public HelicopterosMilitares() {
           
            modelo= "HM"; //
            nLicencia = "HM-2020";
            nMotores = 4;
            pesoNeto= 7000;
            nPasajeros= 0;
            alturaMax= 800;
           
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
       
       public String getAlturaMax() {
      	 return "Altura Maxima: "+ alturaMax;
       }
    
    public String getPrecioNNP() {
   	 precioNNP=((2+nPasajeros)*25)+(peso*10); 
   	 return "Precio: "+precioNNP +"$";
    }

    public String getCamuflaje() {
      	 return "Camuflaje: "+ camuflaje;
       }

    public String getBlindado() {
      	 return "Blindado Doble: "+ blindado;
       }
    
    public String getColor() {
      	 return "Color: "+ color;
       }
    
    // Informacion General
    public String getInfo() {
    	return getModelo() +"\n"+getPaisElab()+"\n"+getnLicencia() +"\n"+getnMotores() +"\n"+getpesoMotores()+"\n"+getPeso()+"\n"+getnCarga()+"\n"+getnPasajeros()+"\n"+getAlturaMax()+"\n"+getPrecioNNP()+"\n"+getCamuflaje()+"\n"+getBlindado()+"\n"+getColor()+"\nTripulantes: 2";
    }
    
    //Setters
    
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
            
	 public void setnPasajeros(int nPasajeros)
 	{
 	        this.nPasajeros = nPasajeros;         
    }
	 public void setnCarga(int nCarga)
	{
	 		this.nCarga = nCarga;
	}
	 public void setVelocidadMax (int alturaMax)
    {
            this.alturaMax = alturaMax;
    }
    
    public void setPrecioNNP(int precioNNP)
    {
            this.precioNNP = precioNNP;
    }
    
    public void setColor(String color)
    {
            this.color = color;
    }
    
    public void setHelices(String helices)
    {
    	
    }
    public void setCamuflaje(String camuflaje)
    {
   	 if (camuflaje.equalsIgnoreCase ("si")) {
   		 this.camuflaje= true;
   		 
   	 }
   	 else {
   		 this.camuflaje= false;
   	
   	 }
  }
       
     public void setBlindado(String blindado)
     {
    	 if (blindado.equalsIgnoreCase ("si")) {
    		 this.blindado= true;
    	
    	 }
    	 else {
    		 this.blindado= false;
    	
    	 }
     }
	
}

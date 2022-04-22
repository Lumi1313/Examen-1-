package examen1;

public class AvionetasCelebracion {

	private String modelo;
	private String paisElab;
	private String nLicencia;
	private int nMotores;
	private int pesoNeto;
    private int peso;
    private int nPasajeros;
    private int velocidadMax;
    private int pesoMotores;
    private String color;
 
    private int precioNNP;
    private boolean dispensadorHumo, helices;
    

    //Constructor
    
    public AvionetasCelebracion() {
           
            modelo= "AVCELEB"; 
            nLicencia = "AVCELEB-2021"; 
            nMotores = 2;
            pesoNeto= 2000;
            nPasajeros= 2;
            velocidadMax= 2000;
           
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
       
       public String getnPasajeros() {
      	 return "Capacidad de pasajeros:"+ nPasajeros;
       }
       
       public String getVelocidadMax() {
      	 return "Velocidad Maxima: "+ velocidadMax + "km/s";
       }
       
    
    public String getPrecioNNP() {
   	 precioNNP=((2+nPasajeros)*25)+(peso*10); 
   	 return "Precio: "+precioNNP +"$";
    }

    public String getdispensadorHumo() {
      	 return "Dispensador de humo: "+dispensadorHumo;
    }
    
    public String getHelices() {
      	 return "Helice Doble: "+ helices;
    }
    

    public String getColor() {
      	 return "Color: "+ color;
    }
    
    // Informacion General
    public String getInfo() {
    	return getModelo() +"\n"+getPaisElab()+"\n"+getnLicencia() +"\n"+getnMotores() +"\n"+getpesoMotores()+"\n"+getPeso()+"\n"+getnPasajeros()+"\n"+getVelocidadMax()+"\n"+getPrecioNNP()+"\n"+getdispensadorHumo()+"\n"+getHelices()+"\n"+getColor()+"\nTripulantes: 2";
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
    public void setVelocidadMax (int velocidadMax)
    {
            this.velocidadMax = velocidadMax;
    }
    
    public void setPrecioNNP(int precioNNP)
    {
            this.precioNNP = precioNNP;
    }
    
    public void setColor(String color)
    {
            this.color = color;
    }

//Setter humo de colores
    
    public void setdispensadorHumo(String dispensadorHumo)
    {
   	 if (dispensadorHumo.equalsIgnoreCase ("si")) {
   		 this.dispensadorHumo= true;
   		
   	 }
   	 else {
   		 this.dispensadorHumo= false;
   		 
   	 }
  }
     
     public void setHelices(String helices)
     {
    	 if (helices.equalsIgnoreCase ("si")) {
    		 this.helices= true;
    		
    	 }
    	 else {
    		 this.helices= false;
    		 
    	 }
     }
     
     }
	


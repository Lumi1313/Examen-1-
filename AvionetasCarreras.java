package examen1;

public class AvionetasCarreras {

	private String modelo;
	private String paisElab;
	private String nLicencia;
	private int nMotores;
	private int pesoNeto;
    private int peso;
    private int velocidadMax;
    private int pesoMotores;

    private String color;
 
    private int precioNNP;
    private boolean turbo, helices;
    

    //Constructor
    
    public AvionetasCarreras() {
           
            modelo= "AVRC"; 
            nLicencia = "AVRC-2022"; 
            nMotores = 4;
            pesoNeto= 2000;
            velocidadMax= 5000;
           
    }      
    public String getModelo() {
      	 return "Modelo:"+ modelo;
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

       public String getVelocidadMax() {
      	 return "Velocidad Maxima: "+ velocidadMax + "km/s";
       }
       
    public String getPrecioNNP() {
   	 precioNNP=((2)*25)+(peso*10);  
   	 return "Precio: "+precioNNP +"$";
    }

    public String getHelices() {
      	 return "Doble Helice:"+ helices;
       }
    

    public String getColor() {
      	 return "Color: "+ color;
       }

    public String getTurbo() {
      	 return "Turbo "+ turbo;
       }
    
    // Informacion General
    public String getInfo() {
    	return getModelo() +"\n"+getPaisElab()+"\n"+getnLicencia() +"\n"+getnMotores() +"\n"+getpesoMotores()+"\n"+getPeso()+"\n"+getVelocidadMax()+"\n"+getPrecioNNP()+"\n"+getTurbo()+"\n"+getHelices()+"\n"+getColor()+"\nTripulantes: 2";
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
   
     public void setTurbo(String turbo)
     {
    	 if (turbo.equalsIgnoreCase ("si")) {
    		 this.turbo= true;
    	
    	 }
    	 else {
    		 this.turbo= false;
    	
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

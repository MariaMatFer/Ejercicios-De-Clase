package principal;

import intro.Teclado;

public class Libro {
	
	//Atributos 
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    //Constructor por defecto
    public Libro() {
    	titulo = "La Biblia";
    	autor = "Los ap�stoles";
    	ejemplares = 30;
    	prestados = 0;
    }

    //constructor con par�metros
    public Libro(String tit, String aut, int ejem, int prest) {
        this.titulo = tit;
        this.autor = aut;
        this.ejemplares = ejem;
        this.prestados = prest;
    }

    
    //constructor con algunos par�metros
    public Libro(String tit, String aut) {
        this.titulo = tit;
        this.autor = aut;
        this.ejemplares = 30;
        this.prestados = 0;
    }
    
    
    //getters y setters
    /*
     * 		getTitulo - devolver la informacion. por lo tanto no lleva parametros
     * 		setTitulo - para darle la informacion del atributo
     */
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String aut) {
        this.autor = aut;
        // al poner distinto nombre puedo poner autor =aut;
      }

      public int getEjemplares() {
          return ejemplares;
      }

      public void setEjemplares(int ejem) {
          this.ejemplares = ejem;
      }

      public int getPrestados() {
          return prestados;
      }

      public void setPrestados(int prest) {
          this.prestados = prest;
      }
      public String getTitulo() {
          return titulo;
      }

      public void setTitulo(String titulo) {
          this.titulo = titulo;
      }

      //m�todo para realizar el prestamo de un libro
      public boolean prestamo() {
          boolean prestado = true;
          if (prestados < ejemplares) {
              prestados++;
              
          } else {
        	  prestado = false;
          }
          return prestado;
      }

      //m�todo para realizar la devoluci�n de un libro
      public boolean devolucion() {
          boolean devuelto = true;
          if (prestados == 0) {
              devuelto = false;
          } else {
              prestados--;
          }
          return devuelto;
      }

      //m�todo informarLibro  para mostrar los datos de la clase Libro

      public String informarLibro() {
          return "Titulo: " + titulo + "\nAutor: " + autor +
                    "\nEjemplares: " + ejemplares + "\nPrestados: " + prestados;
      }
     
      public static void main(String[] args) {

    	  //Declaraci�n variables locales del main
          String titu, aut;
          int ejem;

          //se crea, o se instancia, el objeto libro1 utilizando el constructor con par�metros
          Libro libro1 = new Libro("El quijote", "Cervantes", 1, 0);
          //se crea el objeto libro2 utilizando el constructor por defecto
          Libro libro2 = new Libro();

          titu = Teclado.leerTexto("Introduce titulo: ");
           aut = Teclado.leerTexto("Introduce autor: ");
          ejem = Teclado.leerEntero("Numero de ejemplares: ");

          //se asigna a libro2 los datos pedidos por teclado.
          //para ello se utilizan los m�todos setters
          libro2.setTitulo(titu);   // Si el atributo titulo fuera public podr�a haber hecho:
          										// libro2.titulo = titu;
          libro2.setAutor(aut);
          libro2.setEjemplares(ejem);

          //se muestran por pantalla los datos del objeto libro1
          //se utilizan los m�todos getters para acceder al valor de los atributos
          System.out.println("Libro 1:");
          System.out.println("Titulo: " + libro1.getTitulo());
          System.out.println("Autor: " + libro1.getAutor());
          System.out.println("Ejemplares: " + libro1.getEjemplares());     		//Esto es igual que el m�todo de informarLibro
          System.out.println("Prestados: " + libro1.getPrestados());
          System.out.println();

          //se realiza un pr�stamo de libro1. El m�todo devuelve true si se ha podido
          //realizar el pr�stamo y false en caso contrario
          if (libro1.prestamo()) {
              System.out.println("Se ha prestado el libro " + libro1.getTitulo());
          } else {
              System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
          }

          //se realiza una devoluci�n de libro1. El m�todo devuelve true si se ha podido
          //realizar la devoluci�n y false en caso contrario
          if (libro1.devolucion()) {
              System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
          } else {
              System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
          }

          //se realiza otro pr�stamo de libro1
          if (libro1.prestamo()) {
              System.out.println("Se ha prestado el libro " + libro1.getTitulo());
          } else {
              System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
          }
        //se realiza otro pr�stamo de libro1. En este caso no se podr� realizar ya que
          //solo hay un ejemplar de este libro y ya est� prestado. Se mostrar� por
          //pantalla el mensaje No quedan ejemplares del libro�
          if (libro1.prestamo()) {
              System.out.println("Se ha prestado el libro " + libro1.getTitulo());
          } else {
              System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
          }
          //mostrar los datos del objeto libro1
          System.out.println("Libro 1:");
          System.out.println("Titulo: " + libro1.getTitulo());
          System.out.println("Autor: " + libro1.getAutor());
          System.out.println("Ejemplares: " + libro1.getEjemplares());
          System.out.println("Prestados: " + libro1.getPrestados());
          System.out.println("Ahora lo mismo pero con el m�todo informarLibro");
          System.out.println(libro1.informarLibro());
          System.out.println();
          

          //mostrar los datos del objeto libro2
          System.out.println("Libro 2:");
          System.out.println("Titulo: " + libro2.getTitulo());
          System.out.println("Autor: " + libro2.getAutor());
          System.out.println("Ejemplares: " + libro2.getEjemplares());
          System.out.println("Prestados: " + libro2.getPrestados());
          System.out.println("Ahora lo mismo pero con el m�todo informarLibro");
          System.out.println(libro2.informarLibro());         
          System.out.println();
      }
      
      
  }

    

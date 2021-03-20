1.	Por favor, especifica tu nombre completo: Nicolás Martini Maestri
2.	¿C# permite herencia múltiple?
No, permite múltiples implementaciones de interfaces
3.	¿Cuándo utilizaría una Clase Abstracta en lugar de una Interfaz? Ejemplifique.
Cuando la clase abstracta necesite tener atributos que necesiten ser heredados por las clases hijas. Por ejemplo en este examen utilicé una clase abstracta para modelar Prenda de la que heredan Pantalon y Camisa. De esta forma puedo hacer que hereden los atributos precio, stock y calidad que les son comunes a esas clases.
4.	¿Qué implica una relación de Generalización entre dos clases?
Implica herencia. Se heredarán atributos y métodos de la clase padre. Los métodos pueden ser sobrescritos por las clases hijas.
5.	¿Qué implica una relación de Implementación entre una clase y una interfaz?
Implica que van a haber definidos una cantidad de métodos abstractos en la interfaz que si o si deben ser implementados en cada una de las clases hijas.
6.	¿Qué diferencia hay entre la relación de Composición y la Agregación?
Es una diferencia conceptual, la composición es una relación más fuerte que la agregación. Una composición implica que si el elemento contenedor de los objetos contenidos se destruye los elementos contenidos también. En cambio en la agregación los elementos contenidos pueden existir fuera del todo y también pueden formar parte de otros compuestos, cosa que en la composición no puede suceder.
7.	Indique V o F según corresponda. Diferencia entre Asociación y Agregación:
a.	V.Una diferencia es que la segunda indica la relación entre un “todo” y sus “partes”, mientras que en la primera los objetos están al mismo nivel contextual.
b.	F. Una diferencia es que la Agregación es de cardinalidad 1 a muchos mientras que la Asociación es de 1 a 1. 
c.	F. Una diferencia es que, en la Agregación, la vida o existencia de los objetos relacionados está fuertemente ligada, es decir que si “muere” el objeto contenedor también morirán las “partes”, en cambio en la Asociación los objetos viven y existen independientemente de la relación. 

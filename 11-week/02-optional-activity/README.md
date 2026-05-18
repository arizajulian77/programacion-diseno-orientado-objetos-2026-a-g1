# Respuestas 

## 1. ¿Qué validaste con IllegalArgumentException?

Con IllegalArgumentException validé que el código y el nombre del producto no estuvieran vacíos o nulos.  
También validé que el precio fuera mayor que cero.  
Estas validaciones se realizaron en el constructor de la clase Producto.  
El objetivo fue evitar que se crearan objetos con datos incorrectos dentro del sistema.  
De esta manera se garantiza que los productos tengan información válida antes de almacenarse en el inventario.

## 2. ¿Qué regla manejaste con excepción personalizada?

Con la excepción personalizada ProductoDuplicadoException manejé la regla de negocio de no permitir productos con códigos repetidos.  
Esta validación se realizó en la clase Inventario antes de agregar un producto a la lista.  
Si el código ya existía, se lanzaba la excepción para informar el error.  
Esto ayuda a mantener organizado el inventario y evitar inconsistencias en los datos.

## 3. ¿Dónde capturaste y por qué?

Las excepciones fueron capturadas en la clase App usando bloques try/catch.  
Se hizo allí porque es el punto principal de ejecución del programa.  
Gracias al manejo de excepciones, el sistema no se detiene cuando ocurre un error.  
Además, permite mostrar mensajes claros al usuario y continuar ejecutando el programa correctamente.

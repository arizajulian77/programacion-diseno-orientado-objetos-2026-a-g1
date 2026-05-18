# RESPUESTAS 

# 1¿Por qué usar ruta relativa? 
Se utilizó una ruta relativa (`data/productos.csv`) para que el programa funcione en cualquier computador sin depender de rutas específicas del sistema. Esto mejora la portabilidad del proyecto y facilita su ejecución en diferentes entornos. Además, permite mantener organizada la estructura del proyecto, ya que el archivo siempre estará dentro de la carpeta correspondiente.

# 2¿Cómo separaste modelo y persistencia?
Se aplicaron principios de Programación Orientada a Objetos separando responsabilidades. La clase `Producto` representa el modelo de datos, mientras que la clase `ArchivoProductos` gestiona la lectura y escritura del archivo. Esto hace que el código sea más ordenado, reutilizable y fácil de mantener.

# 3¿Cómo manejaste el caso de archivo inexistente? 
Se utilizó `Files.exists()` para verificar si el archivo existe. En caso de no existir, el programa inicia con una lista vacía sin generar errores. Además, se usa `Files.createDirectories()` para crear la carpeta y el archivo automáticamente al guardar, asegurando el correcto funcionamiento del sistema.

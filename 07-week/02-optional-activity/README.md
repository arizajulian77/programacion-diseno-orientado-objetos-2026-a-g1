# Explicación

El polimorfismo se aplicó utilizando una clase base llamada `Envio` con el método `calcularCosto()`, el cual es sobrescrito en cada subclase según el tipo de envío. En la clase base se definieron los atributos comunes como código y peso, ya que todos los envíos comparten esta información.

Las subclases `EnvioEstandar`, `EnvioExpress` y `EnvioInternacional` sobrescriben el método `calcularCosto()` para aplicar diferentes fórmulas de costo. Esto permite que cada tipo de envío tenga su propio comportamiento sin necesidad de usar condicionales.

En la clase `App` se utiliza una lista de tipo `Envio`, donde se almacenan diferentes tipos de envíos. Gracias al polimorfismo, se recorren los objetos y se ejecuta el método correspondiente según su tipo real.

Si se agrega un nuevo tipo de envío, solo sería necesario crear una nueva subclase y sobrescribir el método, sin modificar el código existente, lo que mejora la escalabilidad del sistema.

# Explicación del programa

En la clase `Persona` se definieron los atributos documento, nombre y correo porque representan la información básica común a cualquier tipo de persona dentro del sistema. Estos atributos se declararon como privados para aplicar el encapsulamiento y proteger los datos. Además, se implementaron getters y setters con validaciones para asegurar que la información ingresada sea correcta y evitar errores. También se incluyó un método para mostrar la información general.

En las subclases `Docente` y `Administrativo` se agregaron atributos específicos como área y cargo, respectivamente, porque son características propias de cada tipo de persona. Estas clases heredan de `Persona` para reutilizar los atributos y métodos ya definidos, evitando duplicar código. De esta manera, se aplica la herencia para organizar mejor el programa y permitir una estructura más clara y mantenible.

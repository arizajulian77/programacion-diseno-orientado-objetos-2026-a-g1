# Code Smells identificados

# 1. Números mágicos:
El código utilizaba valores numéricos directamente como 0.20, 0.10, 0.05 y 0.19 sin explicar su significado.

# 2. Variables poco descriptivas:
Variables como s, v, d y t dificultaban entender el propósito del código.

# 3. Método demasiado largo:
Toda la lógica estaba dentro del método main, lo que reducía la legibilidad y reutilización.

# 4. Uso de int en lugar de enum:
El tipo de cliente se manejaba con números enteros, generando menor claridad y mayor posibilidad de errores.

# 5. Duplicación de lógica:
El cálculo de descuentos se repetía varias veces.

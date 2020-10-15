# Ejercicio 1
Un almacén musical está formada por una casa central y varias sucursales. Cada sucursal
maneja el stock y catálogo de los artículos que posee con un sistema que Ud. debe
diseñar. El sistema de stock tiene como principal responsabilidad mantener la
información del stock de cada artículo, mantener el catálogo actualizado, generar
pedidos a la casa central de los artículos que se encuentran por debajo de su stock
mínimo y procesar los envíos que hace la casa central actualizando el stock de la
sucursal. La casa central envía regularmente a las sucursales información sobre el
catálogo de CDs. Las sucursales actualizan su catálogo a partir de esta información. En
el envío se especifica el código, la cantidad remitida, y el precio de lista del artículo. Una
sucursal puede definir stocks mínimos para algunos artículos. Periódicamente, el
operador del sistema de stock le pedirá al mismo que genere una orden de pedido a la
casa central de los artículos que se encuentran por debajo del stock mínimo,
especificando el código del artículo y la cantidad pedida. Cuando la sucursal recibe un
envío de CDs de la casa central, debe actualizar el stock de los artículos existentes, y
agregar los nuevos al stock de la sucursal. El catálogo deberá incluir los siguientes datos:
Código, título, intérprete y precio.
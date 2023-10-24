### Juan Sebastian Rodriguez Peña
## Arquitecturas Empresariales Parcial 2

Diseñé, construya y despliegue un aplicación web para investigar la conjetura de Collatz. El programa debe estar desplegado en un microcontenedor Docker corriendo en AWS. LAs tecnologías usadas en la solución deben ser maven, git, github, maven, sparkjava, html5, y js. No use liberías adicionales.

El primer paso a realizar fue crear la docker image y crear el volumen

<br>

![](images/1.png)

<br>

Creamos el contenedor y lo ponemos a correr en el puerto 34000 de la maquina

<br>

![](images/2.png)

<br>

Revisamos que se haya creado correctamente

<br>

![](images/3.png)


<br>
 


![](images/4.png)

<br>
 Se vera de esta manera

![](images/5.png)

<br>
Al momento de correr desde la url se vera asi

<br>
Y desde el index asi...

<br>

![](images/6.png)

<br>
Mas pruebas..
<br>


![](images/7.png)

<br>
En esta carpeta se encuentra el index


![](images/8.png)

<br>


![](images/9.png)

<br>
Realizamos la instalacion de docker y abrimos los puertos necesarios (al final corre en el 42000)

![](images/10.png)
![](images/11.png)
![](images/12.png)
![](images/13.png)

<br>
Y realizamos las pruebas desde aws

![](images/14.png)


![](images/15.png)
![](images/16.png)




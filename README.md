tp 1 Docker UTN
elegí java-maven porque son tecnologías que conozco. le sume springboot porque estaba empezando a aprender.

El servidor expuesto consta de 2 endpoint. uno con un formulario para ingresar un usuario, que se guardará en una base de datos mysql, y el otro donde se ven los usuarios guardados. 

Con respecto a los inputs y outputs, al ir ingresando usuarios, se veran los datos del usuario ingresado. cada vez que vaya al endpoint /usuario/all  se va a ver los nuevos usuarios ingresados. así que dependiendo de que se ingrese, se verán distintos usuarios ingresados.

los datos ingresados son persistidos en una base de datos mysql en el volumen creado en el compose.yaml

endpoints

http://localhost:8082/usuario/new
http://localhost:8082/usuario/all
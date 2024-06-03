# bibliotecaAPI
1.	Crear la excepción personalizada LibroException.

![image](https://github.com/SamanthaBermudezM/bibliotecaAPI/assets/148176004/baccdc69-a5cc-463d-93b4-64f974be5aa8)


2.	Añadir un ControllerAdvice global para manejar LibroException y enviar un estado NOT_FOUND con un mensaje personalizado.


![image](https://github.com/SamanthaBermudezM/bibliotecaAPI/assets/148176004/70f6795a-010d-4665-8c3d-81aa79d7dd59)


3.	Modificar LibroService para lanzar LibroException si un libro no se encuentra.

![image](https://github.com/SamanthaBermudezM/bibliotecaAPI/assets/148176004/cfeef0ac-7e89-4544-a342-5625a017717b)


4.	Modificar LibroController para enviar un estado CREATED (201) cuando se crea un nuevo libro.

![image](https://github.com/SamanthaBermudezM/bibliotecaAPI/assets/148176004/15232020-2f00-408a-87b3-853cab290fcd)











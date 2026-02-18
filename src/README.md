
Un commit guarda: autor, fecha, mensaje descriptivo y una referencia a los cambios realizados.

---

## 5. Diferencia entre git pull y git fetch
- **git fetch:** Descarga los cambios del repositorio remoto pero no los une automáticamente.
- **git pull:** Descarga los cambios y los combina con tu rama actual.

---

## 6. ¿Qué es un branch y cómo funciona?
Una rama es una línea de trabajo independiente dentro del proyecto.  
Git usa punteros que señalan al último commit de cada rama.

---

## 7. ¿Cómo se hace un merge y qué conflictos pueden aparecer?
Se usa:


---

Puede haber conflictos si dos personas modificaron la misma parte del archivo.  
Se resuelven editando el archivo manualmente y luego haciendo commit.

---

## 8. ¿Cómo funciona git add y qué pasa si lo omito?
`git add` envía los cambios al área de preparación.  
Si no lo usas, los cambios no se incluirán en el commit.

---

## 9. ¿Qué es .gitignore?
Es un archivo donde se indican los archivos que Git no debe seguir, como archivos temporales o compilados.

---

## 10. Diferencia entre --amend y un nuevo commit
- `git commit --amend` modifica el último commit.
- Un nuevo commit crea un registro adicional en el historial.

---

## 11. ¿Qué es git stash y cuándo usarlo?
Guarda cambios temporales sin hacer commit.  
Es útil cuando necesitas cambiar de rama rápidamente sin perder tu trabajo.

---

## 12. ¿Cómo deshacer cambios en Git?
- `git reset`: Mueve el historial hacia atrás.
- `git revert`: Crea un commit que deshace otro.
- `git checkout`: Permite volver a una versión anterior de un archivo.

---

## 13. ¿Qué son origin y upstream?
- **origin:** Es el repositorio remoto principal.
- **upstream:** Es el repositorio original cuando trabajas con un fork.

Se usan comandos como:



## 14. ¿Cómo ver el historial?
- `git log`
- `git diff`
- `git show`

---

# PROGRAMACIÓN

## 15. Tipos de datos primitivos en Java
int, double, float, char, boolean, byte, short y long.

---

## 16. ¿Cómo funcionan if, else, switch y bucles?
- **if y else** permiten tomar decisiones.
- **switch** evalúa varios casos posibles.
- **Bucles (for, while, do while)** repiten instrucciones mientras se cumpla una condición.

---

## 17. ¿Por qué usar nombres significativos?
Porque hacen que el código sea más claro, fácil de entender y mantener.

---

## 18. ¿Qué es la POO?
Es una forma de programar basada en objetos que combinan datos y funciones.

---

## 19. Cuatro pilares de la POO
Encapsulamiento, abstracción, herencia y polimorfismo.

---

## 20. ¿Qué es la herencia en Java?
Permite que una clase herede características de otra usando la palabra clave:


---

## 21. Modificadores de acceso en Java
- **public:** accesible desde cualquier lugar.
- **private:** solo dentro de la misma clase.
- **protected:** dentro del mismo paquete o clases hijas.

---

## 22. ¿Qué es una variable de entorno?
Es un valor configurado en el sistema operativo que los programas pueden usar para obtener información, como rutas o configuraciones.

# TRABAJO TEÓRICO - GIT



## 1. ¿Qué es un repositorio en Git?
Un repositorio es una carpeta de proyecto gestionada por Git que guarda los archivos y su historial de cambios en la carpeta oculta .git.  
Permite controlar versiones, trabajar con ramas y colaborar con otras personas.

---

## 2. Tres áreas principales de Git
- **Working Directory:** Donde se modifican los archivos.
- **Staging Area:** Donde se preparan los cambios antes del commit.
- **Repository:** Donde se guardan definitivamente los commits.

---

## 3. ¿Cómo representa Git los cambios?
Git usa objetos:
- Blob (contenido del archivo)
- Tree (estructura de carpetas)
- Commit (punto del historial)
- Tag (marca de versión)

---

## 4. ¿Cómo se crea un commit?
Se utiliza:
git add .
git commit -m "mensaje"

Un commit guarda autor, fecha y descripción de los cambios.


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
Se usa:Puede haber conflictos si dos personas modificaron la misma parte del archivo.  
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



## 14. ¿Cómo ver el historial?
- `git log`
- `git diff`
- `git show`


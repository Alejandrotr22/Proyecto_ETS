 # Diagrama de Casos de Uso

## 1.Introducción 

RolADice es un joven proyecto diseñado por y para jugadores de rol, creado para utilizar o crear dados virtuales o consultar los manuales del rol que quieres jugar.

## 2.Diagrama de Casos de Uso

<div align="center">
<img width="60%" src="https://github.com/Alejandrotr22/Proyecto_ETS/blob/main/diagramas/diagrama%20de%20casos%20de%20uso/RolADice%20CU.png?raw=true">
</div>

## 3.Especificación de los Casos de Uso

### 3.1 Especificación de los Actores

#### 3.1.1 Jugador


| Actor |        **Jugador**           |
|-------|------------------------------|
|Descripción|Un Jugador de rol quiere poder lanzar dados virtuales y consultar manuales. |
|Características|Ninguna|
|Relacions|Ninguna relación con otro actor.|
|Referencias|Crear set de dados, Elegir el rol, Consultar manual, Lanzar dados, Crear dados, eliminar dados, Crear usuario, Eliminar usuario|
|Notas||
|Autor|Alejandro Toste y Oliver Perez|
|Fecha|09/03/22|

### 3.2 Especificación de los Casos de Uso

#### 3.2.1 Elegir usuario

| Caso de Uso Cu |        **Elegir Usuario**           |
|----------------|-------------------------------------|
|Fuentes| |
|Actor|Jugador|
|Descripción|El jugador crea un set de dados que almacenan una cierta cantidad de dados.|
|Flujo básico|El jugador elegido, puede crear un set de dados propios con el fin de guardar sus dados creados.|
|Pre-condiciones|Elegir usuario|
|Post-condiciones|Ninguna.|
|Requerimientos trazados|Usuarios Existentes|
|Notas||

#### 3.2.2 Crear usuario

| Caso de Uso Cu |        **Crear Usuario**           |
|----------------|-------------------------------------|
|Fuentes| |
|Actor|Jugador|
|Descripción|El jugador elige un usuario.|
|Flujo básico|El jugador elige un usuario para acceder a los roles que tiene y sus sets de dados. |
|Pre-condiciones|Ninguna.|
|Post-condiciones|Ninguna.|
|Requerimientos trazados||
|Notas|Un usuario posee sets de dados y roles que ha elegido.|

#### 3.2.3 Eliminar usuario

| Caso de Uso Cu |        **Eliminar Usuario**           |
|----------------|-------------------------------------|
|Fuentes| |
|Actor|Jugador|
|Descripción|El jugador elimina un usuario.|
|Flujo básico|El jugador elimina un usuario y toda su información contenida.|
|Pre-condiciones|Ninguna.|
|Post-condiciones|Ninguna.|
|Requerimientos trazados|Usuarios existentes.|
|Notas||

#### 3.2.4 Crear Set de Dados

| Caso de Uso Cu |        **Crear Set de Dados**           |
|----------------|-------------------------------------|
|Fuentes| |
|Actor|Jugador|
|Descripción|El jugador crea un set de dados que almacenan una cierta cantidad de dados.|
|Flujo básico|El jugador elegido, puede crear un set de dados propios con el fin de guardar sus dados creados.|
|Pre-condiciones|Elegir usuario|
|Post-condiciones|Ninguna.|
|Requerimientos trazados||
|Notas|Un set de dados es un conjunto de estos necesarios para un juego de rol.|

#### 3.2.5 Elegir rol

| Caso de Uso Cu |        **Elegir Rol**           |
|----------------|-------------------------------------|
|Fuentes| |
|Actor|Jugador|
|Descripción|El jugador elige un rol.|
|Flujo básico|El jugador elige un rol para acceder a sus sets de dados predeterminados o consultar la información o fichas.|
|Pre-condiciones|Elegir usuario|
|Post-condiciones|Ninguna.|
|Requerimientos trazados|Roles creados previamente.|
|Notas||

#### 3.2.6 Elegir rol

| Caso de Uso Cu |        **Lanzar dado**           |
|----------------|-------------------------------------|
|Fuentes| |
|Actor|Jugador|
|Descripción|El jugador lanza un dado.|
|Flujo básico|El jugador lanza un dado del set de dados elegido, dando un valor aleatorio.|
|Pre-condiciones|Elegir set de dados o elegir rol.|
|Post-condiciones|Ninguna.|
|Requerimientos trazados|Haber dados que lanzar.|
|Notas|Los dados dan valores aleatorios puestos cuando se crean y no solo pueden dar números.|

#### 3.2.7 Elegir rol

| Caso de Uso Cu |        **Crear dado**           |
|----------------|-------------------------------------|
|Fuentes| |
|Actor|Jugador|
|Descripción|El jugador crea un dado con ciertos parámetros.|
|Flujo básico|El jugador crea un dado con el número de caras y el valor de esas caras para poder guardarlo en el set de dados.|
|Pre-condiciones|Elegir set de dados o elegir rol.|
|Post-condiciones|Ninguna.|
|Requerimientos trazados||
|Notas||

#### 3.2.8 Eliminar rol

| Caso de Uso Cu |        **Eliminar dado**           |
|----------------|-------------------------------------|
|Fuentes| |
|Actor|Jugador|
|Descripción|El jugador elimina un dado de un set de dados.|
|Flujo básico|El jugador elimina un dado del set de dados elegido.|
|Pre-condiciones|Elegir set de dados o elegir rol.|
|Post-condiciones|Ninguna.|
|Requerimientos trazados|Haber roles creados previamente.|
|Notas||

#### 3.2.9 Eliminar rol

| Caso de Uso Cu |        **Consultar manual**           |
|----------------|-------------------------------------|
|Fuentes| |
|Actor|Jugador|
|Descripción|El jugador consulta los manuales o fichas importantes del rol seleccionado.|
|Flujo básico|El jugador  tras elegir el rol que desea jugar consulta los manuales o fichas importantes del rol.|
|Pre-condiciones|Elegir set de dados o elegir rol.|
|Post-condiciones|Ninguna.|
|Requerimientos trazados|Haber roles creados previamente.|
|Notas||



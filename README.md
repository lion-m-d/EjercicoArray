# EjercicoArray



## Pre-Requisitos


* Java 8 (Instalado y Configurado)

* lombok (Instalado y Configurado en el IDE)

* IDE para compilar proyectos Java (Instalado y Configurado en este caso use STS)

* Maven para repositorio de dependencias (Instalado y Configurado)

## Instalación

_Copiar lo siguiente y en una terminar git ejecutar el siguiente comando_

```
git clone https://github.com/lion-m-d/EjercicoArray.git

```

_Dirigirse al IDE y importar el archivo_

_Luego ejecutar el siguiente comando en una consola cmd o git en la ruta del proyecto ejemplo C:\EjercicoArray/..._

```
mvn clean install
```
_Dirigirse al IDE darle click Izquierdo -> Maven -> Update Project -> Seleccionar Proyecto -> Force Update os Snapshots... -> darle click en OK 
o si estas en cualquier otro IDE actualizar las dependecias del maven para que pueda importarse al proyecto._

## Ejecución

* Dentro del IDE buscar el main que se encuentra en la clase EjercicoArrayApplication.java darle click derecho y hacer correr programa (Run as Java Application) 

* Para configurar la con la que se va consumir la api resources/application.properties (modificar variable application.url)

* Para configura puerto resources/application.properties


## Probar Api 

* El api solo Recibira arrays de 2 x 2 o de 3 x 3 (validado internamente)

* Dirigirse al PostMan y colocar la siguiente ruta localhost:8080/api/rotar/matriz (Metodo Post, si cambian el puerto tambien modificarlo en la ruta)

* Matriz 2 x 2

```
[
    [
        1,2
    ],
    [
       3,4
    ]
]

```

* Matriz 3 x 3

```
[
    [
        1,2,3
    ],
    [
       4,5,6
    ]
    ,
    [
       7,8,9
    ]
]

```






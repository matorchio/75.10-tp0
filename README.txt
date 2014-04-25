75.10 Técnicas de Diseño - Trabajo Práctico 0
Alumno: Torchio, Mariano
Padrón: 85998
Cuatrimestre: 1ºC 2014

Análisis del impacto de agregar una movida al juego:
    Para agregar la movida Fire al juego solo fue necesario
     crear dicha clase (con sus respectivos métodos) y 
     actualizar las demás para que puedan interactuar con ella.

Antes de realizar los cambios se pensaron las siguientes alternativas de diseño:

+ Agregar la interfaz Move y utilizar Double Dispatch: 
    Se descartó debiado a que no presentaba ninguna ventaja frente 
      al diseño actual.

+ Agregar una Tabla con las reglas del juego: 
    Esta alternativa era bastante tentadora, sin embargo considerando 
     que solo se planea agregar esta movida al juego y ninguna otra 
     se descartó debido al esfuerzo que requería implementarla 
     correctamente (cargando las reglas de un XML por ejemplo para 
     maximizar la escalabilidad del juego). Si se planeasen agregar 
     muchas más movidas definitivamente esta sería una opción muy 
     interesante para implementar.

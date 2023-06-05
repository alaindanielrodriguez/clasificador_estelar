:- dynamic corrimiento_rojo/2.
:- dynamic filtro_verde/2.
:- dynamic filtro_ultravioleta/2.
:- dynamic filtro_infrarrojo/2.
:- dynamic filtro_infrarrojo_cercano/2.




nodo1(X):-
	corrimiento_rojo(X, CR),
        CR > 0.004153.

nodo2(X):-
       nodo1(X),
       corrimiento_rojo(X, CR),
       CR =< 1.001032.

nodo3(X):-
       nodo2(X),
       corrimiento_rojo(X, CR),
       CR =< 0.684604.
       
nodo4(X):-
       nodo3(X),
       filtro_infrarrojo(X, FI),
       FI =< 19.75569.

nodo5(X):-
          nodo4(X),
          filtro_ultravioleta(X, FU),
          FU =< 21.95424.


nodo6(X):-
          nodo5(X),
          not(clase(X, galaxia)).

nodo7(X):-
          nodo3(X),
          not(nodo4(X)).

nodo8(X):-
          nodo7(X),
          filtro_verde(X, FV),
          FV =< 22.08688.

nodo9(X):-
          nodo8(X),
          not(clase(X, galaxia)).

nodo10(X):-
        nodo2(X),
        not(nodo3(X)).


nodo11(X):-
           nodo10(X),
           filtro_verde(X, FV),
           FV =< 21.78876.

nodo12(X):-
           nodo11(X),
           not(clase(X, cuasar)).

nodo13(X):-
        nodo1(X),
        not(nodo2(X)).
       
nodo14(X):-
        nodo13(X),
        not(clase(X, cuasar)).







clase(X, estrella):-
         corrimiento_rojo(X, CR),
         CR =< 0.004153,
         !.
         
clase(X, galaxia):-
         nodo10(X),
         not(nodo11(x)),
         !.
         
clase(X, galaxia):-
         nodo14(X),
         corrimiento_rojo(X, CR),
         CR =< 1.214563,
         !.
         
clase(X, galaxia):-
         nodo4(X),
         not(nodo5(X)),
         !.

clase(X, galaxia):-
         nodo7(X),
         not(nodo8(X)),
         !.

clase(X, galaxia):-
         nodo5(X),
         corrimiento_rojo(X, CR),
         CR =< 0.310964,
         !.

clase(X, galaxia):-
         nodo8(X),
         corrimiento_rojo(X, CR),
         CR =< 0.399278,
         !.

clase(X, galaxia):-
         nodo12(X),
         filtro_infrarrojo_cercano(X, FIC),
         FIC =< 20.5647,
         !.

clase(X, galaxia):-
         nodo9(X),
         not(clase(X, cuasar)),
         !.

clase(X, galaxia):-
         nodo6(X),
         not(clase(X, cuasar)),
         !.
         
clase(X, cuasar):-
         nodo14(X),
         !.
         
clase(X, cuasar):-
         nodo13(X),
         filtro_verde(X, FV),
         FV =< 22.20807,
         !.
         
clase(X, cuasar):-
         nodo11(X),
         filtro_ultravioleta(X, FU),
         FU =< 21.62963,
         !.
         
clase(X, cuasar):-
         nodo12(X),
         not(clase(X, galaxia)),
         !.
         
clase(X, cuasar):-
         nodo6(X),
         filtro_ultravioleta(X, FU),
         FU =< 20.76524,
         !.
         
clase(X, cuasar):-
         nodo9(X),
         filtro_verde(X, FV),
         FV =< 21.41246,
         !.
         


         



         

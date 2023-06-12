:- dynamic corrimiento_rojo/2.
:- dynamic filtro_verde/2.
:- dynamic filtro_ultravioleta/2.
:- dynamic filtro_infrarrojo/2.
:- dynamic filtro_infrarrojo_cercano/2.

clase(X, estrella):-
         corrimiento_rojo(X, CR),
         CR =<0.004153,
         !.

clase(X, galaxia):-
         corrimiento_rojo(X, CR),
         CR =<1.001032,
         CR =< 0.684604,
         filtro_infrarrojo(X, FI),
         FI =< 19.75569,
         filtro_ultravioleta(X, FU),
         FU =< 21.95424,
         CR =< 0.310964,
         !.
         
clase(X, cuasar):-
         corrimiento_rojo(X, CR),
         CR =<1.001032,
         CR =< 0.684604,
         filtro_infrarrojo(X, FI),
         FI =< 19.75569,
         filtro_ultravioleta(X, FU),
         FU =< 21.95424,
         FU =< 20.76524,
         !.
         
clase(X, galaxia):-
         corrimiento_rojo(X, CR),
         CR =<1.001032,
         CR =< 0.684604,
         filtro_infrarrojo(X, FI),
         FI =< 19.75569,
         filtro_ultravioleta(X, FU),
         FU =< 21.95424,
         !.
         
clase(X, galaxia):-
         corrimiento_rojo(X, CR),
         CR =<1.001032,
         CR =< 0.684604,
         filtro_infrarrojo(X, FI),
         FI =< 19.75569,
         !.

clase(X, galaxia):-
         corrimiento_rojo(X, CR),
         CR =<1.001032,
         CR =< 0.684604,
         filtro_verde(X, FV),
         FV =< 22.08688,
         CR =< 0.399278,
         !.
         
clase(X, cuasar):-
         corrimiento_rojo(X, CR),
         CR =<1.001032,
         CR =< 0.684604,
         filtro_verde(X, FV),
         FV =< 22.08688,
         FV =< 21.41246,
         !.
         
clase(X, galaxia):-
         corrimiento_rojo(X, CR),
         CR =<1.001032,
         CR =< 0.684604,
         filtro_verde(X, FV),
         FV =< 22.08688,
         !.
         
clase(X, galaxia):-
         corrimiento_rojo(X, CR),
         CR =<1.001032,
         CR =< 0.684604,
         !.
         
clase(X, cuasar):-
         corrimiento_rojo(X, CR),
         CR =<1.001032,
         filtro_verde(X, FV),
         FV =< 21.78876,
         filtro_ultravioleta(X, FU),
         FU =< 21.62963,
         !.
         
clase(X, galaxia):-
         corrimiento_rojo(X, CR),
         CR =<1.001032,
         filtro_verde(X, FV),
         FV =< 21.78876,
         filtro_infrarrojo_cercano(X, FIC),
         FIC =< 20.5647,
         !.
         
clase(X, cuasar):-
         corrimiento_rojo(X, CR),
         CR =<1.001032,
         filtro_verde(X, FV),
         FV =< 21.78876,
         !.
         
clase(X, galaxia):-
         corrimiento_rojo(X, CR),
         CR =<1.001032,
         !.
         
clase(X, cuasar):-
          filtro_verde(X, FV),
          FV =< 22.20807,
          !.
         
clase(X, galaxia):-
         corrimiento_rojo(X, CR),
         CR =< 1.214563,
         !.
         
clase(_, cuasar).
         




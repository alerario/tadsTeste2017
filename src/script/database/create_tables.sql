CREATE TABLE public.cidade
(
  codigo integer NOT NULL,
  nome character varying(40),
  CONSTRAINT pk_cid PRIMARY KEY (codigo)
);
CREATE TABLE public.cliente
(
   codigo integer, 
   nome character varying(60), 
   cidade integer, 
   CONSTRAINT pk_cli PRIMARY KEY (codigo), 
   CONSTRAINT fg_cid FOREIGN KEY (cidade) REFERENCES public.cidade (codigo) ON UPDATE NO ACTION ON DELETE NO ACTION
) ;
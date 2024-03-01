-- public.departamento definition

-- Drop table

-- DROP TABLE public.departamento;

CREATE TABLE public.departamento (
	nome text NOT NULL,
	diretor text NOT NULL,
	id_departamento int4 GENERATED ALWAYS AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
	CONSTRAINT departamento_pk PRIMARY KEY (id_departamento)
);

-- public.pessoa definition

-- Drop table

-- DROP TABLE public.pessoa;

CREATE TABLE public.pessoa (
	nome text NOT NULL,
	email text NULL,
	telefone text NULL,
	senha text NOT NULL,
	primeiro_acesso bool NOT NULL,
	id_pessoa uuid DEFAULT uuid_generate_v4() NOT NULL,
	CONSTRAINT pessoa_pkey PRIMARY KEY (id_pessoa)
);


-- public.professor definition

-- Drop table

-- DROP TABLE public.professor;

CREATE TABLE public.professor (
	matricula_professor text NOT NULL,
	id_departamento int4 GENERATED ALWAYS AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE) NOT NULL,
	CONSTRAINT professor_pk PRIMARY KEY (id_pessoa),
	CONSTRAINT professor_unique UNIQUE (id_pessoa)
)
INHERITS (public.pessoa);


-- public.professor foreign keys

ALTER TABLE public.professor ADD CONSTRAINT professor_departamento_fk FOREIGN KEY (id_departamento) REFERENCES public.departamento(id_departamento);
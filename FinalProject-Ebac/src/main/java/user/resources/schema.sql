CREATE TABLE public.usuarios
(
    id bigint NOT NULL,
    nome character varying(100) NOT NULL,
    email character varying(100) NOT NULL,
    data_cadastro date NOT NULL DEFAULT CURRENT_DATE,
    CONSTRAINT pk_user PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.usuarios
    OWNER to postgres;
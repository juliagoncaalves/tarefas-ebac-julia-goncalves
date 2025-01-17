CREATE TABLE public.meme
(
    id bigint NOT NULL,
    nome character varying(255) NOT NULL,
    descricao character varying(255) NOT NULL,
    data_cadastro date NOT NULL DEFAULT CURRENT_DEFAULT,
    url character varying(255) NOT NULL,
    categoria_meme_id bigint,
    usuario_id bigint,
    CONSTRAINT pk_meme PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.meme
    OWNER to postgres;
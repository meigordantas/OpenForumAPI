--DROP TABLE TB_USER;

create table tb_user ( 
	user_id uuid default uuid_generate_v1(),
	user_alias varchar NOT NULL,
	first_name varchar NOT NULL,
	last_name varchar NOT NULL,
	user_email varchar NOT NULL
);

ALTER TABLE TB_USER 
ADD CONSTRAINT tb_user_unq_user_alias UNIQUE (user_alias);

ALTER TABLE TB_USER 
ADD CONSTRAINT tb_user_unq_user_email UNIQUE (user_email);





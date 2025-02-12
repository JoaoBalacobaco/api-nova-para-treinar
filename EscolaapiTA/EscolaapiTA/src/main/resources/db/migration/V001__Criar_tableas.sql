Create table curso (
    id int not null primary key auto_increment,
    nomecurso varchar(100)
);

Create table aluno(
    id int not null primary key auto_increment,
    nome varchar(100),
    curso_id int
);
alter table aluno add constraint FK_curso_aluno foreign key (curso_id) references curso(id);
create table if not exists student
(
    id          bigint                              not null
        primary key,
    clazz       varchar(16)                         null,
    teacher_id  bigint                              null,
    group     int                                 null,
    topic       varchar(45)                         null,
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP
);

create index student_teacher_id_index
    on student (teacher_id);

create table if not exists student_task
(
    id          bigint                              not null
        primary key,
    task_id     bigint                              not null,
    description varchar(45)                         null,
    filename    varchar(45)                         null,
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP,
    student_id  bigint                              null
);

create index student_task_task_id_index
    on student_task (task_id);

create index student_task_user_id_index
    on student_task (student_id);

create table if not exists task
(
    id                bigint                              not null
        primary key,
    title             varchar(45)                         not null,
    description       varchar(45)                         null,
    start_time        datetime                            null,
    end_time          datetime                            null,
    type              int                                 not null,
    status            int                                 not null,
    target            int                                 not null,
    teacher_id        bigint                              not null,
    filename          varchar(45)                         null,
    upload_regex_name varchar(45)                         null,
    ext_name          varchar(16)                         null,
    update_time       timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP
);

create table if not exists teacher
(
    id          bigint                              not null
        primary key,
    group       int                                 null,
    title       varchar(8)                          null,
    quantity    int                                 null,
    description varchar(100)                        null,
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP
);

create table if not exists teacher_suggestion
(
    id          bigint                              not null
        primary key,
    teacher_id  bigint                              not null,
    student_id  bigint                              not null,
    task_id     bigint                              not null,
    suggestion  varchar(45)                         null,
    update_time timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP
);

create table if not exists user
(
    id          bigint                              not null
        primary key,
    number      varchar(12)                         not null,
    name        varchar(8)                          not null,
    role        int                                 not null,
    update_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP,
    password    varchar(65)                         not null,
    unique (number)
);


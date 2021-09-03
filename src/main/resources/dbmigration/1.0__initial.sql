-- apply changes
create table user (
  id                            bigint auto_increment not null,
  deleted_at                    datetime(6),
  open_id                       varchar(255),
  nick_name                     varchar(255),
  avatar_url                    varchar(255),
  created_at                    datetime(6) not null,
  updated_at                    datetime(6) not null,
  constraint pk_user primary key (id)
);


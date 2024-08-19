create database dictionary;
       use dictionary;
create table dictionary(
    id int auto_increment primary key ,
    english varchar(255),
    vietnamese varchar(255)
);
insert into dictionary(english, vietnamese)  values ('name','tên');
insert into dictionary(english, vietnamese)  values ('age','tuổi');
insert into dictionary(english, vietnamese)  values ('apple','táo');
insert into dictionary(english, vietnamese)  values ('hello','xin chào');
insert into dictionary(english, vietnamese)  values ('bye','tạm biệt');
insert into dictionary(english, vietnamese)  values ('table','bàn');
insert into dictionary(english, vietnamese)  values ('mango','xoài');
insert into dictionary(english, vietnamese)  values ('water melon','dưa hấu');
insert into dictionary(english, vietnamese)  values ('lemon','quả chanh');

select * from dictionary where english = ?;
use application registry;

INSERT INTO Users(Neptuncode,Password,Age,FirstName,LastName,Email,IsTeacher,Enabled) VALUES
('NUZIHJ','RandomPW','28','Balázs','Lukács',false,true,),
('HEYSUG','RandomPW2','19','Géza','Üski',false,true,),
('OZROTT','RandomPW3','21','Sándor','Antal',false,true,);

INSERT INTO Templates(Title,Value,Recipient) VALUES
('Dékáni Kérvény','Specifikált kérés','Dékáni hivatal'),
('Rektori Kérvény','Specifikált kérés','Rektori hivatal'),
('Átjelentkezési Kérvény','Okok','Tanulmányi Osztály');

INSERT INTO Request(ID, UserID,TemplateTitle,Comment,Status) VALUES
(1,'NUZIHJ','Dékáni Kérvény','elutasítandó,rektorihoz','Elbírálva'),
(2,'HEYSUG','Rektori Kérvény','Támogatom','Elbírálva'),
(3,'OZROTT','Átjelentkezési Kérvény','Támogatom','Elbírálva'),
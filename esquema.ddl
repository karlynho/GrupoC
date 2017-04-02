CREATE TABLE ANUNCIO (ID INTEGER NOT NULL, DURACION VARCHAR(255), PREFERENCIA VARCHAR(255), EVENTO_ID INTEGER, PRIMARY KEY (ID))
CREATE TABLE EVENTO (ID INTEGER NOT NULL, CATEGORIA VARCHAR(255), DESCRIPCION VARCHAR(255), FECHA_FINAL DATE, FECHA_INICIO DATE, NOMBRE VARCHAR(255), PRECIO VARCHAR(255), UBICACION VARCHAR(255), PERIODISTA_ID INTEGER, VIDEO_ID INTEGER, PRIMARY KEY (ID))
CREATE TABLE FORMULARIO (ID INTEGER NOT NULL, CATEGORIA VARCHAR(255), DESCRIPCION VARCHAR(255), ESTADO VARCHAR(255), FECHA_FIN DATE, FECHA_INICIO DATE, FECHA_SUBIDA DATE, NOMBRE VARCHAR(255), PERIODISTA_ID INTEGER, USUARIO_NICK VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE IMAGEN (ID INTEGER NOT NULL, TIPO VARCHAR(255), EVENTO_ID INTEGER, PRIMARY KEY (ID))
CREATE TABLE MEGUSTA (ID INTEGER NOT NULL, EVENTO_ID INTEGER, USUARIO_NICK VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE PERIODISTA (ID INTEGER NOT NULL, AMBITO VARCHAR(255), APELLIDOS VARCHAR(255), CONTRASEÑA VARCHAR(255), EMAIL VARCHAR(255), FECHA_NACIMIENTO VARCHAR(255), NICK VARCHAR(255), NOMBRE VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE USUARIO (NICK VARCHAR(255) NOT NULL, APELLIDOS VARCHAR(255), CONTRASEÑA VARCHAR(255), EMAIL VARCHAR(255), FECHA_NACIMIENTO VARCHAR(255), NOMBRE VARCHAR(255), PRIMARY KEY (NICK))
CREATE TABLE VALORACION (ID INTEGER NOT NULL, COMENTARIO VARCHAR(255), PUNTUACION FLOAT, EVENTO_ID INTEGER, USUARIO_NICK VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE VIDEO (ID INTEGER NOT NULL, DURACION VARCHAR(255), TIPO VARCHAR(255), EVENTO_ID INTEGER, PRIMARY KEY (ID))
ALTER TABLE ANUNCIO ADD CONSTRAINT ANUNCIO_EVENTO_ID FOREIGN KEY (EVENTO_ID) REFERENCES EVENTO (ID)
ALTER TABLE EVENTO ADD CONSTRAINT EVENTOPERIODISTAID FOREIGN KEY (PERIODISTA_ID) REFERENCES PERIODISTA (ID)
ALTER TABLE EVENTO ADD CONSTRAINT FK_EVENTO_VIDEO_ID FOREIGN KEY (VIDEO_ID) REFERENCES VIDEO (ID)
ALTER TABLE FORMULARIO ADD CONSTRAINT FRMULARIOSARIONICK FOREIGN KEY (USUARIO_NICK) REFERENCES USUARIO (NICK)
ALTER TABLE FORMULARIO ADD CONSTRAINT FRMLARIOPRODISTAID FOREIGN KEY (PERIODISTA_ID) REFERENCES PERIODISTA (ID)
ALTER TABLE IMAGEN ADD CONSTRAINT IMAGEN_EVENTO_ID FOREIGN KEY (EVENTO_ID) REFERENCES EVENTO (ID)
ALTER TABLE MEGUSTA ADD CONSTRAINT MEGUSTA_EVENTO_ID FOREIGN KEY (EVENTO_ID) REFERENCES EVENTO (ID)
ALTER TABLE MEGUSTA ADD CONSTRAINT MEGUSTAUSUARIONICK FOREIGN KEY (USUARIO_NICK) REFERENCES USUARIO (NICK)
ALTER TABLE VALORACION ADD CONSTRAINT VALORACIONEVENTOID FOREIGN KEY (EVENTO_ID) REFERENCES EVENTO (ID)
ALTER TABLE VALORACION ADD CONSTRAINT VLORACIONSARIONICK FOREIGN KEY (USUARIO_NICK) REFERENCES USUARIO (NICK)
ALTER TABLE VIDEO ADD CONSTRAINT FK_VIDEO_EVENTO_ID FOREIGN KEY (EVENTO_ID) REFERENCES EVENTO (ID)
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(15), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)
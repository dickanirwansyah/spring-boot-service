create table buku(
    idbuku varchar(255) not null,
    judul varchar(255) not null,
    pengarang varchar(255) not null,
    penerbit varchar(255) not null,
    jumlah_halaman int not null,
    jumlah int not null,
    validated boolean,

    CONSTRAINT pk_buku_idbuku PRIMARY KEY (idbuku)
);



create table pinjam(
    idpinjam varchar(255) not null,
    tanggal date not null,
    nama_siswa varchar(255) not null,
    alamat_siswa varchar(255) not null,
    notelp_siswa varchar(255) not null,

    CONSTRAINT pk_siswa_idsiswa PRIMARY KEY (idpinjam)
);

create table pinjam_detil(
    idpinjamdetil int not null auto_increment,
    idpinjam varchar(255) not null,
    idbuku varchar(255) not null,
    jumlah_pinjam int not null,
    tanggal_balik date not null,

    CONSTRAINT pk_pinjam_detil PRIMARY KEY (idpinjamdetil),
    CONSTRAINT fk_pinjam_detil_idbuku FOREIGN KEY (idbuku)
    REFERENCES buku (idbuku),
    CONSTRAINT fk_pinjam_detil_idpinjam FOREIGN KEY (idpinjam)
    REFERENCES pinjam (idpinjam)
);
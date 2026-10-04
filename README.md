# FutsalApp

Aplikasi Sistem Informasi Lapangan Futsal berbasis Java Swing dan MySQL.

Project ini dibuat untuk memenuhi tugas **Pemrograman II – Pertemuan 5–7**.

## Tentang Project

FutsalApp Syahril merupakan aplikasi sederhana untuk mengelola data lapangan futsal. Aplikasi digunakan untuk menginput, menyimpan, melihat, mengubah, dan menghapus data lapangan.

## Teknologi

- Java
- Java Swing
- NetBeans IDE
- MySQL
- MySQL Connector/J
- JDK 21

## Fitur

- Input data lapangan
- Menyimpan data lapangan
- Menampilkan data lapangan
- Mengubah data lapangan
- Menghapus data lapangan
- Menampilkan tipe lapangan
- Menampilkan status lapangan
- Cetak laporan data lapangan

## Struktur Project

~~~
FutsalApp_Syahril/
├── nbproject/
├── src/
│   ├── futsalapp/
│   │   ├── FutsalFrame.java
│   │   ├── FutsalFrame.form
│   │   ├── Koneksi.java
│   │   ├── Lapangan.java
│   │   ├── lihat_lapangan.java
│   │   ├── lihat_lapangan.form
│   │   └── logo.png
│   │
│   ├── futsalapp_syahril/
│   │   └── FutsalApp_Syahril.java
│   │
│   └── index/
│       ├── home.java
│       └── home.form
│
├── build.xml
├── manifest.mf
└── .gitignore
~~~

## Database

Aplikasi menggunakan **MySQL** sebagai database untuk menyimpan data lapangan futsal.

### Data Lapangan

| Field | Keterangan |
|---|---|
| ID Lapangan | Identitas lapangan |
| Nama Lapangan | Nama lapangan |
| Tipe Lapangan | Indoor / Outdoor |
| Harga | Harga sewa per jam |
| Status | Tersedia / Tidak Tersedia |

## Cara Menjalankan

### 1. Clone Repository

~~~bash
git clone https://github.com/DevLabsss/FutsalApp_Syahril.git
~~~

### 2. Buka Project

Buka project menggunakan **NetBeans IDE**.

### 3. Jalankan MySQL

Jalankan **MySQL melalui XAMPP**.

### 4. Konfigurasi Database

Sesuaikan konfigurasi koneksi database pada:

~~~text
src/futsalapp/Koneksi.java
~~~

### 5. Jalankan Aplikasi

Buka project di NetBeans, kemudian jalankan aplikasi.

## Author

**Achmad Syahril Fauzi**

GitHub: [DevLabsss](https://github.com/DevLabsss)

---

© 2026 Achmad Syahril Fauzi

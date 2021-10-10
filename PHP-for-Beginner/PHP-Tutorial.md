# Tutorial PHP
PHP adalah bahasa skrip *general-purpose* *server-side* yang digunakan untuk membuat halaman web dinamis dan interaktif dengan cepat.

Sebelum Anda memulai tutorial PHP ini, Anda perlu memiliki pemahaman dan pengalaman dasar tentang hal-hal berikut:

+ **HTML** - PHP dapat ditulis dengan HTML, jadi ini penting dipahami.
+ **Pengetahuan pemrograman dasar** - Jika Anda memiliki pengalaman pemrograman tradisional seperti C, maka mempelajari PHP akan sangat mudah bagi Anda.

## PHP Example
Sekilas tentang contoh skrip PHP dan deskripsi terperinci diberikan di halaman Sintaks PHP.
```php
<!DOCTYPE html>
<html>
<head>
   <title>PHP Script Example</title>
</head>
<body>

<?php
   echo "Hello world, I'm a PHP script!"
?>

</body>
</html>
```
**Output program**:

`Hello world, I'm a PHP script!`

# PHP Introduction
PHP (Hypertext Preprocessor) adalah bahasa skrip *server-side* tertanam HTML open-source yang digunakan untuk mengembangkan aplikasi web dinamis dan interaktif dan juga digunakan sebagai bahasa pemrograman *general-purpose*.

## Some Facts About PHP

+ HP dikembangkan oleh Rasmus Lerdorf pada tahun 1995 dan kemudian dikembangkan sebagai open source. *PHP group* sekarang mengelola implementasi PHP.
+ PHP memiliki banyak sintaks yang mirip dengan C, Java, dan Perl, dan memiliki banyak fitur unik dan fungsi khusus.
+ Halaman PHP adalah file dengan ekstensi `.php` yang dapat berisi kombinasi Tag HTML dan skrip PHP.
+ **Singkatan rekursif PHP untuk PHP (Hypertext Preprocessor)**: **HyperText** berarti, teks yang berisi segala macam **markup** web, **PreProcessor** berarti semua HyperText diproses terlebih dahulu dan kemudian hasilnya dikirim sebagai HTML murni ke browser web. Klien tidak dapat melihat kode sumber PHP karena sudah diproses dan diinterpretasikan.
+ **PHP adalah bahasa skrip *server-side***: Skrip sisi server berarti bahwa kode PHP diproses di server web daripada di mesin klien.
+ PHP mendukung banyak *database* (kombinasi [MySQL](#) dan PHP banyak digunakan).
+ PHP adalah bahasa scripting *open source*.
+ PHP gratis untuk diunduh dan digunakan.

## What You Can Do with PHP
PHP digunakan untuk membuat aplikasi web, dan beberapa aplikasi web paling populer seperti Facebook, Yahoo, Wikipedia, Twitter, WordPress semuanya telah dikembangkan di PHP. Dan Anda juga dapat mengembangkan hal besar berikutnya menggunakan PHP.

## PHP Why? Popular Feature of PHP
+ Hal terbaik tentang menggunakan PHP sangat mudah untuk pendatang baru, dan juga memiliki banyak fitur canggih untuk programmer profesional. 
+ Mempelajari PHP sangat mudah, dan berjalan efisien di *server-side*. 
+ PHP bekerja pada banyak sistem operasi seperti Linux, Windows, Mac OS X. 
+ PHP GRATIS untuk diunduh dari sumber resmi PHP: [php.net](https://www.php.net/) 
+ PHP mendukung banyak database seperti MySQL, MS SQL, Oracle, Sybase, PostgreSQL, dan masih banyak lagi. 
+ PHP secara dinamis dapat menghasilkan HTML, PDF, Flash, Teks, CSV, XML dan masih banyak lagi. 
+ Pengkodean dalam PHP mudah dan cepat, sehingga membutuhkan waktu lebih sedikit untuk membangun aplikasi. 
+ Banyak kerangka kerja PHP yang bagus seperti *Zend*, *Codeigniter*, dan *Laravel* tersedia untuk PHP. 
+ Banyak pilihan web hosting tersedia dengan harga yang wajar untuk PHP. 
+ Dengan PHP, penyebaran kode sangat mudah. 
+ Dukungan komunitas PHP yang substansial, dan banyak tutorial dan contoh program tersedia secara online.

## PHP vs. Other Technologies
Banyak pengembang yang bekerja menggunakan teknologi lain (misalnya, JSP, ASP, Perl, ColdFusion) juga tertarik untuk bekerja menggunakan PHP. Biasanya, ini masalah preferensi (prioritas/kecenderungan) dan biaya yang mendorong pengembang untuk memilih PHP satu dari yang lain. Mungkin berbeda pendapat tentang hal itu, namun sebagian besar pengembang PHP percaya bahwa PHP lebih mudah dipelajari dan memiliki sintaks yang lebih unggul daripada bahasa lain. Selain itu, PHP cepat dan aman, dan yang terpenting, gratis.

# PHP Installation
Apa yang Anda perlukan untuk menjalankan PHP di komputer Anda, dan cara menyiapkan server WAMP, dijelaskan dalam tutorial ini.

## What You Need to Run PHP
|Untuk menjalankan kode PHP, Anda memerlukan tiga perangkat lunak berikut di mesin lokal Anda:|
|---|
|1. Web Server(e.g., Apache)<br> 2. PHP (interpreter)<br>3. MySQL Databases (optional)|

Anda dapat menginstal `Web Server`, `PHP Interpreter`, dan `database MySQL` secara terpisah, tetapi untuk mempermudah pekerjaan, pengembang telah membuat semua dalam satu paket pengaturan yang disebut `WAMP`, `LAMP`, `MAMP` dan `XAMPP` yang secara otomatis akan menginstal dan mengatur lingkungan PHP di Windows, Linux Anda atau mesin MAC.

+ WAMP (Windows, Apache, MySQL, PHP)
+ LAMP (Linux, Apache, MySQL, PHP)
+ MAMP (MAC, Apache, MySQL, PHP)
+ XAMPP (Windows/Linux/MAC, Apache, MySQL, PHP)

## Start Where?
Untuk mengeksekusi kode PHP, Anda memerlukan akses ke server web tempat PHP berjalan.

Pilihan utama anda adalah: 

1. Instal Apache dan PHP atau Instal WAMP, LAMP, MAMP atau XAMPP sesuai dengan OS Anda. 
2. Setelah instalasi, Anda perlu menjalankan dan memulai Server Apache dan PHP dari daftar program Anda, lalu ketik `http://localhost` di browser web Anda untuk mulai bekerja. 
3. Di folder instalasi Apache, Anda akan menemukan folder www, tempat Anda dapat menyimpan file PHP, dan Anda juga dapat membuat folder proyek Anda di dalam folder www.
4.  atau Temukan paket hosting web dengan dukungan Apache, PHP, dan MySQL dan Jalankan skrip PHP Anda di host Web Anda. 
5.  atau Anda juga dapat menggunakan antarmuka `runphonline.com` untuk menafsirkan kode PHP Anda secara online.



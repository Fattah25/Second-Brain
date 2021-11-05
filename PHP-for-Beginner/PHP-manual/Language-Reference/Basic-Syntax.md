<h1 align="center">Dasar Sintaks</h1>

## PHP Tags

Saat PHP mem-*parsing* (menguraikan) file, ia mencari tag pembuka dan penutup, yaitu `<?php` dan `?>` yang memberi tahu PHP untuk memulai dan berhenti menafsirkan kode di 
antara keduanya. *Parsing* dengan cara ini memungkinkan PHP untuk disematkan di semua jenis dokumen yang berbeda, karena segala sesuatu di luar sepasang tag pembuka 
dan penutup akan diabaikan oleh pengurai (*parser*) PHP.

PHP menyertakan tag *echo* pendek `<?=` yang merupakan singkatan dari  `<?php echo` yang lebih bertele-tele (*verbose*).

**Contoh PHP *Opening* dan *closing* tag**

```PHP

 /*1. */ <?php echo 'jika Anda ingin menyajikan kode PHP dalam dokumen XHTML atau XML, gunakan tag ini'; ?>
 /*2. Anda dapat menggunakan tag echo pendek untuk*/ <?= 'print this string' ?>.
 
 /*itu sama dengan*/ <?php echo 'print this string' ?>.
    
 /*3.*/ <? echo 'kode ini dalam tag pendek, tapi masih dapat bekerja '.'jika short_open_tag diaktifkan'; ?>   

```

Tag pendek (contoh tiga) tersedia secara default tetapi dapat dinonaktifkan baik melalui arahan file konfigurasi **short_open_tag** `php.ini`, atau dinonaktifkan secara default jika PHP dibuat dengan konfigurasi **--disable-short-tags**.

> **Note:** 
> 
> Karena tag <em title="tag pendek">short tag</em> dapat dinonaktifkan, disarankan untuk hanya menggunakan tag normal (`<?php ?>` dan `<?= ?>`) untuk memaksimalkan kompatibilitas.

Jika file hanya berisi kode PHP, lebih baik menghilangkan tag penutup (*closing tag*) PHP di akhir file. Ini mencegah ruang kosong yang tidak disengaja atau baris baru ditambahkan setelah tag penutup PHP, yang dapat menyebabkan efek yang tidak diinginkan karena PHP akan memulai *buffering* (memproses) output ketika tidak ada maksud dari programmer untuk mengirim output apa pun pada saat itu dalam skrip.

```php
<?php
echo "Hello world";

// ... more code

echo "Last statement";

// the script ends here with no PHP closing tag

```

### Komentar

Three types of tag are available in php
1. normal tag(`<?php ?>`)
2. short echo tag(`<?= ?>`)
3. short tag(`<? ?>`)

Karena *short tag* dapat dinonaktifkan, jadi gunakan *normal echo tag* dan *short echo tag* saja.

Jika Anda hanya ingin mencetak satu teks atau sesuatu, Anda harus menggunakan versi ringkas .`<?= $var ?>`

etapi jika Anda ingin memproses sesuatu, Anda harus menggunakan tag normal.

```PHP
<?php
        //$var = 3;
        //$var2 = 2;
        //$var3 = $var+$var2;
        //if($var3){//result}

?>
```

Jika Anda menyematkan php dengan html dan hanya satu baris, tidak perlu menggunakan *titik koma*

```html
<html>
<head>
<body>
<?= $var ?>
</body>
</head>
</html>
```

tetapi jika Anda memiliki banyak baris, gunakan titik koma.

```php
<?php
//line 1;
//line 2;
//line 3;
?>
```


----
## Escaping from HTML

Segala sesuatu di luar sepasang  _opening_ dan _closing_ tag diabaikan oleh pengurai PHP yang memungkinkan file PHP memiliki konten campuran. Hal ini memungkinkan PHP untuk disematkan dalam dokumen HTML, misalnya untuk membuat _template_.

```html
<p>Ini akan diabaikan oleh PHP dan ditampilkan oleh browser.</p>
<?php echo 'While this is going to be parsed.'; ?>
<p>Ini juga akan diabaikan oleh PHP dan ditampilkan oleh browser.</p>
```

Ini berfungsi seperti yang diharapkan, karena ketika _interpreter_ PHP menyentuh _closing tag_ ?>, itu hanya mulai mengeluarkan (_outputting_) apa pun yang ditemukannya (kecuali untuk baris baru yang segera mengikuti - lihat [_instruction separation_][1]) hingga menyentuh _opening tag_ lain kecuali di tengah _conditional statement_ dalam hal ini _interpreter_ akan menentukan hasil dari kondisi sebelum membuat keputusan tentang apa yang harus dilewati. Lihat contoh berikutnya. Menggunakan struktur dengan kondisi (_condition_).

[1]: https://id.javascript.info/hello-world

**Example:  Advanced escaping using conditions**
```php
<?php if ($expression == true): ?>
  This will show if the expression is true.
<?php else: ?>
  Otherwise this will show.
<?php endif; ?>

```



------


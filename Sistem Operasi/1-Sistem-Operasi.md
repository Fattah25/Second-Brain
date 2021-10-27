# Sistem Operasi

Sistem operasi merupakan sebuah perangkat lunak penghubung antara pengguna dari komputer dengan perangkat keras komputer.

Pengelola seluruh sumber-daya yang terdapat pada system komputer dan menyediakan sekumpulan layanan (*system calls*) ke pemakai sehingga memudahkan dan menyamankan penggunaan serta pemanfaatan sumber-daya sistem komputer.

Layer dari Sistem Komputer
+ *Hardware*
+ Sistem Operasi
+ *Utilities*'
+ Program Aplikasi

Layanan yang umumnya dimiliki SO
+ Program *Creation* (editor, compiler)
+ Program *Execution*
+ Access to I/O devices
+ *controlled access to files*
+ System _Access_ (logging in)
+ Error detection/response

## Layer dari Sistem Computer

![layer sistem komputer](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShpfo6Xh6phCOyFRuB2qEK5SF3j8reddOPTZP36MEtf3S7WBGlYWR-qb15xh-kVm_zMjA&usqp=CAU)

## Sistem Komputer 

Sistem komputer adalah sekumpulan sumber daya untuk memindahkan, menyimpan, dan memproses data, serta mengendalikan fungsi-fungsinya. **Sistem operasi** bertanggung jawab mengelola sumber daya - sumber daya sistem komputer.

## Sasaran SO

+ kenyamanan
+ Keamanan
+ Efisiensi
+ Mampu berevolusi

## Fungsi SO
+ Mengatur dan mengawasi penggunaan perangkat keras oleh berbagai program aplikasi serta para pengguna.
+ Untuk menghindari konflik yang terjadi pada saat pnegguna menggunakan sumber daya yang sama, sistem operasi mengatur pengguna mana yang dapat mengakses suatu sumberdaya dan kapan waktunya. Sistem operasi juga sering disebut *resource allocator* (pengalokasian sumberdaya).
+ Program mengendali yang bertujuan untuk menghindari kekeliruan (*error*) dan penggunaan komputer yang tidak perlu serta memberikan *feedback* pada pengguna.
+ **Sumber Daya Fisik**

  Antara lain: Keyboard, bar-code reader; Mouse, joystick, light-pen, track-ball, touch-screen (pointing devices); Floppy Disk Drive, harddisk, tape drive, optical disk, CD ROM drive (storage device); Layar monitor CRT, LCD (display devices); Printer, Modem, NIC, PCMCIA (communication devices); RAM, Cache memory, register dan memori-memori volatile lain; Multimedia devices; Grafis Devices; Device Controlls.

+ **Sumber Daya Abstrak**

  + Data
  + Program

## Sudut Pandang SO
+ **Pemakai**

  Pemakai tidak ada kaitannya dengan arsitektur komputer. User hanya sebatas menggunakan *command language* SO untuk meminta layanan-layanan SO. *Command language* tersedia dilapisan yang disebut **shell**, *shell* dapat berupa: **Text-based** dan **GUI (Graphical User Interface)**.

+ **Pemrograman / Programmer**

  + Programmer membuat aplikasi untuk pemakai awam dengan menggunakan bahasa pemrograman. Jika ini secara langsung dikembangkan dengan instruksi bahasa mesin maka programmer bertanggung jawab mengelola dan mengedalikan seluruh perangkat komputer.
  + Programmer dapat mengendalikan sistem komputer melalui beragam level, antara lain : 

    + **Mempergunakan program utilitas**, sekumpulan program sistem disediakan untuk mempermudah tugas pemrograman. Kumpulan ini disebut *utilitas*, utilitas sudah menjadi satu paket dengan sistem operasi yang akan diterjemahkan menjadi layanan-layanan SO. Utilitas yang bisa disediakan adalah:

      + Utilitas untuk membantu penciptaan program
      + Utilitas untuk manajemen berkas
      + Utilitas untuk mengendalikan perangkat I/O
      + Utilitas-utilitas untuk tugas dasar lainnya

    + **Mempergunakan fasilitas sistem melalui interface layanan (*service interface*)
    + Mempergunakan panggilan sistem (*system calls*)

+ **Perancang SO**

  SO bertugas untuk me-*masking* perangkat keras komputer agar tampil menarik, mudah dan nyaman bagi programmer. SO menghindari rincian operasi perangkat keras dan menyediakan antarmuka untuk programmer dalam menggunakan sistem. SO bertindak sebagai mediator, mempermudah programmer dan program aplikasi mengakses dan menggunakan fasilitas dan sumber daya sistem komputer.


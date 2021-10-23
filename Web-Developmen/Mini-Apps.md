<h1 align="center">Mini Apps</h1>

Eksplorasi pengembang web ke dalam aplikasi mini ([*mini apps*][1])—aplikasi yang dibuat dengan teknologi web tetapi tidak berjalan di browser.

[1]: https://web.dev/mini-apps/ "Membuat aplikasi mini."

### Overview
Pelajari lebih lanjut tentang ekosistem <b title="mini apps">aplikasi mini</b> yang <strong title="thriving">berkembang pesat</strong> dan apa yang dapat dipelajari oleh 
<b title="web developers">pengembang web</b> darinya.

### Table of Content
+ [Mini Apps and Super Apps](#mini-super)


<h1 align="center"> Welcome to the world of mini apps</h1>

<h2 id="mini-super">Mini Apps and Super Apps</h2>

### Welcome to mini apps
Saat Anda melihat aplikasi di ponsel, Anda mungkin memiliki aplikasi khusus untuk tugas tertentu. Anda mungkin memiliki aplikasi perbankan. Anda mungkin memiliki
aplikasi untuk membeli tiket angkutan umum. Kemungkinan Anda memiliki aplikasi untuk mendapatkan petunjuk arah, dan banyak lagi aplikasi khusus. Postingan ini
memperkenalkan Anda pada konsep berbagai jenis aplikasi — aplikasi mini — terkadang juga disebut program mini atau *applet*. Pertama-tama Anda akan belajar tentang 
latar belakang berbagai platform aplikasi mini dan pengalaman pengembangnya, lalu fokus pada hal-hal yang dapat dipelajari web dari aplikasi mini. Namun sebelum 
mempelajari tentang aplikasi mini, Anda harus terlebih dahulu mempelajari tentang aplikasi super.

### What are super apps? 
Aplikasi super berfungsi sebagai host untuk aplikasi lain yang berjalan di dalamnya: yang disebut aplikasi mini. Aplikasi super populer adalah WeChat (微信) 
oleh Tencent, Alipay (支付宝) oleh Ant Group (perusahaan afiliasi dari Grup Alibaba Cina), aplikasi mesin pencari Baidu (百度), serta ByteDance's Douyin (抖音),
yang mungkin Anda kenal sebagai TikTok (蒂克托克). Tiga yang pertama biasanya juga disebut sebagai BAT, berasal dari B(aidu)A(libaba)T(encent). Aplikasi super
telah mengambil alih pasar Cina, itulah sebabnya banyak contoh dalam artikel ini adalah bahasa Cina.

<div align="center">
  <figure>
  <img src="https://web-dev.imgix.net/image/8WbTDNrhLsU0El80frMBGE4eMCD3/UKmUgG231MtQ2nEo1P0K.PNG?auto=format&w=338" alt="Wechat Mini Apps" width="200" higth="50"><br>
  <figcaption>
    Aplikasi super WeChat menampilkan aplikasi mini yang baru saja diluncurkan.
    </figcaption>
  </figure>
</div>

### Beberapa kata tentang platform aplikasi super
*WeChat* bertujuan untuk menjadikan dirinya sebagai toko serba ada untuk memenuhi hampir semua kebutuhan yang mungkin dimiliki pengguna dalam kehidupan sehari-hari mereka.
*Alipay* membangun platformnya di atas sistem pembayarannya, dengan fokus pada layanan ritel dan keuangan, termasuk layanan kredit, pinjaman, asuransi, cicilan, 
dan pelayanan kehidupan lokal. *Baidu* berusaha untuk mengubah mesin pencarinya dari hanya menghubungkan orang, layanan, dan informasi menjadi informasi sebagai 
layanan melalui program mini untuk perjalanan, ritel, iklan, pembayaran, dan banyak lagi. <b title="Last but not least">Terakhir tapi tidak kalah penting</b>, *Douyin*
ingin meningkatkan dirinya sebagai pusat *e-commerce* sosial dan berubah menjadi lebih dari platform hiburan dan belanja.

 ### Installing super apps 
 Aplikasi super tersedia di beberapa sistem operasi. Perhatikan bahwa versi yang tersedia di toko aplikasi resmi mungkin tidak selalu berisi semua fitur 
 atau tersedia di semua lokal. Tautan di bawah ini mengarah ke tautan yang berfungsi secara universal, tetapi mungkin memerlukan pemuatan dari sumber yang 
 tidak tepercaya, jadi unduh dan instal aplikasi <b title="at your own risk">dengan risiko Anda sendiri</b>. Anda biasanya perlu membuat akun, yang melibatkan pengungkapan nomor telepon Anda. 
 Anda mungkin ingin mempertimbangkan untuk membeli telepon burner. Ketahuilah bahwa banyak aplikasi super hanya memungkinkan Anda membuat apa yang disebut akun 
 luar negeri, yang tidak memiliki semua fitur akun domestik.

<h2 id="mini-apps">What are mini apps?</h2>

### Building blocks and compatibility
Aplikasi mini adalah aplikasi kecil (biasanya kurang dari 4 MB) yang memerlukan aplikasi super untuk dijalankan. Kesamaan mereka, terlepas dari aplikasi super, 
adalah bahwa mereka dibangun dengan ("dialek" dari) teknologi web HTML, CSS, dan JavaScript. Waktu proses aplikasi mini adalah tampilan web di aplikasi super, 
bukan *sistem operasi* yang mendasarinya, yang membuat aplikasi mini lintas platform. Mini app yang sama dapat berjalan di super app yang sama, tidak peduli 
apakah super app berjalan di Android, iOS, atau OS lain. Namun, tidak semua aplikasi mini dapat berjalan di semua aplikasi super, lebih lanjut tentang ini nanti.

### Discovery
Aplikasi mini sering ditemukan ad-hoc melalui kode batang 2D bermerek, yang memecahkan tantangan penting offline-ke-online, misalnya, beralih dari menu restoran 
fisik ke aplikasi mini pembayaran, atau dari e-skuter fisik ke mini rental aplikasi. Gambar di bawah menunjukkan contoh barcode 2D bermerek untuk aplikasi mini 
demo WeChat. Saat kode dipindai dengan aplikasi super WeChat, aplikasi mini langsung diluncurkan. Aplikasi super lainnya biasanya tidak dapat mengenali kode batang.

<div align="center">
  <figure>
  <img src="https://web-dev.imgix.net/image/tcFciHGuF3MxnTr1y5ue01OGLBn2/SOisfOqKQWr0GZZvUaqn.jpg?auto=format&w=260" alt="Wechat Barcode" width="200" higth="50"><br>
  <figcaption>
    Memindai kode batang 2D ini dengan aplikasi WeChat akan meluncurkan aplikasi mini demo.
    </figcaption>
  </figure>
</div>
<br>

Aplikasi mini juga dapat ditemukan melalui pencarian dalam aplikasi reguler di aplikasi super, dibagikan dalam pesan obrolan, atau menjadi bagian dari item berita di umpan berita. Beberapa aplikasi super memiliki gagasan akun terverifikasi yang dapat berisi aplikasi mini di profil mereka. Aplikasi mini dapat disorot ketika mereka secara fisik dekat secara geografis, seperti aplikasi mini dari sebuah bisnis di depan tempat pengguna berdiri, atau hampir tutup, seperti ketika pengguna mendapatkan petunjuk arah pada peta yang ditampilkan di aplikasi super. Aplikasi mini yang sering digunakan tersedia di laci aplikasi yang di banyak aplikasi super dapat diakses melalui gerakan menggesek ke bawah atau melalui bagian khusus di menu aplikasi super. 

### The user experience
Semua aplikasi super memiliki *interface* pengguna yang kurang lebih sama untuk aplikasi mini. Bilah atas bertema dengan nama aplikasi mini, dan, di sudut atas layar, tombol tutup di paling kanan didahului oleh menu tindakan yang menyediakan akses ke fitur umum seperti berbagi aplikasi, menambahkannya ke daftar favorit atau layar utama, melaporkan aplikasi yang menyalahgunakan, memberikan masukan, dan setelan. Tangkapan layar di bawah ini menunjukkan aplikasi mini belanja yang berjalan dalam konteks aplikasi super Alipay dengan menu tindakan terbuka.


### UI paradigms 


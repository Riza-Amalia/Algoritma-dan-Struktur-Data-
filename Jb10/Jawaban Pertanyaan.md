## Jabawan 10.3.3


1. Fungsi atribut Q pada class Queue tersebut adalah berfungsi sebagai deklarasi array untuk menampung banyaknya data maksimal antrian. Dan juga berfungsi sebagai variabel untuk menyimpan data Queue.
2. max : variabel untuk menyimpan banyak data maksimal yang bisa disimpan di dalam queue.
size: variabel untuk menyimpan berapa banyak data yang ada dalam antrian.
front: berfungsi sebagai elemen pertama pada Queue.	
rear : berfungsi sebagai elemen terakhir Queue.
3. Karena jika pada elemen Queue tidak terdapat data sama sekali, maka size akan menjadi 0, dan posisi front dan rear harus diset menjadi -1 untuk menandakan bahwa elemen pada Queue tersebut dalam keadaan kosong. 
4. Yang terjadi adalah setiap data yang masuk jumlah antriannya adalah tetap sesuai dengan max akan tetapi dikurangi sebanyak 1 elemen. Dengan kata lain jika max data yang dimasukkan adalah 2 elemen, maka data yang ditampilkan adalah 1 elemen saja.
5. Kegunaan dari potongan kode tersebut adalah sebagai statemen jika elemen rear telah mencapai batas yang ditentukan, maka elemen tersebut kembali pada indeks ke – 0. 
6. <img src="6.png">
7. Karena data yang digunakan method tersebut berasal dari method Enqueue sehingga jika terdapat proses pengambilan data pada Dequeue maka acuan data yang digunakan adalah pada method Enqueue sehingga perlu adanya returning data jika terdapat pengambilan data lainnya.
8. <img src="8.png">
9. <img src="9.png">
10. Karena perulangan tersebut mengikuti banyaknya elemen front yang terdapat pada Queue.
11. Fungsi kode tersebut adalah sebagai inisialisasi nilai i yang digunakan untuk memeriksa letak masing-masing elemen sesuai dengan nilai max yang telah ditentukan.
12. Jika i=font, maka apabila dilakukan pengulangan maka akan digunakan rumus tersebut untuk menampilkan data dalam queue selanjutnya misal i=0 i = (0+1)%4 hasilnya adalah 1, maka akan ditampilkan data pada array ke 1.
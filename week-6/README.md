### Açıklama
- Bir tane suspend fonksiyon oluşturduk ve içerisinde 1 saniye bekletip, geriye bir string döndürüyoruz.
- onCreate() altında sonsuz bir döngü oluşturuyoruz (while true) ve içinde bir coroutine scope oluşturuyoruz.
- Oluşturulan scope altında 1 saniye bekleten fonksiyonu çağırıyoruz.
- Oluşturduğumuz sonsuz döngümüzü 10000. adıma geldiğinde kırıyoruz.

## Gözlemlemeler
**1) Döngü kitlenmeye sebep oldu mu?**
- Döngüyü kırana kadar main (ui) thread bloklandı.
- Coroutine scope sadece döngüyü kırdıktan sonra çalıştı.

**2)** Kilitlenmeye sebep olmadan UI thread çalışır mı?
- Eğer ki oluşturduğumuz sonsuz döngüyü de bir coroutine scope içerisine alırsak, ana threadı dondurmayız ve çalışır. `Cevap: Evet`
- Eğer ki yeni bir coroutine scope oluşturmadan direkt olarak onCreate() altında bir sonsuz döngü yaratırsak, UI threadin çalışması için döngünün kırılmasını beklememiz gerekir. `Cevap: Hayır` 
- Oluşturduğumuz sonsuz döngüyü kırmadığımız sürece main thread başlatılamıyor.
- withContext içerisindeki `Dispatchers.Main` olan kısmı `Dispatchers.Default` olarak değiştirmeliyiz.

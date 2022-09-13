## Açıklama
Bu çalışmada bizden bir graph yapısı oluşturmamız isteniyor. Kayıt sayfasını geçtikten sonra tekrar aynı sayfaya dönmemek için geri butonuna tıklandığı zaman uygulamadan çıkmamız isteniyor.
Kullandığım basit yöntem:
```kotlin
override fun onBackPressed() {
    this.finishAffinity()
}
```

### Aklıma gelen diğer yöntem
- Bir önceki fragment eğer ki kayıt olma fragmenti ise, geri tuşuna tıklandığı zaman uygulamanın kapanmasıydı. 

### Graph Yapısı
![](https://ibb.co/rZFL36F)

### Resimler
![](https://ibb.co/887DZKK)
![](https://ibb.co/FDhWmZD)

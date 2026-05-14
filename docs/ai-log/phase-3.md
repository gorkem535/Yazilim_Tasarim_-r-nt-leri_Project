
## 1. Tartışılan Teknik Konular
- **Strategy Pattern:** Karakterin saldırı yeteneklerinin (Kılıç, Büyü, Ok) `if-else` yapısından kurtarılarak dinamik bir yapıya kavuşturulması.
- **Observer Pattern:** Karakterin can değerindeki değişimlerin UI bileşenlerine otomatik bildirilmesi.
- **GitHub Actions:** Java projeleri için otomatik derleme (automated build) iş akışının kurulması.
- **Git Conflict Resolution:** Merge sırasında oluşan kod çakışmalarının temizlenmesi.

## 2. Karşılaşılan Sorunlar ve Çözümler
- **Sorun:** GitHub Actions derleme sırasında `ArrayList` sınıfını bulamadığı için hata verdi.
- **Çözüm:** AI ile hata logları incelendi ve `Main_Charecter.java` dosyasına eksik olan `java.util.ArrayList` ve `java.util.List` importları eklendi.

## 3. Öz Değerlendirme Soruları

**Soru: AI desteği olmasaydı bu faz ne kadar sürerdi?**
Özellikle GitHub Actions (YAML) konfigürasyonu ve karmaşık Git çakışmalarının çözümü, AI desteği olmadan manuel olarak çok daha fazla zaman alabilirdi. AI, hata mesajlarını anında yorumlayarak çözüm süresini yaklaşık %60 oranında kısalttı.

**Soru: AI sizi nerede yanılttı?**
Git conflict çözümü sırasında önerilen kodlar, bazen eski fazların kalıntılarını da içeriyordu. Bu durum "duplicate class" hatalarına yol açtı. Ancak bu durum, manuel kod incelemesi ve AI ile yapılan debug süreciyle aşıldı.
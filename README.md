# Otopark-Sistemi
### **README.md** Dosyası İçeriği (Türkçe)

```markdown
# Otopark Sistemi Projesi

Bu proje, Java ve Swing (JFrame) kullanılarak geliştirilmiş basit bir otopark sistemi uygulamasıdır. Sistem, araç giriş ve çıkışlarını yönetir, park süresine göre ücret hesaplar ve dolu park yerlerini görüntüleme özelliği sunar.

---

## **Özellikler**
1. **Araç Girişi**: Aracın plakasını girerek uygun bir park yerine atanmasını sağlar.
2. **Araç Çıkışı**: Spot ID kullanılarak araç çıkışı yapılır, toplam park ücreti hesaplanır ve park yeri boşaltılır.
3. **Dolu Park Yerlerini Listeleme**: Şu anda otoparkta bulunan araçların Spot ID, plaka ve giriş zamanını görüntüler.

---

## **Kullanılan Teknolojiler**
- **Java**: Uygulama mantığı için.
- **Swing (JFrame)**: Grafiksel kullanıcı arayüzü için.
- **Java Time API**: Zaman yönetimi ve süre hesaplamaları için.

---

## **Kurulum ve Kullanım**

### **Gereksinimler**
1. [JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (Java Development Kit) kurulu olmalı.
2. IntelliJ IDEA, Eclipse, NetBeans gibi bir IDE ya da terminal kullanabileceğiniz bir metin editörü (örn: VS Code).

---

### **Kurulum Adımları**
1. Bu projeyi klonlayın:
   ```bash
   git clone https://github.com/kullanici-adiniz/otopark-sistemi.git
   ```
2. Projeyi tercih ettiğiniz IDE ile açın.
3. `src` klasöründe aşağıdaki dosyaların bulunduğundan emin olun:
   - `ParkingApp.java`
   - `ParkingSystem.java`
   - `ParkingSpot.java`
   - `Vehicle.java`

4. `ParkingApp.java` dosyasını çalıştırmak için:
   - IDE üzerinden **Run** seçeneğini kullanın.
   - Veya terminalden şu komutları çalıştırın:
     ```bash
     javac ParkingApp.java ParkingSystem.java ParkingSpot.java Vehicle.java
     java ParkingApp
     ```

---

## **Nasıl Kullanılır**
1. **Uygulamayı Başlatın**: Programı çalıştırdığınızda grafik arayüz açılır.
2. **Araç Girişi**:
   - **"Vehicle Entry"** butonuna tıklayın.
   - Aracın plakasını girin.
   - Sistem, aracı uygun bir park yerine atar ve Spot ID'sini gösterir.
3. **Araç Çıkışı**:
   - **"Vehicle Exit"** butonuna tıklayın.
   - Çıkan aracın **Spot ID**'sini girin.
   - Sistem park ücretini hesaplar ve park yerini boşaltır.
4. **Dolu Park Yerlerini Görüntüleme**:
   - **"Vehicle List"** butonuna tıklayın.
   - Dolu park yerlerini, araç plakalarını ve giriş zamanlarını bir tabloda görüntüleyin.

---

## **Proje Yapısı**
```
src/
├── ParkingApp.java         // GUI mantığı ve uygulama
├── ParkingSystem.java      // Otopark yönetimi ve ücret hesaplama
├── ParkingSpot.java        // Park yeri sınıfı
└── Vehicle.java            // Araç sınıfı
```

---

## **Özelleştirme**
- **Park Yeri Sayısı**: Otoparktaki park yeri sayısını değiştirmek için `ParkingSystem` kurucusunda sayıyı güncelleyin:
  ```java
  parkingSystem = new ParkingSystem(10, 0.5); // Park yeri sayısını 10 olarak ayarlar.
  ```
- **Park Ücreti**: Dakika başına park ücretini değiştirmek için aynı kurucuda ücreti güncelleyin:
  ```java
  parkingSystem = new ParkingSystem(10, 1.0); // Dakika başına ücreti 0.5'ten 1.0'a çıkarır.
  ```

---

## **Ekran Görüntüleri**
### Araç Girişi
![Araç Girişi Ekran Görüntüsü](path/to/vehicle-entry.png)

### Araç Çıkışı
![Araç Çıkışı Ekran Görüntüsü](path/to/vehicle-exit.png)

### Dolu Park Yerleri
![Dolu Park Yerleri Ekran Görüntüsü](path/to/vehicle-list.png)

---


## **İletişim**
Sorularınız veya geri bildirimleriniz için benimle iletişime geçebilirsiniz: sidaryurdusever@gmail.com
```


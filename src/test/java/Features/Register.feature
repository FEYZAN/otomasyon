Feature: OBSS Web Adresine Giriş
  @register
  Scenario: (Senaryo) Web Adresine Giriş Yapıldıktan Sonra Testing ve Automation Sayfasının En Altında Bulunan Obss Footer'ının Geldiğinin Doğrulanması Testi
  Given (Diyelim ki) OBSS Web adresine giriş yapılır.
  When (Eğer ki) Search ikonuna tıklanarak text alana Automation yazıldığında çıkan ilk linke tıklanırsa
  Then (O zaman) Sayfanın en altına gidildiğinde Obss Footer'ının geldiği görülür.

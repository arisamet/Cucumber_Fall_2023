Feature: US 1008 Kullanici herokuApp sayfasinda beklemeleri yapar
  
  Scenario: TC12 Kullanici bekleme islemlerini yapar
    
     Given kullanici "herokuappUrl" anasayfaya gider
     When Add Element butona basar
     And Delete butonu gorunur oluncaya kadar bekleyin
     Then butonunun gorunur oldugunu test edin
     And Delete butonuna basarak butonu silin
     And Delete butonunun gorunmedigini test edin
      And sayfayi kapatir
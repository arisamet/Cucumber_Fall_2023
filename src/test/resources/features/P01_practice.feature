Feature: amazon testi

  Scenario: TC001 Amazonda iphone 15 Pro arama testi

    Given kullanici "amazonUrl" anasayfaya gider
    Then arama kutusuna "iphone 15 Pro" yazip aratir
    Then arama sonuclarinin sonuc sayisini yazdir
    And sayfayi kapatir


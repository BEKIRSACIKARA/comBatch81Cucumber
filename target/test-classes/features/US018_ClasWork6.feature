Feature: US018 Class Work
  Scenario: explicitly wait2
    Given kullanici "demoqaUrl" anasayfasinda
    Then kullanici Visible After bes seconds butonunun gorunur olmasini bekler
    And kullanici Visible After bes seconds butonunun gorunur oldugunu test edin

Feature: Login User Demo Shop

  Scenario: User Invalid Password
    Given User open browser and url
    When User enter invalid username
    And User enter invalid password
    And User clicked button login
    Then User reading warning message
#  ..............................................................................................................................

# Catatan: CODE SKENARIO sudah dibuat testing berjalan sesuai
#  uji awal dapat dilakukan untuk melihat web testing login - add item, add to cart
#  dapat di uji jika tes invalid di tutup
#  jika invalid aktif code berjalan sesuai tapi hanya bisa sekali untuk keduakalinya akan muncul
#  web not Found 127.0.0.1

  Scenario: User valid Login
    When User enter valid username
    And User enter valid password
    And User clicked button login
   Then User go to page tools demo site


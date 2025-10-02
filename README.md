Kurssitehtävä, syksy 2025
@ Minttu Pohjola

-

Omat muistiinpanot ja pohdinnat:

Tehdään ohjelma Javalla. Hyödynnetään luokkarakennetta ja tehokkuutta.
Tarvitaan CPU, cache sekä DRAM. Erillinen Main, josta kutsutaan CPU. 
CPU kutsuu cache, joka aina tarvittaessa fetch tietoja DRAM

Meillä on 64 erilaista osoitetta muistille. Ja tarvitaan 6 bittiä näiden osoitteistukseen. 


-

Osoitteistus:
CPU käsittelee hexadesimaaleja 0x00 - 0x3F // käsittelee Stringinä (obv noi ei oo numeroita)
Cache muuttaa ne binäärimuotoon 00000000 - 00111111 // käsittelee Stringinä jotta voi pilkkoa
DRAM muuttaa desimaaleiksi 0 - 63 // käsittelee int

-

TODO;
Cache: "JATKA TÄSTÄ" kato onko tuossa indexissä null vai sisältöä eli miss/hit
Ja sitte jatka read/write spesic juttuihi -> ehkä väliaikanen hit/miss muuttuja 
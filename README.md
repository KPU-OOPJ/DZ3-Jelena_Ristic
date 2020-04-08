Napravite klase NizCena i TestNizCena sa sledećim uslovima:

a)	Klasa NizCena koja predstavlja niz cena raznih proizvoda i ima: 
-	Atribut koji predstavlja niz cena proizvoda (primer cene: 100.5 dinara). Maksimalni kapacitet niza je uvek 100 elemenata. 
-	Atribut koji predstavlja brojač elemenata niza. Brojač na početku ima vrednost nula jer je niz prazan. 
-	Metodu za dodavanje nove cene u niz. Dodavanje se vrši samo ako je nova cena veća od nule i ako u nizu ima mesta (brojač je manji od maksimalnog kapaciteta). U suprotnom, potrebno je ispisati poruku o grešci. Ako se ubacivanje izvrši, potrebno je brojač uvećati za jedan. 
-	Metodu koja izračunava i vraća prosečnu cenu proizvoda. Ukoliko je niz prazan, ispisuje se poruka da je niz prazan i vraća se nula. 
-	Metodu koja vraća najnižu cenu proizvoda. Ukoliko je niz prazan, ispisuje se poruka da je niz prazan i vraća se nula. 
-	Metodu koja vraća najvišu cenu proizvoda. Ukoliko je niz prazan, ispisuje se poruka da je niz prazan i vraća se nula. 
-	Metodu koja vraća razliku između najniže i najviše cene. Ukoliko je niz prazan, ispisuje se poruka da je niz prazan i vraća se nula. 
-	Metodu koja ispisuje samo one cene proizvoda koje su veće od neke zadate vrednosti. Ta vrednost se unosi u metodu kao ulazni argument. Ukoliko je niz prazan, ispisuje se poruka o tome. 

b)	Klasa TestNizCena koja kreira jedan objekat klase NizCena. U ovaj niz cena je potrebno uneti sledeće cene: 123.0 , 234.55, 301.0 i 5000.0. Kada se to uradi,potrebno je na ekranu ispisati one cene koje su veće od 300.0 dinara i razliku između najniže i najviše cene. 

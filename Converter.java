public class Converter {
String Roman;
int Decimal;


Converter(String RomanNumeral) {
int result = 0;

Roman = RomanNumeral;
for( int i = 0; i < RomanNumeral.length(); i++){
switch (RomanNumeral.charAt(i)){
case 'M': result += 1000;
   break;
case 'C': result += 100;
   break;
case 'L': result += 50;
   break;
case 'X': result += 10;
   break;
case 'V': result += 5;
   break;
case 'I': result += 1;
   break;
default: System.out.println("Invalid Character, Character " + RomanNumeral.charAt(i) +"Unavailable, Skipped!");
}
}
Decimal = result;
}



Converter(int nDecimal) {
Decimal =nDecimal;
String Row = "";
do{
if (nDecimal >=1000){
   nDecimal -= 1000;
    Row += 'M';
    }
    else if (nDecimal >= 100){
      nDecimal -= 100;
      Row += 'C';
    }
    else if (nDecimal >= 50){
      nDecimal -= 100;
      Row += 'L';
    }
    else if (nDecimal >= 10){
      nDecimal -= 10;
      Row += 'X';
    }
    else if (nDecimal >= 5){
      nDecimal -= 5;
      Row += 'V';
    }
    else if (nDecimal >= 1){
      nDecimal -= 1;
      Row += 'I';
    }
    }while(nDecimal > 0);
    Roman = Row;
    }
    }



    

    
      
                                                     
            
           
      

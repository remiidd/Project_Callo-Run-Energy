//============================================================================//
//                                  ENTETE                                    //
//============================================================================//

/*------------------------------------------------------------------------------

Name: Guilhem QUINIO
Project name: voiture
Description: V1

* Test configuration:
       MCU:           Arduino
       Dev.Board:     Arduino UNO
       Oscillator:    HS - 16.000 MHz Crystal
       Ext. Modules:
       SW:            CodeBlocks

* Notes:

------------------------------------------------------------------------------*/

//============================================================================//
//                               Directives                                   //
//============================================================================//

#include <Arduino.h>

//============================================================================//
//                         Globlal Variables used                             //
//============================================================================//
int blanc=0;
char c=0;

//============================================================================//
//                           Interrupt programm                               //
//============================================================================//


//============================================================================//
//                   Fonction declaration-implementation                      //
//============================================================================//


//============================================================================//
//                              Setup fonction                                //
//============================================================================//


void setup() {
    pinMode(6, OUTPUT);
    pinMode(4, OUTPUT);
    pinMode(5, OUTPUT);

    pinMode(8,INPUT);

    Serial.begin(9600);

}


//============================================================================//
//                               Main fonction                                //
//============================================================================//


void loop() {
    if(Serial.available())
    c = Serial.read();
    if(c) {
        blanc = digitalRead(8);
        if(blanc){
            digitalWrite(6, HIGH);
            digitalWrite(4, HIGH);
            digitalWrite(5, LOW);
            delay(1000);
            while(1) {
                digitalWrite(6, HIGH);
                digitalWrite(4, HIGH);
                digitalWrite(5, HIGH);
            }
        }
        digitalWrite(6, HIGH);
        digitalWrite(4, LOW);
        digitalWrite(5, HIGH);
    } else if(0){
        digitalWrite(6, HIGH);
        digitalWrite(4, HIGH);
        digitalWrite(5, HIGH);
    }
}

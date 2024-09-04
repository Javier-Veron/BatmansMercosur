package src;

import static org.junit.jupiter.api.Assertions.*;

class BatmanTest {

    @org.junit.jupiter.api.Test
    void esKryngoTrueIngles(){
        Batman batman = new Batman(true);
        assertTrue(batman.esKryngo());
        assertTrue(batman.anglosajon);
    }

    @org.junit.jupiter.api.Test
    void esKryngoTrueNoIngles(){

        Batman batman = new Batman();
        assertTrue(batman.esKryngo());
        assertFalse(batman.anglosajon);

    }

    @org.junit.jupiter.api.Test
    void esKryngoFalseIngles(){
        Batman batman = new Batman();
        assertFalse(batman.esKryngo());
        assertTrue(batman.anglosajon);

    }

    @org.junit.jupiter.api.Test
    void esKryngoFalseNoIngles(){
        Batman batman = new Batman();
        assertFalse(batman.esKryngo());
        assertFalse(batman.anglosajon);

    }
    //SE NECESITA TRADUCTOR

    @org.junit.jupiter.api.Test
    void esInglesTrue(){
        Batman batman = new Batman();
        assertTrue(batman.anglosajon);

    }
    @org.junit.jupiter.api.Test
    void esInglesFalse(){
        Batman batman = new Batman();
        assertFalse(batman.anglosajon);

    }

    //IR A LA PANADERIA

    @org.junit.jupiter.api.Test
    void irALaPanaderiaTrue(){

        Batman batman = new Batman();
        assertEquals(6,batman.comilon());

    }
    @org.junit.jupiter.api.Test
    void irALaPanaderiaFalse(){
        Batman batman = new Batman();
        assertNotEquals(6,batman.comilon());

    }

    //ALTOS NIVELES DE FACTURA EN SANGRE

    @org.junit.jupiter.api.Test
    void altoNivelDeFacturaEnSangreTrue(){
        Batman batman = new Batman();
        assertTrue(batman.esGoloso());

    }

    @org.junit.jupiter.api.Test
    void altoNivelDeFacturaEnSangreFalse(){

        Batman batman = new Batman();
        assertFalse(batman.esGoloso());

    }

}
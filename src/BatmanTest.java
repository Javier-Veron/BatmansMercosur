import static org.junit.jupiter.api.Assertions.@*;

class BatmanTest {

    //ES KRYNGO

    @org.junit.jupiter.api.Test
    void esKryngoTrueIngles(){

        assertTrue(batman.esKryngo());
        assertTrue(batman.esIngles());
    }

    @org.junit.jupiter.api.Test
    void esKryngoTrueNoIngles(){

        assertTrue(batman.esKryngo());
        assertFalse(batman.esIngles());

    }

    @org.junit.jupiter.api.Test
    void esKryngoFalseIngles(){

        assertFalse(batman.esKryngo());
        assertTrue(batman.esIngles());

    }

    @org.junit.jupiter.api.Test
    void esKryngoFalseNoIngles(){

        assertFalse(batman.esKryngo());
        assertFalse(batman.esIngles());

    }
    //SE NECESITA TRADUCTOR

    @org.junit.jupiter.api.Test
    void esInglesTrue(){

        assertTrue(batman.esIngles());

    }
    @org.junit.jupiter.api.Test
    void esInglesFalse(){

       assertFalse(batman.esIngles());

    }

    //IR A LA PANADERIA

    @org.junit.jupiter.api.Test
    void irALaPanaderiaTrue(){

        assertEquals(6,batman.comilon());

    }
    @org.junit.jupiter.api.Test
    void irALaPanaderiaFalse(){

        assertNotEquals(6,batman.comilon());

    }

    //ALTOS NIVELES DE FACTURA EN SANGRE

    @org.junit.jupiter.api.Test
    void altoNivelDeFacturaEnSangreTrue(){

        assertTrue(batman.esGoloso());

    }

    @org.junit.jupiter.api.Test
    void altoNivelDeFacturaEnSangreFalse(){

        assertFalse(batman.esGoloso());

    }

}
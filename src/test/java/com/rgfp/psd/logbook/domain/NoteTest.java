package com.rgfp.psd.logbook.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NoteTest {

    @Test
    public void metodoQuerecibeSummaryDevolviendoHasta240Caracteres() {

        String texto = "christopernuevo";

        Note note = new Note();

        note.setContent(texto);

        System.out.print("texto: "+texto.length());
        assertTrue(note.getSummary().length()> 0);
    }


}
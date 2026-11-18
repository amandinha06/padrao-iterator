package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveContarMusicasNacionais(){
        Playlist playlist = new Playlist(
                new Musica("Zona sul", true),
                new Musica("Quinta-feira", true),
                new Musica("Bored", false),
                new Musica("Fireal", false),
                new Musica("Tudo pro alto", true)
        );
        assertEquals(3, Censo.contarMusicasNacionais(playlist));
    }

    @Test
    void deveContarTotalMusicasPlaylisy(){
        Playlist playlist = new Playlist(
                new Musica("Zona sul", true),
                new Musica("Quinta-feira", true),
                new Musica("Bored", false),
                new Musica("Fireal", false),
                new Musica("Tudo pro alto", true)
        );
        assertEquals(5,Censo.contarTotalMusicasPlaylist(playlist));
    }

}
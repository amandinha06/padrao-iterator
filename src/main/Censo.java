package padroescomportamentais.iterator;

import java.util.Iterator;

public class Censo {

    public static Integer contarMusicasNacionais(Playlist playlist){
        int qnt = 0;
        for (Musica musica : playlist){
            if (musica.isNacional()){
                qnt++;
            }
        }
        return qnt;
    }

    public static Integer contarTotalMusicasPlaylist(Playlist playlist){
        int qnt = 0;
        for (Iterator a = playlist.iterator(); a.hasNext();) {
            qnt++;
            a.next();
        }
        return qnt;
    }

}

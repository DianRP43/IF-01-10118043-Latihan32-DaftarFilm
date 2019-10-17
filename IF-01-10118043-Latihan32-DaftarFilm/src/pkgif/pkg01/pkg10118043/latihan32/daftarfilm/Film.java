/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118043.latihan32.daftarfilm;

/**
 *
 * @author user
 */
public class Film {
    public String FilmName, FilmGenre;
    public double FilmRating;
    public int FilmDuration;
    
    public void nowPlaying(){
        System.out.println("Judul Film\t: "+FilmName);
        System.out.println("Genre Film\t: "+FilmGenre);
        System.out.println("Rating Film\t: "+FilmRating);
        System.out.println("Duration Film\t: "+FilmDuration);
    }
}

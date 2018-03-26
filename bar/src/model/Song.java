package model;

import java.applet.*;

public class Song {

    public static final Song[] sounds = {
        new Song("error.wav"),
        new Song("numeric.wav")
    };

    private AudioClip clip;

    private Song(String name) {
        clip = Applet.newAudioClip(getClass().getClassLoader().getResource(name));
    }

    public void play() {
        new Thread() {
            public void run() {
                clip.play();
            }
        }.start();
    }

}
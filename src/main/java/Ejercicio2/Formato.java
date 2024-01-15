package Ejercicio2;

public enum Formato {
    WAV("wav"),
    MP3("mp3"),
    MIDI("midi"),
    AVI("avi"),
    MOV("mov"),
    MPG("mpg"),
    CDAUDIO("cdAudio"),
    DVD("dvd");
    private String extension;

    Formato(String extension){
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }
}

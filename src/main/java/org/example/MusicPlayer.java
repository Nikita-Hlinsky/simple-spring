package org.example;import org.springframework.context.annotation.Bean;import org.springframework.context.annotation.Configuration;@Configurationpublic class MusicPlayer {    private Music music;    public void setMusic(Music music) {        this.music = music;    }    public MusicPlayer() {}    public MusicPlayer(Music genre){        //Example IoC        this.music = genre;    }    @Bean    public void PlayMusic(){        System.out.println("Playing music " + music.getSong());    }}
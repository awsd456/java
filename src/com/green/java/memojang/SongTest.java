package com.green.java.memojang;

public class SongTest {
    public static void main(String[] args) {
        Song[] s = {  new Song("별헤는 밤", "유재하"),
                      new Song("비상", "임재범"),
                      new Song("비밀", "박완규")   };


        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].str());
        }
    }
}

class Song {

    String name;
    String singer;

    Song(String name, String singer) {
        this.name = name;
        this.singer = singer;
    }

    String str() {
        return String.format("Song{name:%s,singer:%s}", name, singer);
    }
}
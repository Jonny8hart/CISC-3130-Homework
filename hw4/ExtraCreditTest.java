public class ExtraCreditTest {
    public static void main(String[] args) {

        //Extra Credit 1 (Repeat)

        MusicPlayer player = new MusicPlayer();

        player.addSong("s1", "Night Drive", "Artist A");
        player.addSong("s2", "Slow Tide", "Artist B");
        player.addSong("s3", "Copper Sky", "Artist C");

        player.play("s3");

        System.out.println("Repeat OFF:");
        System.out.println(player.next());

        player.setRepeat(true);

        System.out.println("Repeat ON:");
        System.out.println(player.next());
        System.out.println("Now playing: " + player.nowPlaying());

        //Extra Credit 2 (Recently Played)

        MusicPlayer recentPlayer = new MusicPlayer();

        recentPlayer.addSong("s1", "Night Drive", "Artist A");
        recentPlayer.addSong("s2", "Slow Tide", "Artist B");
        recentPlayer.addSong("s3", "Copper Sky", "Artist C");

        recentPlayer.play("s1");
        recentPlayer.play("s2");
        recentPlayer.play("s3");
        recentPlayer.play("s1");

        System.out.println("Recently played: " + recentPlayer.recentlyPlayed());

        
System.out.println("--- Recently Played Limit Test ---");

MusicPlayer limitPlayer = new MusicPlayer();

// 10 Song Limit Test
for (int i = 1; i <= 11; i++) {
    String id = "s" + i;
    String title = "Song " + i;

    limitPlayer.addSong(id, title, "Artist");
    limitPlayer.play(id);
}

System.out.println("Recently played: " + limitPlayer.recentlyPlayed());

limitPlayer.play("s5");

System.out.println("After replaying Song 5: " + limitPlayer.recentlyPlayed());
    }
}

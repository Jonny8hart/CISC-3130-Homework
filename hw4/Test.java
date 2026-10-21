public class Test {
    public static void main(String[] args) {

        MusicPlayer player = new MusicPlayer();

        System.out.println("--- 1. Build the playlist ---");

        System.out.println(player.addSong("s1", "Night Drive", "Artist A"));
        System.out.println(player.addSong("s2", "Slow Tide", "Artist B"));
        System.out.println(player.addSong("s3", "Copper Sky", "Artist C"));
        System.out.println(player.addSong("s4", "Static Bloom", "Artist D"));
        System.out.println(player.addSong("s5", "Low Orbit", "Artist E"));
        System.out.println(player.addSong("s6", "Glass Rivers", "Artist F"));

        System.out.println("duplicate s3: " +
            player.addSong("s3", "Duplicate", "Artist G"));

        System.out.println("playlist: " + player.showPlaylist());

        System.out.println("--- 2. Look up songs ---");

        System.out.println("find s4: " + player.findSong("s4"));
        System.out.println("find s9: " + player.findSong("s9"));

        System.out.println("--- 3. Play and move forward ---");
        System.out.println("play s1: " + player.play("s1"));
        System.out.println("play s9: " + player.play("s9"));
        System.out.println("next: " + player.next());
        System.out.println("next: " + player.next());

        System.out.println("--- 4. Up next ---");

        System.out.println(player.queueLater("s5"));
        System.out.println(player.queueLater("s6"));
        System.out.println(player.queueNext("s1"));
        System.out.println("queue s9: " + player.queueLater("s9")); 

        System.out.println("up next: " + player.showUpNext()); 

        System.out.println("next: " + player.next());
        System.out.println("now playing: " + player.nowPlaying()); 
    }
}
import java.util.*;

public class MusicPlayer {
    private LinkedList<Song> playlist = new LinkedList<>();

    private HashMap<String,Song> library = new HashMap<>();

    private Deque<Song> upNext = new ArrayDeque<>();

    private Deque<Song> history = new ArrayDeque<>();

    private HashMap<String, Integer> playCounts = new HashMap<>();

    private Song current = null;

    public boolean addSong(String id, String title, String artist){
        if(library.containsKey(id)) {
            return false;
        }

        Song song = new Song(id, title, artist);

        playlist.addLast(song);
        library.put(id,song);

        return true;
    }

    public Song findSong(String id){
        return library.get(id);
    }

    public List<String> showPlaylist(){
        List<String> titles = new ArrayList<>();

        for(Song song : playlist) {
            titles.add(song.title);
        }

        return titles;
    }

    private void start(Song song){
        current = song;
        playCounts.merge(song.id, 1, Integer::sum);
    }

    public Song play(String id){
        Song song = library.get(id);

        if(song == null) {
            return null;
        }

        if (current != null) {
            history.push(current);
        }

        start(song);
        return song;
    }

    public int playCount(String id) {
        return playCounts.getOrDefault(id, 0);
    }

    public Song nowPlaying() {
        return current;
    }

    public boolean queueLater(String id) {
        Song song = library.get(id);

        if(song == null) {
            return false;
        }

        upNext.addLast(song);
        return true;
    }

    public boolean queueNext(String id) {
        Song song = library.get(id);

        if(song == null) {
            return false;
        }

        upNext.addFirst(song);
        return true;
    }

    public List<String> showUpNext() {
        List<String> titles = new ArrayList<>();

        for(Song song : upNext) {
            if(library.containsKey(song.id)) {
                titles.add(song.title);
            }
        }

        return titles;
    }

    public Song next(){
        Song nextSong = null;

        while(!upNext.isEmpty()) {
            Song song = upNext.pollFirst();

            if(library.containsKey(song.id)) {
                nextSong = song;
                break;
            }
        }

        if(nextSong == null) {
            if(current == null) {
                return null;
            }

            int index = playlist.indexOf(current);

            if (index == -1 || index + 1 >= playlist.size()) {
                return null;
            }

            nextSong = playlist.get(index + 1);
        }

        if(current != null) {
            history.push(current);
    }
    
        start(nextSong);
        return nextSong;
    }
}
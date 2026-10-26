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

    
    private void start(Song song) {
        current = song;
        playCounts.merge(song.id, 1, Integer::sum);

        // Remove song if already in recent
        recent.remove(song);

        // Add most recently played song to front
        recent.addFirst(song);

        // Keep only 10 most recent songs
        if (recent.size() > 10) {
            recent.removeLast();
        }
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


            if (index == -1) {
                return null;
            }
            
            //added repeat part for extra credit
            if (index + 1 >= playlist.size()) {
                if (repeat && !playlist.isEmpty()) {
                    nextSong = playlist.getFirst();
                } else {
                    return null;
                }
            } 
            else {
                nextSong = playlist.get(index + 1);
            }
        }

        if(current != null) {
            history.push(current);
    }
    
        start(nextSong);
        return nextSong;
    }

    public Song back(){
        Song previous = null;
        while(!history.isEmpty()) {
            Song song = history.pop();

            if(library.containsKey(song.id)) {
                previous = song;
                break;
            }
        }
        if(previous == null) {
            return null;
        }

        if(current != null) {
            upNext.addFirst(current);
        }

        start(previous);

        return previous;
    }

    public List<String> showHistory() {
        List<String> titles = new ArrayList<>();

        for(Song song : history) {
            if(library.containsKey(song.id)) {
                titles.add(song.title);
            }
        }

        return titles;
    }

    public boolean removeSong(String id){
        Song song = library.get(id);

        if(song == null) {
            return false;
        }

        if(current == song) {
            return false;
        }

        playlist.remove(song);
        library.remove(id);
        playCounts.remove(id);

        return true;
    }

    //Extra Credit 1 (Repeat)

    private boolean repeat = false;

    public void setRepeat(boolean enabled) {
        repeat = enabled;
    }

    //Extra Credit 2 (Recently Played)

    private Deque<Song> recent = new ArrayDeque<>();

    public List<String> recentlyPlayed() {
        List<String> titles = new ArrayList<>();

        for(Song song : recent) {
            if(library.containsKey(song.id)) {
                titles.add(song.title);
            }
        }

        return titles;
    }
}
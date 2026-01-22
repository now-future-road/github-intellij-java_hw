package Task12;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Bowling {
    private final class<Track> tracks;
    private final Queue<PairOfShoes>shoesShelf;

    public Bowling(int tracksNumber) {
        tracks = new LinkedList<>();
        for(int i = 0; i < tracksNumber; i++) {
            tracks.add(new Track(i));
        }
        shoesShelf = new LinkedList<>();
        for(int i = 0; i < 50; i++) {
            shoesShelf.add(new Shoes(size));
        }
    }

    public synchronized Track acquireTrack() {
        if(tracks.isEmpty()){
            return null;
        }
        Track track = tracks.poll();

        int price = 100 - tracks.size() *10;
        track.setPrice(price);
        return track;
    }

    public synchronized void releaseTrack(Track track) {
        if(track != null) {
            tracks.add(track);
        }

    }

    public synchronized Set<PairOfShoes> acquireShoes(int number) {
        if(shoesShelf.size() < number){
            return null;
        }
        Set<PairOfShoes> shoes = new HashSet<>();
        for (int i = 0; i < number; i++) {
            shoes.add(new PairOfShoes(42));
        }
        return shoes;
    }

    public synchronized void releaseShoes(Set<PairOfShoes> shoes) {
        if(shoes != null) {
            shoesShelf.addAll(shoes);
        }
        System. out. printf("В гардероб вернули%d pairs of shoes returned to the wardrobe\n", shoes.size());
    }
}


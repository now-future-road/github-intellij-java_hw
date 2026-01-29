package Task12;

private boolean StakeOutTrack() {
    track = bowling.acquireTrack();
    if (nonNull(track)) {
        System. out. printf("КомандаThe '%s 'command claimed track #%d for $%d\n", title, track.getNumber(), track.getPrice());
        return true;
    }
    System.out.printf("There was no entry for the '%s' command free track\n", title);
    return false;
}


package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int decrease = 0;
        int increase = 0;

        for (int i = startIndex; i < playList.length; i++) {
            if (playList[i].equals(selection))
                break;
            if (i + 1 > playList.length)
                i = 0;
            decrease++;
        }

        for (int i = startIndex; i < playList.length; i--) {
            if (playList[i].equals(selection))
                break;
            if (i - 1 < 0)
                i = playList.length;
            increase++;
        }

        if (decrease < increase) {
            return decrease;
        }
        return increase;

    }
    }


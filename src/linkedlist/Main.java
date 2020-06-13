package linkedlist;

import java.util.*;

public class Main {
    /*
        // Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()
     */
    private static ArrayList<Album>albums=new ArrayList<Album>();

    public static void main(String[] args) {
        Album album=new Album("Everything we know so far","Rihanna");
        album.addSong("Put the ring on me",3.54);
        album.addSong("Nothing is promised",4.23);
        album.addSong("new deal",3.56);
        album.addSong("anti",4.24);
        album.addSong("world",4.12);
        albums.add(album);

        album=new Album("Single lady","Beyonce");
        album.addSong("Put a ring on it",3.54);
        album.addSong("If I were a boy",5.12);
        album.addSong("paste my blood",3.59);
        album.addSong("pissed of",4.44);

        albums.add(album);
        LinkedList<Song>playList=new LinkedList<Song>();
        albums.get(0).addToPlayList("You cant do it right",playList);
        albums.get(0).addToPlayList("Holly run", playList);
        albums.get(0).addToPlayList("Speed King",playList);
        albums.get(1).addToPlayList(9,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(6,playList);
        albums.get(1).addToPlayList(24,playList);
        play(playList);

    }
    private static void play(LinkedList<Song>playList){
        Scanner scanner=new Scanner(System.in);
        boolean quit=false;
        boolean forward=true;
        ListIterator<Song>listIterator=playList.listIterator();
        if(playList.size()==0){
            System.out.println("No songs in playList");
            return;
        }else{
            System.out.println("Now playing "+ listIterator.next().toString());
            printMenu();
        }
        while(!quit){
            int action=scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("PlayList is complete");
                    quit=true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing"+listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end off the playList");
                        forward=false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing"+listIterator.previous().toString());

                    }else{
                        System.out.println("We are at the start of a playList");
                        forward=true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing "+ listIterator.previous().toString());
                            forward=false;
                        }else{
                            System.out.println("We are at the start of the list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now playing"+listIterator.next().toString());
                            forward=true;
                        }else{
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }

    }
    private static void printMenu(){
        System.out.println("Available actions:\n press");
        System.out.println("0 - to quit\n"+
        "1 - to play next song\n"+
        "2 - to play previous song\n"+
        "3 - to replay the current song\n"+
        "4 - to list songs in the playList\n"+
        "5 - to print available actions.");


    }
    private static void printList(LinkedList<Song>playList){
        Iterator<Song>iterator=playList.iterator();
        System.out.println("+++++++++++++++++++++++++");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("+++++++++++++++++++++++++");
    }

}

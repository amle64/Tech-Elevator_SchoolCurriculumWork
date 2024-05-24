package com.techelevator;

public class Airplane {
    private String planeNumber;

    private int totalFirstClassSeats;

    private int bookedFirstClassSeats;

    private int totalCoachSeats;

    private int bookedCoachSeats;

    //availablefirstclassseats
    //availablecoachseats


    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    public int availableFirstClassSeats(){
        return totalFirstClassSeats-bookedFirstClassSeats;
    }

    public int availableCoachSeats(){
        return totalCoachSeats-bookedCoachSeats;
    }


    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats){
        boolean status = false;
        if(forFirstClass==true&&totalNumberOfSeats<=totalFirstClassSeats){
            bookedFirstClassSeats+=totalNumberOfSeats;
            status = true;
        } else if(forFirstClass==true){
            status = false;
        } else if (forFirstClass!=true&&totalNumberOfSeats<=totalCoachSeats){
            bookedCoachSeats+=totalNumberOfSeats;
            status = true;
        } else if (forFirstClass!=true){
            status = false;
        }
        return status;
    }

    //Getters
    public String getPlaneNumber(){
        return planeNumber;
    }

    public int getTotalFirstClassSeats(){
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats(){
        return bookedFirstClassSeats;
    }

    public int getTotalCoachSeats(){
        return totalCoachSeats;
    }

    public int getBookedCoachSeats(){
        return bookedCoachSeats;
    }

    public int getAvailableFirstClassSeats(){
        return availableFirstClassSeats();
    }

    public int getAvailableCoachSeats(){
        return availableCoachSeats();
    }
    //availablefirstclassseats
    //availablecoachseats
}

package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class AuctionController {

    private AuctionDao auctionDao;


    public AuctionController() {
        this.auctionDao = new MemoryAuctionDao();
    }

    @RequestMapping(path="/auctions", method = RequestMethod.GET)
    public List<Auction> list(){

        List <Auction> auctions = auctionDao.getAuctions();
        return auctions;
    }

    /*@GetMapping
    public Auction get(@RequestParm Integer id){

        try{
            return auctionDao.getAuctionById(id);
        } catch(Exception e){
            return null;
        }

        //return null;
    }*/



    /*@Override
    public List<Auction> getAuctions() {
        return auctions;
    }*/
}

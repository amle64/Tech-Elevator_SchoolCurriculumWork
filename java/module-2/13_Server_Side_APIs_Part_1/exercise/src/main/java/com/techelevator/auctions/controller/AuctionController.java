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
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao auctionDao;


    public AuctionController() {
        this.auctionDao = new MemoryAuctionDao();
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Auction> list(
            @RequestParam (value = "title_like", required = false) String title_like,
            @RequestParam (value = "currentBid_lte", required = false) Double currentBid_lts)
            {
        //Price and title provided
        if(title_like != null && !title_like.isEmpty()&& currentBid_lts != null){
            return auctionDao.getAuctionsByTitleAndMaxBid(title_like, currentBid_lts);
        }
        //title provided
        else if (title_like != null && !title_like.isEmpty()){
            return auctionDao.getAuctionsByTitle(title_like);
        }
        //Price provided
        else if (currentBid_lts != null){
            return auctionDao.getAuctionsByMaxBid(currentBid_lts);
            }
        else {
            List <Auction> auctions = auctionDao.getAuctions();
            return auctions;
        }



    }


    @RequestMapping(path="{id}",method = RequestMethod.GET)
    public Auction get(@PathVariable int id){
        return auctionDao.getAuctionById(id);

    }

    @RequestMapping(method = RequestMethod.POST)
    public Auction create(@RequestBody Auction newAuction){
        if (newAuction != null) {
            auctionDao.createAuction(newAuction);
            return newAuction;
        }
        return null;
    }




}

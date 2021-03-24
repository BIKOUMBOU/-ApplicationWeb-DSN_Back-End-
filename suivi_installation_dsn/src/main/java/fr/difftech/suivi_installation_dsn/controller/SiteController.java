package fr.difftech.suivi_installation_dsn.controller;


import fr.difftech.suivi_installation_dsn.entity.Site;
import fr.difftech.suivi_installation_dsn.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SiteController {

    @Autowired
    private SiteService service;

    @PostMapping("/addSite")
    public Site addSite(@RequestBody Site site){
        return service.saveSite(site);
    }
    @PostMapping("/addSites")
    public List<Site> addSites(@RequestBody List<Site> sites){
        return service.saveSites(sites);
    }
    @GetMapping("/sites")
    public List<Site> findAllSites(){
        return service.getSites();
    }
    @GetMapping("/site/{id}")
    public Site findSitebyId(@PathVariable int id){
        return service.getSiteById(id);
    }
    @PutMapping("/updateSite")
    public Site updateSite(@RequestBody Site site){
        return service.saveSite(site);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteSite(@PathVariable int id){
        return service.deleteSite(id);
    }

}

package fr.difftech.suivi_installation_dsn.service;

import fr.difftech.suivi_installation_dsn.entity.Site;
import fr.difftech.suivi_installation_dsn.repository.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiteService {

    @Autowired
    private SiteRepository repository;

    public Site saveSite (Site site){
        return repository.save(site);
    }

    public List<Site> saveSites (List<Site> sites){
        return repository.saveAll(sites);
    }

    public List<Site> getSites(){
        return repository.findAll();
    }

    public Site getSiteById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteSite(int id){
        repository.deleteById(id);
        return("site supprimer appartir de l'id :" +id);
    }
    public Site updateSite(Site site){
        Site existingSite=repository.findById(site.getId()).orElse(null);
        existingSite.setPriorite(site.getPriorite());
        existingSite.setNom(site.getNom());
        existingSite.setSiren(site.getSiren());
        existingSite.setStatusinstal(site.getStatusinstal());
        existingSite.setHebergement(site.getHebergement());
        existingSite.setAcces(site.getAcces());
        existingSite.setResprojet(site.getResprojet());
        existingSite.setConsuldsn(site.getConsuldsn());
        existingSite.setVersprodige(site.getVersprodige());
        existingSite.setVersagirh(site.getVersagirh());
        existingSite.setMirth(site.getMirth());
        existingSite.setIfp(site.getIfp());
        existingSite.setWebserpH7(site.getWebserpH7());
        existingSite.setConfigprodige(site.getConfigprodige());
        existingSite.setConfigagirh(site.getConfigagirh());
        existingSite.setNomencdesabsences(site.getNomencdesabsences());
        existingSite.setNomencdestatuts(site.getNomencdestatuts());
        existingSite.setNomencdesemplois(site.getNomencdesemplois());
        return repository.save(existingSite);
    }



}

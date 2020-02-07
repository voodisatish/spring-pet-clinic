package com.vss.springpetclinic.bootstrap;

import com.vss.springpetclinic.model.Owner;
import com.vss.springpetclinic.model.Vet;
import com.vss.springpetclinic.services.OwnerService;
import com.vss.springpetclinic.services.VetService;
import com.vss.springpetclinic.services.map.OwnerServiceMap;
import com.vss.springpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Sateesh");
        owner1.setLastName("Voodi");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Madhuri");
        owner2.setLastName("Voodi");

        ownerService.save(owner2);

        System.out.println("Owners data loaded....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Rama Krishna");
        vet1.setLastName("Konidella");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Venu");
        vet2.setLastName("Allu");

        vetService.save(vet2);

        System.out.println("Vets data loaded....");
    }
}

package pl.pg.asobecki.wai.spring;

import io.spring.guides.gs_producing_web_service.Region;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by asobecki on 30.03.17.
 *
 * Region class you should generate using command:
 * xjc -d <path-to-destination-folder> <path-to-xsd-file>
 */
@Component
public class RegionRepository {
    private static final List<Region> regions = new ArrayList<Region>();

    @PostConstruct
    public void initData() {
        Region spain = new Region();
        spain.setName("Pomorskie");
        spain.setCapital("Gdansk");
        spain.setPopulation(11111);

        regions.add(spain);

        Region poland = new Region();
        poland.setName("Mazowieckie");
        poland.setCapital("Warszawa");
        poland.setPopulation(222222);

        regions.add(poland);

        Region uk = new Region();
        uk.setName("Małopolskie");
        uk.setCapital("Kraków");
        uk.setPopulation(333333);

        regions.add(uk);
    }

    public Region findRegion(String name) {
        Assert.notNull(name);

        Region result = null;

        for (Region Region : regions) {
            if (name.equals(Region.getName())) {
                result = Region;
            }
        }

        return result;
    }
}

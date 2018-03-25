package repository;

import it.unifi.cerm.playmorphia.PlayMorphia;
import models.LogDispositivo;
import org.bson.types.ObjectId;

import javax.inject.Inject;
import java.util.Date;

public class LogDispositivoRepository {
    @Inject
    private PlayMorphia morphia;

    public void save(LogDispositivo ld) {
        ld.setFecha(new Date());
        ld.setId(new ObjectId());
        morphia.datastore().save(ld);
    }

}

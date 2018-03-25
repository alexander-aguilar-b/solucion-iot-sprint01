package controllers;

import models.LogDispositivo;
import play.mvc.*;
import play.data.Form;
import repository.LogDispositivoRepository;

import javax.inject.Inject;

public class SolucionIoT  extends Controller {

    @Inject
    private LogDispositivoRepository logDispositivoRepository;

    public Result registrarEstadoDispositivo() {
        Form<LogDispositivo> form = Form.form(LogDispositivo.class).bindFromRequest();
        LogDispositivo logDispositivo = form.get();
        logDispositivoRepository.save(logDispositivo);
        return ok("El dato ha sido guardado correctamente en el sistema");
    }
}

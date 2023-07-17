package guru.springframework.spring6depinj.controllers.datasource;

import guru.springframework.spring6depinj.services.datasource.DataSourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {

    private final DataSourceService dataSourceService;

    public DataSourceController(@Qualifier("dataSourceService") DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public String getDataSource() {
        return "You are in " + dataSourceService.getDataSource() + " Environment.";
    }
}

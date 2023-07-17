package guru.springframework.spring6depinj.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
@Profile("prod")
@Service("dataSourceService")
public class DataSourceServiceImplPROD implements DataSourceService {
    @Override
    public String getDataSource() {
        return "Production";
    }
}

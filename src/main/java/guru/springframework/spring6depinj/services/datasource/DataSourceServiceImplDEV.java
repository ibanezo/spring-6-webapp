package guru.springframework.spring6depinj.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("dataSourceService")
public class DataSourceServiceImplDEV implements DataSourceService {
    @Override
    public String getDataSource() {
        return "Development";
    }
}

package guru.springframework.spring6depinj.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("dataSourceService")
public class DataSourceServiceImplQA implements DataSourceService {
    @Override
    public String getDataSource() {
        return "Quality Assurance";
    }
}

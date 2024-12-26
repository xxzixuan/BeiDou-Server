//package org.gms;
//
//import javax.sql.DataSource;
//
//import org.flywaydb.core.Flyway;
//import org.gms.manager.ServerManager;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.stereotype.Component;
//
//@Component
//public class FlywayRepair implements ApplicationListener<ContextRefreshedEvent> {
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent event) {
//        Flyway flyway = Flyway.configure().dataSource(ServerManager.getApplicationContext().getBean(DataSource.class)).load();
//        flyway.repair();
//    }
//}

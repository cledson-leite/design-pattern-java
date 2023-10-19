import dao.UserElasticDao;
import dao.UserMongoDao;
import dao.UserOracleDao;
import dao.UserPostgresDao;
import model.User;
import service.UserEJBService;
import service.UserRestService;
import service.UserService;
import service.UserSoapService;

public class App {
    public static void main(String[] args) throws Exception {
        User user = new User("Cledson Leite", "csbetsonline@gmail.com", "C13d50n");

        UserService rest = new UserRestService(new UserMongoDao());
        rest.save(user);

        UserService ejb = new UserEJBService(new UserElasticDao());
        ejb.save(user);

        UserService soap = new UserSoapService(new UserOracleDao());
        soap.save(user);

        rest = new UserRestService(new UserPostgresDao());
        rest.save(user);
    }
}

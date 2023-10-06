import org.example.Cliente;
import org.example.Dao.ClienteDao;
import org.example.Dao.ClienteDaoMock;
import org.example.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest (){
        ClienteDaoMock mock = new ClienteDaoMock();
        ClienteService service = new ClienteService(mock);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test (expected = UnsupportedOperationException.class)
    public void esperarErroNoSalvarTest (){
        ClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}

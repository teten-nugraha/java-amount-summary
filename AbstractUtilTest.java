@RunWith(SpringRunner.class)
public abstract class AbstractUtilTest extends AbstractJUnit4SpringContextTests {

    protected static final Logger LOG = LoggerFactory.getLogger(AbstractUtilTest.class);

    @Before
    public void setup() throws Exception {
        MockitoAnnotations.initMocks(this);
    }
}

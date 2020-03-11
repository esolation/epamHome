import com.epam.homeTask2.Logic.TaskLogic;
import com.epam.homeTask2.Logic.TaskLogicService;
import com.epam.homeTask2.ParseredText;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.*;
import org.junit.BeforeClass;
import org.junit.rules.TestName;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;


public class TestSecondTask {
    private static final Logger log = Logger.getLogger(TestSecondTask.class);
    @Rule public TestName name = new TestName();
    String text = null;
     static TaskLogic taskLogic;
     static ParseredText parseredText;



    @BeforeClass
    public static void initData(){
        String text = "Польский бренд SOLANO не уходит далеко в историю, но почти 30-летний опыт работы дизайнеров позволяет создать как классические современные коллекции для мужчин и женщин, так и специальные — для занятий спортом или предназначенные для детской аудитории. Очки SOLANO — пример отличного соотношения цены и качества. Для своих моделей изготовители ищут эффективные материалы, обеспечивающие клиентам максимальный комфорт и безопасность. Легкая пластиковая оправа, которую практически невозможно испортить, и поляризационные линзы, способные защитить глаза и кожу от солнца, — отличное сочетание. В сезоне-2020 для поляризационных линз выбран поликарбонат — материал достаточно стойкий, а кроме того не подвержен расслаиванию.\n";
        taskLogic = new TaskLogicService(text);
        parseredText = new ParseredText(text);
        BasicConfigurator.configure();
    }


    @Test
    public void testParser()throws Exception{
        log.info("Start:" + name.getMethodName());
        assertEquals(5, parseredText.getSentences().size());
    }

    @Test
    public void testSortSentence(){
        log.info("Start:" + name.getMethodName());
        List<String> sentence = new ArrayList<>(List.of("Польский бренд SOLANO не уходит далеко в историю, но почти 30-летний опыт работы дизайнеров позволяет создать как классические современные коллекции для мужчин и женщин, так и специальные — для занятий спортом или предназначенные для детской аудитории",
                "Легкая пластиковая оправа, которую практически невозможно испортить, и поляризационные линзы, способные защитить глаза и кожу от солнца, — отличное сочетание",
                "В сезоне-2020 для поляризационных линз выбран поликарбонат — материал достаточно стойкий, а кроме того не подвержен расслаиванию",
                "Для своих моделей изготовители ищут эффективные материалы, обеспечивающие клиентам максимальный комфорт и безопасность",
                "Очки SOLANO — пример отличного соотношения цены и качества"));
        assertEquals(sentence, taskLogic.doTaskLogic());
    }

    @After
    public void AfterTest(){
        log.info("Ending test");
    }
}

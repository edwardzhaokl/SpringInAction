import static org.mockito.Mockito.mock;

import com.springinaction.knights.BraveKnight;
import com.springinaction.knights.Quest;

/**
 * @author: zhaokl
 * @creationTime: 2019/9/26 17:27:05
 * @version: 1.0
 * @desc:
 **/
public class BraveKnightTest {

    public void knightShouldEmbarkOnQuest() {
        Quest mackQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mackQuest);

    }
}

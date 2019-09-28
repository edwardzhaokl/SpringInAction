import static org.mockito.Mockito.*;

import org.junit.Test;

import com.springinaction.knights.BraveKnight;
import com.springinaction.knights.Quest;

/**
 * @author: zhaokl
 * @creationTime: 2019/9/26 17:27:05
 * @version: 1.0
 * @desc:
 **/
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        // TODO: 以下理解不够
        // 验证: Quest的 mock 实现的 embark()方法仅被调用一次
        verify(mockQuest, times(1)).embark();
    }
}

package com.springinaction.knights;

import org.junit.*;
import static org.mockito.Mockito.*;

/**
 * author: zhaokl
 * <p>
 * created at: 17/03/2017 13:19
 * <p>
 * desc:
 */
public class BraveKnightTest{

	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest       mockQuest = mock(Quest.class);
		BraveKnight knight    = new BraveKnight(mockQuest);
		knight.embarkOnQuest();

		verify(mockQuest, times(1)).embark();
	}

}

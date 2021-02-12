package ohtuesimerkki;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class StatisticsTest {
	
	Reader readerStub = new Reader() {
		
		public List<Player> getPlayers() {
			ArrayList<Player> players = new ArrayList<>();
			players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
 
            return players;
		}
	};
	
	Statistics stats;

	@Before
	public void setUp() {
		stats = new Statistics(readerStub);
	}
	
	@Test
	public void searchReturnsCorrectPlayer() {
		assertTrue(stats.search("Semenko").getName().equals("Semenko"));
	}
	
	@Test
	public void searchReturnsNullIfNotFound() {
		assertEquals(null, stats.search("Amalia"));
	}
	
	@Test
	public void teamReturnsCorrectSizeList() {
		assertEquals(3, stats.team("EDM").size());
	}
	
	@Test
	public void topScorersReturnRightAmountOfPlayers() {
		assertEquals(3, stats.topScorers(3).size());
	}
	
	@Test
	public void topScorerReturnsBest() {
		assertTrue(stats.topScorers(1).get(0).getName().equals("Gretzky"));
	}
}

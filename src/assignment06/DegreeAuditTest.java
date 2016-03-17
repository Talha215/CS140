package assignment06;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DegreeAuditTest {

	@Test
	public void harpurTest() {
		ArrayList<CourseOffering> list = new ArrayList<CourseOffering>();
		HarpurAudit ha = new HarpurAudit();
		
		list.add(new CourseOffering("WRIT111", "Coming to Voice", 201620, new ArrayList<String>(Arrays.asList("J"))));
		list.add(new CourseOffering("name1", "title1", 201620, new ArrayList<String>(Arrays.asList("A"))));
		list.add(new CourseOffering("name2", "title2", 201620, new ArrayList<String>(Arrays.asList("L"))));
		list.add(new CourseOffering("name3", "title3", 201620, new ArrayList<String>(Arrays.asList("M"))));
		list.add(new CourseOffering("CS301", "title4", 201620, new ArrayList<String>(Arrays.asList("B"))));
		assertFalse(ha.writingSatisfied(list));
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("A", "C"))));
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("W", "B"))));
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("F", "J"))));
		assertTrue(ha.writingSatisfied(list));
		list.remove(7);
		list.remove(6);
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("W", "A"))));
		assertFalse(ha.writingSatisfied(list));
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("J", "B"))));
		assertTrue(ha.writingSatisfied(list));
		list.clear();
		
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("W", "F"))));
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("W", "B"))));
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("W", "A"))));
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("F", "J"))));
		assertFalse(ha.writingSatisfied(list));
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("J", "G"))));
		assertTrue(ha.writingSatisfied(list));
		
		list.clear();
		assertFalse(ha.writingSatisfied(list));
		
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("J", "G"))));
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("C", "H"))));
		assertFalse(ha.writingSatisfied(list));
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("J", "A"))));
		assertFalse(ha.writingSatisfied(list));
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("L", "C"))));
		assertTrue(ha.writingSatisfied(list));
		list.clear();
	}
	
	@Test
	public void csTest() {
		ArrayList<CourseOffering> list = new ArrayList<CourseOffering>();
		CSAudit ca = new CSAudit();
		
		list.add(new CourseOffering("WRIT111", "Coming to Voice", 201620, new ArrayList<String>(Arrays.asList("J"))));
		list.add(new CourseOffering("name1", "title1", 201620, new ArrayList<String>(Arrays.asList("A"))));
		list.add(new CourseOffering("name2", "title2", 201620, new ArrayList<String>(Arrays.asList("L"))));
		list.add(new CourseOffering("name3", "title3", 201620, new ArrayList<String>(Arrays.asList("M"))));
		list.add(new CourseOffering("name", "title4", 201620, new ArrayList<String>(Arrays.asList("B"))));
		assertFalse(ca.writingSatisfied(list));
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("A", "B"))));
		list.add(new CourseOffering("CS301", "title", 201620, new ArrayList<String>(Arrays.asList("J", "B"))));
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("F", "A"))));
		assertTrue(ca.writingSatisfied(list));
		list.remove(7);
		list.remove(6);
		list.remove(0);
		assertFalse(ca.writingSatisfied(list));
		list.add(new CourseOffering("name1", "title1", 201620, new ArrayList<String>(Arrays.asList("A", "C"))));
		assertFalse(ca.writingSatisfied(list));
		list.add(new CourseOffering("CS301", "title", 201620, new ArrayList<String>(Arrays.asList("J", "A"))));
		assertTrue(ca.writingSatisfied(list));
	}
	
	@Test
	public void somTest() {
		ArrayList<CourseOffering> list = new ArrayList<CourseOffering>();
		SOMAudit sa = new SOMAudit();
		
		assertFalse(sa.writingSatisfied(list));
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("F", "A"))));
		assertFalse(sa.writingSatisfied(list));
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("B", "A"))));
		assertFalse(sa.writingSatisfied(list));
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("C", "A"))));
		assertFalse(sa.writingSatisfied(list));
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("F", "J"))));
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("C", "A"))));
		assertTrue(sa.writingSatisfied(list));
		list.remove(3);
		list.add(new CourseOffering("name", "title", 201620, new ArrayList<String>(Arrays.asList("C", "A"))));
		assertTrue(sa.writingSatisfied(list));
	}

}

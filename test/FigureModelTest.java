package test;

import src.FigureModel;
import src.FigureModelView;

import org.junit.Test;
import static org.junit.Assert.*;

import javax.swing.ImageIcon;

public class FigureModelTest {
    @Test
    public void testObserver() {
        FigureModel observable = new FigureModel();
        FigureModelView observer = new FigureModelView();

        observable.addPropertyChangeListener(observer);

        observable.SetCaption("Test1");
        assertEquals(observer.GetCaption(), "Test1");
        assertEquals(observer.GetImage(), null);

        ImageIcon img = new ImageIcon();
        observable.SetImage(img);
        assertEquals(observer.GetCaption(), "Test1");
        assertEquals(observer.GetImage(), img);
    }

    @Test
    public void testFigureModelClass() {
        FigureModel fm = new FigureModel();

        assertEquals(fm.GetCaption(), null);
        assertEquals(fm.GetImage(), null);
        assertEquals(fm.isComplete(), false);

        fm.SetCaption("Test1");

        assertEquals(fm.GetCaption(), "Test1");
        assertEquals(fm.GetImage(), null);
        assertEquals(fm.isComplete(), false);

        ImageIcon img = new ImageIcon();
        fm.SetImage(img);

        assertEquals(fm.GetCaption(), "Test1");
        assertEquals(fm.GetImage(), img);
        assertEquals(fm.isComplete(), true);
    }

}

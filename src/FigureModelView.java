package src;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.ImageIcon;

public class FigureModelView implements PropertyChangeListener {
    private String _cap;
    private ImageIcon _img;
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName() == "cap") {
            this.SetCaption((String) evt.getNewValue());
        }
        else {
            this.SetImage((ImageIcon) evt.getNewValue());
        }
        
    }

    public ImageIcon GetImage() {
        return _img;
    }

    public void SetImage(ImageIcon img) {
        this._img = img;
    }

    public String GetCaption() {
        return _cap;
    }

    public void SetCaption(String cap) {
        this._cap = cap;
    }
}

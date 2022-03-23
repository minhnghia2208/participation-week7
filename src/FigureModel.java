package src;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import javax.swing.ImageIcon;

public class FigureModel {
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private String _cap;
    private ImageIcon _img;

    public FigureModel() {
        _cap = null;
        _img = null;
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        pcs.addPropertyChangeListener(pcl);
    }

    public void SetImage(ImageIcon img) {
        if (img == null) { 
            throw new IllegalArgumentException("Image must not be null");
        }
        pcs.firePropertyChange("img", _img, img);
        _img = img;
    }

    public ImageIcon GetImage() {
        return _img;
    }

    public void SetCaption(String cap) {
        if (cap == null || cap.trim().equals("")) {
            throw new IllegalArgumentException("Caption must not be null or empty");
        }
        pcs.firePropertyChange("cap", _cap, cap);
        _cap = cap;
    }

    public String GetCaption() {
        return _cap;
    }

    public boolean isComplete() {
        return _img != null && _cap != null && !(_cap.equals(""));
    }
}
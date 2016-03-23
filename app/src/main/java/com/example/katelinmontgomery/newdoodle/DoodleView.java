package com.example.katelinmontgomery.newdoodle;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Color;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.jar.Attributes;

import static android.graphics.Paint.*;


/**
 * Created by katelinmontgomery on 3/22/16.
 */
public class DoodleView extends View{

    public static DoodleView doodleView;
    //private Paint _paintDoodle = new Paint();
    private LinkedList<Path> _paths = new LinkedList<Path>();
    private LinkedList<Paint> _paintDoodles = new LinkedList<Paint>();

    private Path _pathUndid = null;
    private Paint _paintUndid = null;

    private Canvas _drawCanvas;
    private Bitmap _canvasBitmap;

    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private int opacity = 255;
    private int width = 15;



    public DoodleView(Context context) {
        super(context);
        init(null, 0);
    }

    public DoodleView(Context context, AttributeSet attrs){
        super(context, attrs);
        init(attrs, 0);
    }

    public DoodleView(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle){
        _paths.add(new Path());
        _paintDoodles.add(new Paint());
        _paintDoodles.getLast().setColor(Color.BLACK);
        _paintDoodles.getLast().setAntiAlias(true);
        _paintDoodles.getLast().setStyle(Style.STROKE);
        _paintDoodles.getLast().setStrokeWidth(30);
        doodleView = this;
    }



    @Override
    public boolean onTouchEvent(MotionEvent motionEvent){
        float touchX = motionEvent.getX();
        float touchY = motionEvent.getY();

        switch(motionEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
              //  _path.moveTo(touchX, touchY);
                _paintDoodles.add(new Paint());
                _paintDoodles.getLast().setStyle(Style.STROKE);
                _paintDoodles.getLast().setStrokeJoin(Join.ROUND);
                _paintDoodles.getLast().setStrokeCap(Cap.ROUND);
                _paintDoodles.getLast().setAntiAlias(true);
                _paths.add(new Path());
                _paths.getLast().moveTo(touchX, touchY);
                _paintDoodles.getLast().setColor(Color.rgb(red, green, blue));
                _paintDoodles.getLast().setStrokeWidth(width);
                _paintDoodles.getLast().setAlpha(opacity);
                break;
            case MotionEvent.ACTION_MOVE:
                _paths.getLast().lineTo(touchX, touchY);
                break;
            case MotionEvent.ACTION_UP:
//                _drawCanvas.drawPath(_drawPath, _drawPaint);
//                _drawPath.reset();
                break;
            default:
                return false;
        }

        invalidate();
        return true;
    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        _canvasBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        _drawCanvas = new Canvas(_canvasBitmap);
    }

    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);

        for(int i = 0; i < _paths.size(); i++){
            canvas.drawPath(_paths.get(i), _paintDoodles.get(i));
        }


//        canvas.drawBitmap(_canvasBitmap, 0, 0, _canvasPaint);
//        canvas.drawPath(_drawPath, _drawPaint);

    }

    public void setColor(int r, int g, int b) {
        red = r;
        green = g;
        blue = b;
    }

    public void setWidth(int w){
        width = w;
    }

    public void setOpacity(int o){
        opacity = o;
    }

    public void clear(){
        _paintDoodles = new LinkedList<Paint>();
        _paths = new LinkedList<Path>();
        invalidate();
    }

    public void undo(){
        if (!_paintDoodles.isEmpty() && !_paths.isEmpty()) {
            _paintUndid = _paintDoodles.getLast();
            _paintDoodles.remove(_paintDoodles.size() - 1);
            _pathUndid = _paths.getLast();
            _paths.remove(_paths.size() - 1);
            invalidate();
        }
    }

    public void redo(){
        if(_paintUndid != null && _pathUndid != null){
            _paintDoodles.add(_paintUndid);
            _paths.add(_pathUndid);
            _paintUndid = null;
            _pathUndid = null;
            invalidate();
        }
    }


}

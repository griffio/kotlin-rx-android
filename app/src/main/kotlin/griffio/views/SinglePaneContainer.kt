package griffio.views

import android.content.Context
import android.support.v7.appcompat.R
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.TextView
import griffio.views.ViewContainer
import butterknife.bindView

public class SinglePaneContainer(context : Context, attributeSet :AttributeSet) : FrameLayout (context, attributeSet), ViewContainer {

    val title : TextView by bindView(R.id.title)

    override fun text(text: String) {
        title.setText(text)
    }
}
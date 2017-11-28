package es.saladillo.alejandro.recycleview;


import android.os.Parcel;

public class Alumno extends ListItem {
    @Override
    public int getType() {
        return R.layout.item_alumno;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }

}

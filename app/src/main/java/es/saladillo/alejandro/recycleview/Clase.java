package es.saladillo.alejandro.recycleview;


import android.os.Parcel;

public class Clase extends ListItem {
    @Override
    public int getType() {
        return R.layout.item_curso;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}

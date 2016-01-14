package ng.prk.prkngandroid.ui.thread.base;

import ng.prk.prkngandroid.io.PrkngApiError;
import ng.prk.prkngandroid.model.LotCurrentStatus;

public interface MarkerInfoUpdateListener {
    public void setRemainingTime(long time);

    public void setCurrentStatus(LotCurrentStatus status, int capacity);

    public void onFailure(PrkngApiError e);
}

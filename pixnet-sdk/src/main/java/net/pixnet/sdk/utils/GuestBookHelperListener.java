package net.pixnet.sdk.utils;

import net.pixnet.sdk.proxy.DataProxy;
import net.pixnet.sdk.response.BasicResponse;
import net.pixnet.sdk.response.Guestbook;
import net.pixnet.sdk.response.GuestbookList;

/**
 * Created by Koi on 2014/8/22.
 */
public class GuestBookHelperListener implements DataProxy.DataProxyListener {

    @Override
    public void onError(String msg) {

    }

    @Override
    public boolean onDataResponse(BasicResponse response) {
        return false;
    }
    public void onGetGuestbookList(GuestbookList res){}
    public void onGetGuestbook(Guestbook res){}
}

package com.nowcoder.async;

import java.util.List;

/**
 * Created by sunchang on 2017/4/4.
 */
public interface EventHandler {
    void doHandle(EventModel model);
    //关注某些EventType
    List<EventType> getSupportEventTypes();
}

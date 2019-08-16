package com.example.designmode.test.all._10_state._02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QQContext {

    private IQQState state;
    // 保存好友
    private Map<String, ArrayList<String>> friendNameMap = new HashMap<>();
    // 好友数量
    private Map<String, Integer> friendCountMap = new HashMap<>();

    private List<IQQState> stateList = new ArrayList<>();

    public QQContext() {
        state = new QQStateNotRestriction();
        stateList.add(new QQStateNotRestriction());
    }

    /**
     * 添加好友
     *
     * @param userName
     * @param friendName
     */
    public void addFriend(String userName, String friendName) throws Exception {
        Integer count = friendCountMap.get(userName);
        ArrayList<String> arrayList = friendNameMap.get(userName);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(friendName);
        friendNameMap.put(userName, arrayList);
        friendCountMap.put(userName, count == null ? 1 : ++count);

        StateType[] values = StateType.values();

        if (count == null) count = 1;
        for (StateType stateType : values) {
            //筛选出了第一个
            if (count <= stateType.getCount()) {
                state = stateType.getClazz().newInstance();
                break;
            }
        }
    }

    /**
     * 发消息
     *
     * @param message
     */
    public void sendMessage(String message) {

        if (state != null) {
            state.onStateChange(message);
        }
    }

    enum StateType {
        QQStateNot(5, QQStateNotRestriction.class),
        QQState(6, QQStateRestriction.class);
        private int count;
        private Class<? extends IQQState> clazz;

        StateType(int count, Class<? extends IQQState> clazz) {
            this.count = count;
            this.clazz = clazz;
        }

        public int getCount() {
            return count;
        }

        public Class<? extends IQQState> getClazz() {
            return clazz;
        }
    }

}
package com.example.lenovo.zhoukaoyi.bean;

import java.util.List;

public class DuanziBean {

    /**
     * msg : 获取段子列表成功
     * code : 0
     * data : [{"commentNum":null,"content":"是王旭阳  二百五","createTime":"2018-05-14T19:10:04","imgUrls":null,"jid":2622,
     * "praiseNum":null,"shareNum":null,"uid":11196,"user":{"age":null,"fans":"null","follow":false,"icon":null,
     * "nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"王旭阳，怎么这么帅",
     * "createTime":"2018-05-14T15:40:31","imgUrls":null,"jid":2621,"praiseNum":null,"shareNum":null,"uid":11196,
     * "user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}},
     * {"commentNum":null,"content":"我觉得王旭阳好帅啊","createTime":"2018-05-14T15:37:40","imgUrls":null,"jid":2620,
     * "praiseNum":null,"shareNum":null,"uid":11196,"user":{"age":null,"fans":"null","follow":false,"icon":null,
     * "nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"我是王旭阳，和我玩贪玩蓝月，是兄弟，就打王旭阳",
     * "createTime":"2018-05-14T15:34:51","imgUrls":null,"jid":2619,"praiseNum":null,"shareNum":null,"uid":11196,
     * "user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}},
     * {"commentNum":null,"content":"\"fdfdsf\"","createTime":"2018-05-11T14:35:56","imgUrls":null,"jid":2618,
     * "praiseNum":null,"shareNum":null,"uid":12025,"user":{"age":null,"fans":"null","follow":false,"icon":null,
     * "nickname":"踩电门的猫","praiseNum":"null"}},{"commentNum":null,"content":"我是孙晶",
     * "createTime":"2018-05-11T10:50:29","imgUrls":"https://www.zhaoapi
     * .cn/images/quarter/1526007029403Screenshot_2018-03-19-13-23-00.png","jid":2617,"praiseNum":null,
     * "shareNum":null,"uid":12509,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi
     * .cn/images/1523839244885crop_photo.jpg","nickname":"%E5%BC%A0%E9%9C%B2","praiseNum":"null"}},
     * {"commentNum":null,"content":"我是孙晶","createTime":"2018-05-11T10:49:59","imgUrls":"https://www.zhaoapi
     * .cn/images/quarter/1526006999590Screenshot_2018-03-19-13-23-00.png","jid":2616,"praiseNum":null,
     * "shareNum":null,"uid":12509,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi
     * .cn/images/1523839244885crop_photo.jpg","nickname":"%E5%BC%A0%E9%9C%B2","praiseNum":"null"}},
     * {"commentNum":null,"content":"\"fdfdsf\"","createTime":"2018-05-11T10:44:10","imgUrls":null,"jid":2615,
     * "praiseNum":null,"shareNum":null,"uid":12025,"user":{"age":null,"fans":"null","follow":false,"icon":null,
     * "nickname":"踩电门的猫","praiseNum":"null"}},{"commentNum":null,"content":"\"fdfdsf\"",
     * "createTime":"2018-05-11T10:31:14","imgUrls":null,"jid":2614,"praiseNum":null,"shareNum":null,"uid":12025,
     * "user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":"踩电门的猫","praiseNum":"null"}},
     * {"commentNum":null,"content":"\"fdfdsf\"","createTime":"2018-05-11T09:33:42","imgUrls":null,"jid":2613,
     * "praiseNum":null,"shareNum":null,"uid":12025,"user":{"age":null,"fans":"null","follow":false,"icon":null,
     * "nickname":"踩电门的猫","praiseNum":"null"}}]
     */

    private String msg;
    private String code;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * commentNum : null
         * content : 是王旭阳  二百五
         * createTime : 2018-05-14T19:10:04
         * imgUrls : null
         * jid : 2622
         * praiseNum : null
         * shareNum : null
         * uid : 11196
         * user : {"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}
         */

        private Object commentNum;
        private String content;
        private String createTime;
        private Object imgUrls;
        private int jid;
        private Object praiseNum;
        private Object shareNum;
        private int uid;
        private UserBean user;

        public Object getCommentNum() {
            return commentNum;
        }

        public void setCommentNum(Object commentNum) {
            this.commentNum = commentNum;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getImgUrls() {
            return imgUrls;
        }

        public void setImgUrls(Object imgUrls) {
            this.imgUrls = imgUrls;
        }

        public int getJid() {
            return jid;
        }

        public void setJid(int jid) {
            this.jid = jid;
        }

        public Object getPraiseNum() {
            return praiseNum;
        }

        public void setPraiseNum(Object praiseNum) {
            this.praiseNum = praiseNum;
        }

        public Object getShareNum() {
            return shareNum;
        }

        public void setShareNum(Object shareNum) {
            this.shareNum = shareNum;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public static class UserBean {
            /**
             * age : null
             * fans : null
             * follow : false
             * icon : null
             * nickname : null
             * praiseNum : null
             */

            private Object age;
            private String fans;
            private boolean follow;
            private Object icon;
            private Object nickname;
            private String praiseNum;

            public Object getAge() {
                return age;
            }

            public void setAge(Object age) {
                this.age = age;
            }

            public String getFans() {
                return fans;
            }

            public void setFans(String fans) {
                this.fans = fans;
            }

            public boolean isFollow() {
                return follow;
            }

            public void setFollow(boolean follow) {
                this.follow = follow;
            }

            public Object getIcon() {
                return icon;
            }

            public void setIcon(Object icon) {
                this.icon = icon;
            }

            public Object getNickname() {
                return nickname;
            }

            public void setNickname(Object nickname) {
                this.nickname = nickname;
            }

            public String getPraiseNum() {
                return praiseNum;
            }

            public void setPraiseNum(String praiseNum) {
                this.praiseNum = praiseNum;
            }
        }
    }
}

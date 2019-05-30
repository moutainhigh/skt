package net.meyki.data.share.response;

/**
 * Created by Daimhim on 2017/3/6.
 */

public class GoodsDetail {

    /**
     * fans : {"orderSource":"0","goodsId":"8ec8264d7e214203bd55d5ec743c8994","type":"goodsDetail"}
     */

    private FansBean fans;

    public FansBean getFans() {
        return fans;
    }

    public void setFans(FansBean fans) {
        this.fans = fans;
    }

    public static class FansBean {
        /**
         * orderSource : 0
         * goodsId : 8ec8264d7e214203bd55d5ec743c8994
         * type : goodsDetail
         */

        private String orderSource;
        private String goodsId;
        private String type;

        public String getOrderSource() {
            return orderSource;
        }

        public void setOrderSource(String orderSource) {
            this.orderSource = orderSource;
        }

        public String getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(String goodsId) {
            this.goodsId = goodsId;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "FansBean{" +
                    "orderSource='" + orderSource + '\'' +
                    ", goodsId='" + goodsId + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "GoodsDetail{" +
                "fans=" + fans +
                '}';
    }
}

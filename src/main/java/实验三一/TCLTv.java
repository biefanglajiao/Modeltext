package 实验三一;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/8 9:56
 **/
public class TCLTv implements TV{
    private Object[] obj={"CCTV_1","CCTV_2","CCTV_3","CCTV_4","CCTV_5","CCTV_6","CCTV_7","CCTV_8","CCTV_9","CCTV_10","CCTV_11"};
    @Override
    public TVIterator tvIterator() {
        return new TCLIterator();
    }
    public class TCLIterator implements TVIterator{
        private int index;
        @Override
        public void setChannel(int i) {
            index = i;
        }

        @Override
        public void next() {
            if (index < longer()) {
                index++;
            }
        }

        @Override
        public void previous() {
            if (index > 0) {
                index--;
            }
        }

        @Override
        public boolean isLast() {
            return index == longer() - 1;
        }

        @Override
        public Object currentChannel() {
            return obj[index];
        }

        @Override
        public boolean isFirst() {
            return index == 0;
        }

        @Override
        public int longer() {
            return obj.length;
        }
    }
}

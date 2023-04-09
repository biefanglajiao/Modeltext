package 实验三一;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/8 9:59
 **/
public class SKYworthTV implements TV{
    private Object[] obj={"CCTV_1","CCTV_2","CCTV_3","CCTV_4","CCTV_5","CCTV_6","CCTV_7","CCTV_8","CCTV_9","CCTV_10","CCTV_11"};
    @Override
    public TVIterator tvIterator() {
        return new SKYworthIterator();
    }
    public class SKYworthIterator implements TVIterator{
       private int currentIndex;
        @Override
        public void setChannel(int i) {
            currentIndex = i;
        }

        @Override
        public void next() {
            if (currentIndex < longer()) {
                currentIndex++;
            }
        }

        @Override
        public void previous() {
            if (currentIndex > 0) {
                currentIndex--;
            }
        }

        @Override
        public boolean isLast() {
            return currentIndex == longer() - 1;
        }

        @Override
        public Object currentChannel() {
            return obj[currentIndex];
        }

        @Override
        public boolean isFirst() {
            return currentIndex == 0;
        }

        @Override
        public int longer() {
            return obj.length;
        }
    }
}

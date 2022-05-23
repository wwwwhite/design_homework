package Ite;

public class SkyworthTelevision implements Television{
    private Object[] obj = {"CCTV-1", "CCTV-2", "CCTV-3"};
    public TVIterator createIterator()
    {
        return new SkyworthIterator;
    }
    private class SkyworthIterator implements TVIterator
    {
        private int currentIndex=0;
        public void next()
        {
            if(currentIndex<obj.length)
            {
                currentIndex++;
            }

        }
        public void previous()
        {
            if(currentIndex>0)
                currentIndex--;
        }
        public Object currentChannel()
        {
            return obj[currentIndex];
        }
    }
}

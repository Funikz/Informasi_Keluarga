package BubbleClass;

/**
 *
 * @author Zidan
 */
public class Bubble {

    private DataRT[] arr;
    private int nElemen;
    private int bubble;
    private int insert;

    public Bubble(int max) {
        arr = new DataRT[max];
        nElemen = 0;
    }

    public int getInsert(int nokk, String kepalakeluarga, String anggota) {
        arr[nElemen] = new DataRT(nokk, kepalakeluarga, anggota);
        nElemen++;
        return insert;
    }

    public int bubble() {
        int batas, i;
        for (batas = nElemen - 1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if (arr[i].getNokk() > arr[i + 1].getNokk()) {
                    swap(i, i + 1);
                }
            }
        }
        return bubble;
    }

    public void swap(int one, int two) {
        DataRT temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    public String getDisplay() {
        String[] tampil = new String[20];
        int t = 0;
        while (t < nElemen) {
            tampil[t] = arr[t].displayDataRT();
            t++;
        }

        String tamp = (tampil[0] + "\n" + tampil[1] + "\n" + tampil[2] + "\n" + tampil[3]
                + "\n" + tampil[4] + "\n" + tampil[5] + "\n" + tampil[6] + "\n" + tampil[7]);
        return tamp;
    }

}

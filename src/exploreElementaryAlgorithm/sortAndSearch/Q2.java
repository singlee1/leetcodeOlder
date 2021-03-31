package exploreElementaryAlgorithm.sortAndSearch;

/**
 * @author singlee
 * @create 2020-05-18-11:28
 * 第一个错误的版本
 */
public class Q2 {
    public int firstBadVersion(int n) {
        int l=1,r=n;
        while (l<r){
            int mid=l+(l-r)/2;
            if(isBadVersion(mid)){
                r=mid;
            }else {
                l=mid+1;
            }
        }
        return l;
    }

    private boolean isBadVersion(int version) {
        return true;
    }


}

package Sort;

public class AllSort {
    private void bobuble(int[]arr){
        for(int bound=0;bound<arr.length;bound++){
            //控制趟数
            for(int j=arr.length-1;j<bound;j--){
                //每一趟，比较多少次
                if(arr[j-1]>arr[j]){//前面的大于后面的就交换（顺序）
                    swap(arr,j,j-1);
                }
            }
        }
    }
    private void swap(int[]arr,int x,int y){
        int tmp=arr[x];
        arr[x]=arr[y];
        arr[y]=tmp;
    }
    public void fastSort(int[]arr){
        fastSortHelp(arr,0,arr.length-1);
    }
    private void fastSortHelp(int[]arr,int left,int right){
        if(left>=right){
            return;
        }
        int ret=find(arr,left,right);
        fastSortHelp(arr,0,ret-1);
        fastSortHelp(arr,ret+1,right);
    }
    private int find(int[]arr,int left,int right){
        int index=right;
        int stand=arr[index];
        while (left<right){
            while(left<right&&arr[left]<=stand){
                left++;
            }
            while (left<right&&arr[right]>=stand){
                right--;
            }
            swap(arr,left,right);
        }
        swap(arr,left,index);
        return left;
    }
    public void mergerSort(int[]arr){
        mergerSortHelp(arr,0,arr.length);
    }
    private void mergerSortHelp(int[]arr,int left,int right){
        if( left>=right ||  right-left==1){
            return;
        }
        int mid=(left+right)/2;
        mergerSortHelp(arr,0,mid);
        mergerSortHelp(arr,mid,right);
        merger(arr,left,mid,right);
    }
    private void merger(int[]arr,int left,int mid,int right){
        int length=right-left;
        int[]newArr=new int[length];
        int index=0;
        int i=left;
        int j=mid;
        while (i<mid&&j<right){
           if(arr[i]<=arr[j]){
               newArr[index++]=arr[i++];
           }else {
               newArr[index++]=arr[j++];
           }
        }
        while (i<mid){
            newArr[index++]=arr[i++];
        }
        while (j<mid){
            newArr[index++]=arr[j++];
        }
        for(int k=0;k<length;k++){
            arr[left+k]=newArr[k];
        }
    }
    public  void heapSort(int[]arr){
        creatHeap(arr);
        for(int i=0;i<arr.length;i++){
            swap(arr,0,arr.length-i-1);
            shiftDown(arr,arr.length-i-1,0);
        }
    }
    private void creatHeap(int[]arr){
        for(int i=(arr.length-1-1)/2;i>=0;i--){
            shiftDown(arr,arr.length,i);
        }
    }
    private void shiftDown(int[]arr,int size,int index){
        int parent=index;
        int child=index*2+1;
        while(child<size){
            if(child+1<size&&arr[child+1]>arr[child]){
                child=child+1;
            }
            if(arr[child]>arr[parent]){
                swap(arr,child,parent);
            }else {
                break;
            }
            parent=child;
            child=child*2+1;
        }
    }
    public void insert(int[]arr){
        for(int bound=1;bound<arr.length;bound++){
            int tmp=arr[bound];
            int cur=bound-1;
            for (;cur>=0;cur--){
                if(arr[cur]>tmp){
                    arr[cur+1]=arr[cur];
                }else {
                    break;
                }
            }
            arr[cur+1]=tmp;
        }
    }
    public void selectSort(int[]arr){
        for(int bound=0;bound<arr.length;bound++){
            for(int cur=bound+1;cur<arr.length-1;cur++){
                if(arr[bound]>arr[cur]){
                    swap(arr,bound,cur);
                }
            }
        }
    }
    public void shellSort(int[]arr){
        int gap=arr.length;
        while(gap>1){
            insertSortGap(arr,gap);
            gap/=2;
        }
        insertSortGap(arr,1);
    }
    private void insertSortGap(int[]arr,int gap){
        for(int bound=1;bound<arr.length;bound++){
            int tmp=arr[bound];
            int cur=bound-gap;
            for(;cur>=0;cur-=gap){
                if(arr[cur]>bound){
                    arr[cur+gap]=arr[cur];
                }else {
                    break;
                }
            }
            arr[cur+gap]=tmp;
        }

    }
}

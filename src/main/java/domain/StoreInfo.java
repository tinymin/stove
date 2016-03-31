package domain;

/**
 * Created with IntelliJ IDEA.
 * User: tinymin
 * Date: 16. 3. 29.
 * Time: 오후 2:15
 * To change this template use File | Settings | File Templates.
 */
public class StoreInfo
{
    private String storeName;
    private String storeFloor;
    private String storeTel;
    private String depStoreName;
    private String depStoreBranch;
    private String depStoreBusinessHour;
    private String depStoreAddress;
    private String depStoreSiteURL;

    public StoreInfo(String storeName, String storeFloor, String depStoreName, String storeTel, String depStoreBranch, String depStoreBusinessHour, String depStoreAddress)
    {
        this(storeName, storeFloor, depStoreName, storeTel, depStoreBranch, depStoreBusinessHour, depStoreAddress, "");
    }

    public StoreInfo(String storeName, String storeFloor, String storeTel, String depStoreName, String depStoreBranch, String depStoreBusinessHour, String depStoreAddress, String depStoreSiteURL)
    {
        this.storeName = storeName;
        this.storeFloor = storeFloor;
        this.storeTel = storeTel;
        this.depStoreName = depStoreName;
        this.depStoreBranch = depStoreBranch;
        this.depStoreBusinessHour = depStoreBusinessHour;
        this.depStoreAddress = depStoreAddress;
        this.depStoreSiteURL = depStoreSiteURL;
    }

    public String getStoreName()
    {
        return storeName;
    }

    public String getStoreFloor()
    {
        return storeFloor;
    }

    public String getStoreTel()
    {
        return storeTel;
    }

    public String getDepStoreName()
    {
        return depStoreName;
    }

    public String getDepStoreBranch()
    {
        return depStoreBranch;
    }

    public String getDepStoreBusinessHour()
    {
        return depStoreBusinessHour;
    }

    public String getDepStoreAddress()
    {
        return depStoreAddress;
    }

    public String getDepStoreSiteURL()
    {
        return depStoreSiteURL;
    }

    public void setStoreName(String storeName)
    {
        this.storeName = storeName;
    }

    public void setStoreFloor(String storeFloor)
    {
        this.storeFloor = storeFloor;
    }

    public void setStoreTel(String storeTel)
    {
        this.storeTel = storeTel;
    }

    public void setDepStoreName(String depStoreName)
    {
        this.depStoreName = depStoreName;
    }

    public void setDepStoreBranch(String depStoreBranch)
    {
        this.depStoreBranch = depStoreBranch;
    }

    public void setDepStoreBusinessHour(String depStoreBusinessHour)
    {
        this.depStoreBusinessHour = depStoreBusinessHour;
    }

    public void setDepStoreAddress(String depStoreAddress)
    {
        this.depStoreAddress = depStoreAddress;
    }

    public void setDepStoreSiteURL(String depStoreSiteURL)
    {
        this.depStoreSiteURL = depStoreSiteURL;
    }
}

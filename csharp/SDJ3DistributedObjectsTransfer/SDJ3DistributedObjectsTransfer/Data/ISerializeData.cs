namespace SDJ3DistributedObjectsTransfer.Data
{
    public interface ISerializeData <T>
    {
        string Serialize(T t);
        T Deserialize(string arg);
    }
}
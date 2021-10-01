using System.IO;
using System.Text.Json;
using SDJ3DistributedObjectsTransfer.Model.CatObj;

namespace SDJ3DistributedObjectsTransfer.Data.Impl
{
    public class SerializeJSONData : ISerializeData<Cat>
    {
        public string Serialize(Cat t)
        {
            string toJson = JsonSerializer.Serialize(t, new JsonSerializerOptions(){PropertyNamingPolicy = JsonNamingPolicy.CamelCase});
            File.WriteAllText("cat.json", toJson);
            return toJson;
        }

        public Cat Deserialize(string arg)
        {
            Cat fromJson = JsonSerializer.Deserialize<Cat>(arg, new JsonSerializerOptions(){PropertyNamingPolicy = JsonNamingPolicy.CamelCase});
            return fromJson;
        }
    }
}
using System;
using System.IO;
using System.Text.Json;
using SDJ3DistributedObjectsTransfer.Data;
using SDJ3DistributedObjectsTransfer.Data.Impl;
using SDJ3DistributedObjectsTransfer.Model.CatObj;

namespace SDJ3DistributedObjectsTransfer
{
    class Program
    {
        static void Main(string[] args)
        {
            ISerializeData<Cat> serializeData = new SerializeJSONData();
            
            Console.WriteLine("Getting cat data....");

            string content = File.ReadAllText("C:\\Users\\kkash\\RiderProjects\\DistributedObjectsTransfer\\csharp\\SDJ3DistributedObjectsTransfer\\SDJ3DistributedObjectsTransfer\\cat.json");
            
            Cat cat = serializeData.Deserialize(content);
            
            Console.WriteLine(cat.ToString());
            
            Console.WriteLine("Sending cats....");

            Cat cat2 = new Cat()
            {
                Name = "one",
                Age = 33,
                Breed = "new",
                Color = "gg",
                IsFriendly = false,
                Lives = 1,
                TotalScratch = 566
            };
            string to = serializeData.Serialize(cat2);
            File.WriteAllText("C:\\Users\\kkash\\RiderProjects\\DistributedObjectsTransfer\\csharp\\SDJ3DistributedObjectsTransfer\\SDJ3DistributedObjectsTransfer\\cat.json",to);

        }
    }
}
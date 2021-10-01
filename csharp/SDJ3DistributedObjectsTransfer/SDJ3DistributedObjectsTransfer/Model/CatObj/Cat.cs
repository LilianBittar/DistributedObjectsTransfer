namespace SDJ3DistributedObjectsTransfer.Model.CatObj
{
    public class Cat
    {
        public string Name { get; set; }
        public string Breed { get; set; }
        public int Lives { get; set; }
        public int Age { get; set; }
        public int TotalScratch { get; set; }
        public string Color { get; set; }
        public bool IsFriendly { get; set; }

        public override string ToString()
        {
            return $"{Name}, {Breed}, {Lives}, {Age}, {TotalScratch}, {Color}, {IsFriendly}";
        }
    }
}
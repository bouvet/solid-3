using System.Collections.Generic;

namespace Solid.LSP.Example1
{
    public class BirdService
    {
        public void FeedThemAll(List<Bird> birds)
        {
            birds.ForEach(bird => bird.Eat());
        }

        public void LetThemGo(List<Bird> birds)
        {
            foreach (Bird bird in birds)
            {
                bird.Fly();
            }
        }
    }
}

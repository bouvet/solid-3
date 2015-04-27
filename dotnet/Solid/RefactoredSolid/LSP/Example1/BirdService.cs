using System.Collections.Generic;

namespace RefactoredSolid.LSP.Example1
{
    public class BirdService
    {
        public void FeedThemAll(List<Bird> birds)
        {
            birds.ForEach(bird => bird.Eat());
        }

        public void LetThemGo(List<FlyingBird> flyingBirds)
        {
            flyingBirds.ForEach(bird => bird.Fly());
        }
    }
}

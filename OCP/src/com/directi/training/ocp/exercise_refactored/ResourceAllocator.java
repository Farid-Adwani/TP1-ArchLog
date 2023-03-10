package com.directi.training.ocp.exercice_refactored;

public class ResourceAllocator
{
    public int allocate(Resource resource)
    {
        int resourceId = resource.findFree();
        resource.markBusy(resourceId);
        return resourceId;
    }

    public void free(Resource resource, int resourceId)
    {
        resource.markFree(resourceId);
    }
}

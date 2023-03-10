package com.directi.training.ocp.exercice_refactored;

public interface Resource
{
    int findFree();

    void markBusy(int resourceId);

    void markFree(int resourceId);
}

package com.directi.training.srp.exercice_refactored;

public class CarManager
{
    private final carRepo _carRepo;
    private final CarFormatter _carFormatter;
    private final CarRater _carRater;

    public CarManager(CarRepo carRepo, CarFormatter carFormatter, CarRater carRater)
    {
        _carRepo = carRepo;
        _carFormatter = carFormatter;
        _carRater = carRater;
    }

    public Car getCarById(final String carId)
    {
        return _carRepo.findById(carId);
    }

    public String getCarsNames()
    {
        return _carFormatter.getCarsNames(_carRepo.findAll());
    }

    public Car getBestCar()
    {
        return _carRater.getBestCar(_carRepo.findAll());
    }
}

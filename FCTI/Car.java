package com.FCTI;

import java.io.PrintStream;
import java.util.Scanner;


public class Car {

//    public enum EngineType {
//        INLINE,
//        ROTARY,
//        V,
//        W,
//        BOXER,
//        DIESEL,
//        ELECTRIC
//    }

//Vehicle Description
    private String make;
    private String model;

//Vehicle Characteristics
    private int curbWeight;
    private int topSpeed;

//Engine Characteristics
    private int revMax;
    private int maxTorque;
    private int maxHP;
    private int parasiticDriveTrainLoss;
    private boolean naturalAspiration;
    private boolean forcedInduction;
    private float compressionRatio;

//Engine Size
    private int displacement;
    private float bore;
    private float stroke;
//Engine Type
    private String engine;
    private int noCylinders;

//Environment
    private int ambientTemp;
    private int altitude;
    private float atmosphericPressure;
    private float humidity;

//Aero
    private float dragCoefficient;
    private float downforce;

//Forced Induction
    private boolean turboCharger;
    private int turboTrim_mm;

    private float boostPressurePSI;
    private boolean posDisplacementSC;
    private boolean centrifugalSC;
    private int displacementSC;
    private int displacementTC;

//Tire Parameters
    private String tireCompound;
    private float tireDiameter;
    private int tireSidewall;
    private int tireWidth;
    private int treadWear;
    private float tirePressure;

//Transmission
    private boolean isSequential;
    private boolean isSequentialStraightCut;
    private boolean isTwinClutch;
    private boolean isAutomatic;
    private int noGears;
    private int entryPoint1st;
    private int entryPoint2nd;
    private int entryPoint3rd;
    private int entryPoint4th;
    private int entryPoint5th;
    private int entryPoint6th;
    private int entryPoint7th;
    private int redLine1st;
    private int redLine2nd;
    private int redLine3rd;
    private int redLine4th;
    private int redLine5th;
    private int redLine6th;
    private int redLine7th;
    private float finalDriveRatio;

//Differential
    private boolean isTorsen;
    private boolean isSpool;
    private boolean isOpenDiff;
    private boolean isViscous;
    private boolean istorqueVectoring;
    private boolean isLocking;





//Empty Constructor
    public Car() {}


//Constructor using 2 variables
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        forcedInduction = true;
    }

//Constructor using 3 variables
    public Car(int displacement, float bore, float stroke, String engine, int noCylinders) {
        this.displacement = displacement;
        this.bore = bore;
        this.stroke = stroke;
        this.engine = engine;
        this.noCylinders = noCylinders;
    }






//A method that returns a string
    public PrintStream getDescription() {
        return System.out.printf("Vehicle Make: %s  Vehicle Model: %s ", this.make, this.model);
    }

    public PrintStream getEngine() {
        return System.out.printf("Engine Type: %s Engine Displacement: %s cc Engine Bore: %s mm Engine Stroke: %s mm Cylinders: %s ", this.engine, this.displacement, this.bore, this.stroke, this.noCylinders);

    }
//A method that returns a boolean
    public boolean getForcedInduction() {
        return forcedInduction;
    }

    public void setBoostPressure(float PSI) {
        this.boostPressurePSI = boostPressurePSI;
    }

    public void setTirePressure(float tirePSI) {
        this.tirePressure = tirePressure;
    }




}

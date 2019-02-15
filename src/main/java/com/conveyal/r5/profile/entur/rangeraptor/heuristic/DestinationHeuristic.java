package com.conveyal.r5.profile.entur.rangeraptor.heuristic;


public interface DestinationHeuristic {

    int getMinTravelTime();

    int getMinNumTransfers();

    int getMinCost();
}

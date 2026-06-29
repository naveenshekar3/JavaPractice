package javaPrograms;

import java.util.Arrays;

public class InitoFirstRound {
    public static void main(String[] args) {
//        Given a set of conferences with their start and end times, the task is to find the minimum number of conference rooms required to schedule all conferences without any overlap. We are given two arrays that represent the start and end times of each conference.
//        Input2: Input: start[] = {900, 905, 950, 1100, 1500, 1800},
//        end[] = {910, 1200, 1120, 1130, 1900, 2000}
//        Output = 3

        int start[] = {900, 905, 950, 1100, 1500, 1800};
        int end[] = {910, 1200, 1120, 1130, 1900, 2000}; //output = 3

        Arrays.sort(start);
        Arrays.sort(end);
        int roomsNeeded = 0;
        int maxRooms = 0;
        int i=0;
        int j=0;

        while (i< start.length && j<start.length){
            if (start[i]<end[j]){
                roomsNeeded++;
                maxRooms = Math.max(maxRooms,roomsNeeded);
                i++;
            }
            else {
                roomsNeeded--;
                j++;
            }
        }
        System.out.println(maxRooms);
    }
}

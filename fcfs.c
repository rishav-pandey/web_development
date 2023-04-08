#include <stdio.h>

int main()
{
    int n; // Number of process
    printf("Enter the number of process :");
    scanf("%d", &n);

    int at[n]; // Arrival time
    int bt[n]; // Burst time
    int ct[n]; // Complition time
    int tt[n]; // Turnaround time
    int wt[n]; // Waiting time

    printf("\nEnter the Arrival Time and Burst Time :\n");
    for (int i = 0; i < n; i++)
    {
        printf("Process %d :", i + 1);
        scanf("%d%d", &at[i], &bt[i]);
    }

    // Calculation of completion time
    ct[0] = at[0] + bt[0];
    for (int i = 1; i < n; i++)
    {
        ct[i] = ct[i - 1] + bt[i];
    }

    // Calculation of turnaround time
    for (int i = 0; i < n; i++)
    {
        tt[i] = ct[i] - at[i];
    }

    // Calculation of waiting time
    for (int i = 0; i < n; i++)
    {
        wt[i] = tt[i] - bt[i];
    }

    printf("\nCompletion Time\tTurnaround Time\tWaiting Time\n");
    int total_wt = 0, total_tt = 0;
    for (int i = 0; i < n; i++)
    {
        total_wt += wt[i];
        total_tt += tt[i];
        printf("  %5d\t\t    %5d\t\t    %5d\n", ct[i], tt[i], wt[i]);
    }

    float avg_wt, avg_tt;
    avg_wt = total_wt / (float)n;
    avg_tt = total_tt / (float)n;

    printf("\nAverage Turnaround Time : %f\n", avg_tt);
    printf("Average Waiting Time    : %f\n", avg_wt);

    return 0;
}
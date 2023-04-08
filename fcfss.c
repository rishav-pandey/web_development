#include <stdio.h>
struct FCFS
{
    int pid, AT, BT, CT, TAT, WT;
};
int main()
{
    int n;
    int cpu = 0;
    printf("Enter the number of processes: ");
    scanf("%d", &n);
    struct FCFS p[n];
    printf("Enter Process Id following with AT and BT:\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &p[i].pid);
        scanf("%d", &p[i].AT);
        scanf("%d", &p[i].BT);
    }
    struct FCFS temp;
    printf("Sequence is ");
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (p[i].AT > p[j].AT)
            {
                temp = p[i];
                p[i] = p[j];
                p[j] = temp;
            }
            else if (p[i].AT == p[j].AT)
            {
                if (p[i].pid > p[j].pid)
                {
                    temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
    }
    void sort(struct FCFS * p, int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (p[i].pid > p[j].pid)
                {
                    temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
    }
    for (int i = 0; i < n; i++)
    {
        printf("P%d ", p[i].pid);
    }
    p[0].CT = p[0].BT + p[0].AT;
    for (int i = 1; i < n; i++)
    {
        if (p[i].AT > p[i - 1].CT)
            p[i].CT = p[i].BT + p[i].AT;
        else
            p[i].CT = p[i].BT + p[i - 1].CT;
    }
    for (int i = 0; i < n; i++)
    {
        p[i].TAT = p[i].CT - p[i].AT;
        p[i].WT = p[i].TAT - p[i].BT;
    }

    float avgTAT = 0, avgWT = 0;
    printf("\nDATA:\nPid\tAT\tBT\tCT\tTAT\tWT\n");
    for (int i = 0; i < n; i++)
    {
        sort(p, n);
        avgTAT += p[i].TAT;
        avgWT += p[i].WT;

        printf("%d\t", p[i].pid);
        printf("%d\t", p[i].AT);
        printf("%d\t", p[i].BT);
        printf("%d\t", p[i].CT);
        printf("%d\t", p[i].TAT);
        printf("%d\t", p[i].WT);
        // printf("%d\t",p[i].RT);
        printf("\n");
    }
    avgTAT /= n;
    avgWT /= n;
    printf("\t\t\tAvg TAT:%.3f Avg WT:%.3f\n", avgTAT, avgWT);
}
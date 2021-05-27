package day_32_arrays_split;

import java.util.Arrays;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("----- Starting deployment if esty app to AWS zones --------");

        String[] zonesToDeploy = zones.split(",");
        for (String eachZones : zonesToDeploy) {
            System.out.println("Deploying [" + app + "] to " + eachZones + " ... ");
            System.out.println("Deployment completed for " + eachZones + " ... ");
        }
     /*
      Deploying etsy to us-east-1...
      Deployment completed for us-east-1


      Deploying etsy to us-west-1...
      Deployment completed for us-west-1

      Deploying etsy to us-west-2...
      Deployment completed for us-west-2
       ---All deployments complete----
      */
        System.out.println("--- All deployment complete, traffic enabled -----");












    }
}

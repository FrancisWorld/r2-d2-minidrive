package com.katydevs.r2_d2_minidrive.Service;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

public class S3ClientService {
    public void S3Uploader(String chaveObj, String nomeObj) {
        
        Region clientRegion = Region.US_EAST_1;

        String bucketName = System.getenv("BUCKET_NAME");
        String bucketToken = System.getenv("BUCKET_TOKEN");
        String bucketSecret = System.getenv("BUCKET_SECRET");
        String bucketKey = System.getenv("BUCKET_KEY");
        String bucketUrl = System.getenv("BUCKET_URL");


        try {
            S3Client s3Client = S3Client.builder().region(clientRegion).build();

            

        } catch(Exception e) {
            System.out.println("Error: " + e);
        }
     
    }
}

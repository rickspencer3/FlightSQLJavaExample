package com.example.helloworld;

// Import Apache Arrow Flight SQL classes
import org.apache.arrow.flight.*;
import org.apache.arrow.flight.sql.FlightSqlClient;
import org.apache.arrow.memory.BufferAllocator;
import org.apache.arrow.memory.RootAllocator;
import org.apache.arrow.vector.VectorSchemaRoot;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String host = "us-east-1-1.aws.cloud2.influxdata.com";
        // // Use Apache Arrow Flight SQL classes here
        Location location = Location.forGrpcInsecure(host, 50051);
        BufferAllocator allocator = new RootAllocator(Long.MAX_VALUE);
        FlightClient flightClient = FlightClient.builder(allocator, location).build();
        FlightSqlClient sqlClient = new FlightSqlClient(flightClient);
    }
}
